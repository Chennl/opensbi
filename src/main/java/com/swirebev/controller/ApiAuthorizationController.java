package com.swirebev.controller;

import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.oltu.oauth2.as.issuer.MD5Generator;
import org.apache.oltu.oauth2.as.issuer.OAuthIssuerImpl;
import org.apache.oltu.oauth2.as.request.OAuthAuthzRequest;
import org.apache.oltu.oauth2.as.request.OAuthTokenRequest;
import org.apache.oltu.oauth2.as.response.OAuthASResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.error.OAuthError;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.OAuthResponse;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.apache.oltu.oauth2.common.message.types.ParameterStyle;
import org.apache.oltu.oauth2.common.message.types.ResponseType;
import org.apache.oltu.oauth2.rs.request.OAuthAccessResourceRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.swirebev.pojo.AuthUserInfo;
@Controller
public class ApiAuthorizationController {
	 private static final Logger log = LoggerFactory.getLogger(ApiAuthorizationController.class);
	 
	 @RequestMapping("/authorize")
	 public ModelAndView  authorize(HttpServletRequest request) 
			 throws OAuthSystemException, OAuthProblemException, URISyntaxException {
			ModelAndView mav = new ModelAndView();
			// 构建OAuth请求
		       OAuthAuthzRequest oAuthzRequest = new OAuthAuthzRequest(request);
		    // 获取OAuth客户端Id
		       String clientId = oAuthzRequest.getClientId();
		    // 校验客户端Id是否正确
		       if (!checkClientId(clientId)) {
		           mav.addObject("msg", "无效的客户ID");
		           mav.setViewName("forward:/WEB-INF/oauth/authorizefail");
		           return mav;
		       }

		       //检查用户是否登陆和同意授权，如何还没登陆则跳转至登陆页面,然后进行授权提示
		       //待开发。。。
		       
		       //生成授权码
		       String authCode = null;
		       String responseType = oAuthzRequest.getParam(OAuth.OAUTH_RESPONSE_TYPE);
		       //ResponseType仅支持CODE和TOKEN
		       if(responseType.equals(ResponseType.CODE.toString())){
		           OAuthIssuerImpl oAuthIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
		           authCode = oAuthIssuerImpl.authorizationCode();
		           System.out.println("授权码="+authCode);
		       }
		     //获取客户端重定向地址
		       String redirectURI = oAuthzRequest.getParam(OAuth.OAUTH_REDIRECT_URI);
		       mav.setViewName("redirect:"+redirectURI+"?code="+authCode);
		       return mav;
		}
	 @RequestMapping("/accesstoken")

	 public ResponseEntity<String> accessToken(HttpServletRequest request) throws OAuthSystemException, OAuthProblemException{
		//构建OAuth请求
	       OAuthTokenRequest tokenRequest = new OAuthTokenRequest(request);
	       //获取OAuth客户端Id
	       String clientId = tokenRequest.getClientId();
	       //校验客户端Id是否正确
	       if(!checkClientId(clientId)){
	           OAuthResponse oAuthResponse = OAuthASResponse
	                  .errorResponse(HttpServletResponse.SC_BAD_REQUEST)
	                  .setError(OAuthError.TokenResponse.INVALID_CLIENT)
	                  .setErrorDescription("无效的客户端Id")
	                  .buildJSONMessage();
	           System.out.println(oAuthResponse.getBody());
	           return new ResponseEntity<String>(oAuthResponse.getBody(), HttpStatus.valueOf(oAuthResponse.getResponseStatus()));
	       }
	       //检查客户端安全KEY是否正确
	       if(!checkClientSecret(tokenRequest.getClientSecret())){
	           OAuthResponse response = OAuthResponse.errorResponse(HttpServletResponse.SC_UNAUTHORIZED)
	                     .setError(OAuthError.TokenResponse.UNAUTHORIZED_CLIENT)
	                     .setErrorDescription("客户端安全KEY认证不通过")
	                      .buildJSONMessage();
	           return new ResponseEntity<String>(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
	       }
	     //检查redirect_uri是否和认证的一致
	       if(!checkRedirectUri(tokenRequest.getRedirectURI())){
	           OAuthResponse response = OAuthResponse.errorResponse(HttpServletResponse.SC_UNAUTHORIZED)
	                  .setError(OAuthError.TokenResponse.UNAUTHORIZED_CLIENT)
	                  .setErrorDescription("客户端认证不通过")
	                  .buildJSONMessage();
	           return new ResponseEntity<String>(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));

	       }
	       //验证类型，有AUTHORIZATION_CODE/PASSWORD/REFRESH_TOKEN/CLIENT_CREDENTIALS

	        if(tokenRequest.getParam(OAuth.OAUTH_GRANT_TYPE).equals(GrantType.AUTHORIZATION_CODE.toString())){

	           String authCode = tokenRequest.getParam(OAuth.OAUTH_CODE);

	           if(!checkAuthCode(authCode)){
	              OAuthResponse response = OAuthResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
	                     .setError(OAuthError.TokenResponse.INVALID_GRANT)
	                     .setErrorDescription("错误的授权码")  
	                     .buildJSONMessage();

	              return new ResponseEntity<String>(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));

	           }

	           //生成访问令牌
	           OAuthIssuerImpl authIssuerImpl = new OAuthIssuerImpl(new MD5Generator());
	           String accessToken = authIssuerImpl.accessToken();
	           
	           //生成OAuth响应
	           OAuthResponse response = OAuthASResponse
	                  .tokenResponse(HttpServletResponse.SC_OK)
	                  .setAccessToken(accessToken)
	                  .setExpiresIn("1000")
	                  .buildJSONMessage();
	           System.out.println(response.getBody());

//	         HttpHeaders headers = new HttpHeaders();
//	         headers.setContentType(MediaType.APPLICATION_JSON);
	         return new ResponseEntity<String>(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));
	       }

	        OAuthResponse response = OAuthResponse.errorResponse(HttpServletResponse.SC_BAD_REQUEST)
	                .setError(OAuthError.TokenResponse.UNSUPPORTED_GRANT_TYPE)
	                .setErrorDescription("不支持此授权类型")  
	                 .buildJSONMessage();
	         return new ResponseEntity<String>(response.getBody(), HttpStatus.valueOf(response.getResponseStatus()));

	 }
	 @RequestMapping("/resource")
	 @ResponseBody
	 public AuthUserInfo resource(HttpServletRequest request, HttpServletResponse response) throws OAuthSystemException, OAuthProblemException {

		 // Make the OAuth Request out of this request and validate it
	     // Specify where you expect OAuth access token (request header, body
	     // or query string)

	     OAuthAccessResourceRequest oauthRequest = 
	 new OAuthAccessResourceRequest(request, ParameterStyle.QUERY);
	  
	     // Get the access token
	     String accessToken = oauthRequest.getAccessToken();
	     // ... validate access token
	     //验证通过返回用户信息
	     return new AuthUserInfo("test", "测试");

	 }

	 
	 //private methods
	 private boolean checkClientId(String clientId){
		 return true;
		 }
	 private boolean checkClientSecret(String clientSecret){
		 return true;
	 }
	 private boolean checkAuthCode(String authCode){
		 return true;
	 }
	 private boolean checkRedirectUri(String clientSecret){
		 return true;
	 }
}
