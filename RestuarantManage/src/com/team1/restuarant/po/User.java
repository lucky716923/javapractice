package com.team1.restuarant.po;

public class User {
	//用户名
	public String userName;
	//用户密码
	public String userPwd;
	//用户类型    普通用户  管理员
	public String type;
	@Override
	public String toString() {
		return  userName  + userPwd + type;
	}
	

}
