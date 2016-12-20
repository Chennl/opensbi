package com.swirebev.pojo;

public class AuthUserInfo {
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	private String UserId;
	private String UserName;
	public AuthUserInfo(String userId,String userName){
		this.UserId=userId;
		this.UserName=userName;
	}
}
