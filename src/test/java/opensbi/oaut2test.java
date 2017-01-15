/*package opensbi;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthResourceResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;

public class oaut2test {
	
	客户端
	获取accessToken代码示例
	public void getAccessToken() throws OAuthSystemException, OAuthProblemException{
 	OAuthClientRequest request = OAuthClientRequest
		       //获取accesstoken地址
		       .tokenLocation("http://localhost:8080/ljdp/oauth/accesstoken")
		       //授权方式
		       .setGrantType(GrantType.AUTHORIZATION_CODE)
		       //你的clientid和secret
		       .setClientId("your-application-client-id")
		       .setClientSecret("your-application-client-secret")
		       //第一步重定向的uri
		       .setRedirectURI("http://localhost:8080/ljdp/oauth/getcode")
		       //第一步获取的认证码
		       .setCode("****")
		       .buildQueryMessage();
		//create OAuth client that uses custom http client under the hood
		OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
		//Custom response classes are an easy way to deal with oauth providers that introduce modifications to
		//OAuth 2.0 specification
		OAuthJSONAccessTokenResponse oAuthResponse = oAuthClient.accessToken(request, OAuthJSONAccessTokenResponse.class);

		String accessToken = oAuthResponse.getAccessToken();
		Long expiresIn = oAuthResponse.getExpiresIn();
	}
	
	//用accesstoken获取用户资源代码示例
	public void getResourceResponse() throws OAuthSystemException, OAuthProblemException{
	OAuthClientRequest bearerClientRequest = new OAuthBearerClientRequest(
		       "http://localhost:8080/ljdp/oauth/resource")
		       .setAccessToken("********")
		       .buildQueryMessage();
		OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());
		OAuthResourceResponse resourceResponse = oAuthClient.resource(
		       bearerClientRequest, OAuth.HttpMethod.GET,
		       OAuthResourceResponse.class);
		System.out.println(resourceResponse.getBody());
		System.out.println(resourceResponse.getResponseCode());
	}

}
*/