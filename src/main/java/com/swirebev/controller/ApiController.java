package com.swirebev.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.swirebev.pojo.AuthUserInfo;

@Controller
@RequestMapping("/api")
public class ApiController {
	private boolean checkCredentials(String username,String password){
		return true;
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
				response.put("errmsg", "ok");
				response.put("errcode", 0);
				response.put("success", true);
				//response.put("data", arg1)
				response.put("token", "11B5EE3F-71BA-4049-84FD-2EAA576B9DD5");
			}
			 
		} catch (JsonProcessingException e) {
		
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
			 
		return response;
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public AuthUserInfo getUserProfile(){
		return  new AuthUserInfo("1088","chennl");
	}
	@RequestMapping("/token")
	public String getAccessToken(){
		return "12345678";
	}
}
