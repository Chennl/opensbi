package com.swirebev.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.swirebev.hibernate.HibernateUtilities;
import com.swirebev.pojo.ArticleMaster;
import com.swirebev.pojo.AuthUserInfo;
import com.swirebev.pojo.Constants;
import com.swirebev.pojo.Customer;
import com.swirebev.pojo.SbocEmployee;
import com.swirebev.service.ArticleMasterService;
import com.swirebev.service.CustomerService;
import com.swirebev.service.SbocEmployeeService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	 CustomerService customerService;
	@Autowired
	 SbocEmployeeService sbocEmployeeService;
	@Autowired
	ArticleMasterService articleMasterService;
	
	private boolean checkCredentials(String username,String password){
		return true;
	}
	@RequestMapping("hello")
	public String sayHello(){
		return "hello";
	}
	@RequestMapping("/login/{id}")
	@ResponseBody
	public Map<String,Object> login(@PathVariable(value="id") String id){
		Map<String,Object> response = new HashMap<String,Object>();
		SbocEmployee sbocEmployee =sbocEmployeeService.getById(id);
		if(sbocEmployee ==null){
			response.put("message", "员工编号不存在！");
			response.put("statusCode", 300);
			response.put("loginVerified",false);
		}
		else{
			Map<String,String> jsonObject= new HashMap<String,String>();
			jsonObject.put("user_code", sbocEmployee.getEmpCode());
			jsonObject.put("user_name", sbocEmployee.getEmpName());
			jsonObject.put("route_code", sbocEmployee.getRouteId());
			jsonObject.put("phone", sbocEmployee.getPhone());
			jsonObject.put("company_code", sbocEmployee.getCompanyCode());
			response.put("message", "ok");
			response.put("statusCode", 100);
			response.put("loginVerified", true);
			response.put("data", jsonObject);
			
		}
		return response;
	}
	
	
	@RequestMapping("/authorize")
	@ResponseBody 
	public Map<String,Object> authorize(@RequestBody String json){
		Map<String,Object> response = new HashMap<String,Object>();
		ObjectMapper mapper= new ObjectMapper();
		try {
			//String to JSON
			//ObjectNode rootNode = mapper.createObjectNode();  
			// rootNode.put("fieldName", "v"); 	
			JsonNode root = mapper.readTree(json);
			JsonNode passwordCredentials = root.path("passwordCredentials");
			String username = passwordCredentials.path("username").asText();
			String password =  passwordCredentials.path("password").asText();
			if(checkCredentials(username,password)){
				response.put("message", "ok");
				response.put("statusCode", 100);
				response.put("loginVerified", true);
				//response.put("data", arg1)
				response.put("token", "11B5EE3F-71BA-4049-84FD-2EAA576B9DD5");
			}
			else{
				response.put("message", "用户或密码不正确，请联系管理员！");
				response.put("statusCode", 300);
				response.put("loginVerified",false);
			}
			 
		}  catch (IOException e) {

			e.printStackTrace();
		}
			 
		return response;
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public AuthUserInfo getUserProfile(){
		return  new AuthUserInfo("1088","chennl你好");
	}
	@RequestMapping(value="/token", produces = "text/plain;charset=UTF-8")
	public ResponseEntity<String> getAccessToken(){
		return new ResponseEntity<String>("你好！123456",HttpStatus.OK);
	}
	@RequestMapping("/outlets")
	@ResponseBody
	public List<Customer> getOutlets()
	{
		return customerService.findAll();
	}

	@RequestMapping(value="/outlet/{id}")
	@ResponseBody
	public Map<String,Object> getById(@PathVariable(value="id") String id){		
		Customer customer = customerService.getById(id);
		Map<String,Object> response= new HashMap<String, Object>();		
		Map<String,String> customerJson= new HashMap<String, String>();
		customerJson.put("outlet_no", customer.getOutletNo());
		customerJson.put("outlet_name", customer.getNameE());
		customerJson.put("outlet_address", customer.getAddressE1());
		customerJson.put("business_type_ext", customer.getCustomerGroup().getBusinessTypeExtens());
		customerJson.put("trade_channel", customer.getCustomerGroup().getTradeChannel());		
		response.put("message", "ok");
		response.put("statusCode", 100);
		response.put("data", customerJson);
		
		return response;
	}
	
/*
 * Articles APIs	
 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/articles")
	@ResponseBody
	public List getArtileList(){
		List list= articleMasterService.findAll();
		List articles= new ArrayList<Map>();
		Iterator it = list.iterator();
		while(it.hasNext()){
			ArticleMaster article = (ArticleMaster)it.next();
			Map ar = new HashMap<String,String>();
			ar.put("article_no", article.getArticleNo());
			ar.put("article_name", article.getNameC());
			articles.add(ar);
		}	
		return articles;
	
	}
	
	@RequestMapping(value="/articles/{id}")
	@ResponseBody
	public Map<String,Object> getArticleById(@PathVariable("id") String id){
		Map<String,Object>  response= new HashMap<String,Object>();
		ArticleMaster article =  articleMasterService.getById(id);
		if(article != null)
		{
			Map<String,String> ar = new HashMap<String,String>();
			ar.put("article_no", article.getArticleNo());
			ar.put("article_name", article.getNameC());
			response.put("message", "ok");
			response.put("statusCode", Constants.FOUND);
			response.put("data", ar);
		}else{
			response.put("message", "not found");
			response.put("statusCode", Constants.NOT_FOUND);
		}
		return response;
		
	}
	
	
	public void parseJsonObject() throws Exception{
		JsonFactory jsonFactory = new JsonFactory(); //创建json工厂，主要用来创建json生成器，json解析器的工具
		
		/**
		 * 解析器是用于标记JSON内容到令牌和相关数据的对象。这是最低级的JSON内容的读访问。
		 */
		JsonParser jsonParse = jsonFactory.createJsonParser(new File("D:/test.json"));
		 //循环判断下一个令牌是否到结束令牌
		while(jsonParse.nextToken() != JsonToken.END_OBJECT){
			String fieldName = jsonParse.getCurrentName();
			if("name".equals(fieldName)){
				jsonParse.nextToken();
				System.out.println(jsonParse.getText());
			}
			if("sex".equals(fieldName)){
				jsonParse.nextToken();
				System.out.println(jsonParse.getText());
			}
			if("Address".equals(fieldName)){ //数组判断有没有到数组结束位置
				jsonParse.nextToken();
				 while (jsonParse.nextToken() != JsonToken.END_ARRAY) {  
                    System.out.println(jsonParse.getText());   
                 }  
			}
		}
		jsonParse.close();
	}
	
}
