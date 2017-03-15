package com.team1.flower.manage;
//var exp = /([0-9].*([a-zA-Z].*[a-zA-Z])|[a-zA-Z].*([0-9].*[0-9])|([0-9].*[a-zA-Z]|[a-zA-Z].*[0-9]))/;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.team1.flower.po.User;
public class UserManage {
	static Scanner input=new Scanner(System.in);
	static List<User> user=new ArrayList<User>();
	static {
		user.add(new User("小明","13456","管理用户"));
		user.add(new User("张三","13456","普通用户"));
		user.add(new User("李四","13456","普通用户"));
	}
	public static  void userInfo(){
		for(User u:user){  
			System.out.println(u);
		}
	}
	//用户注册
	public static void addUser(){
		User u=new User();
		System.out.print("请输入用户名：");
		u.setUserName(input.next());
		System.out.print("请输入用户密码：");
		u.setUserPwd(input.next());
		System.out.print("请输入用户类型：  ");
		u.setUserType(input.next());
		user.add(u);
	}
	//注销用户
	public static void registeUser(){
		System.out.print("请输入你想注销的用户：");
		String name=input.next();
		for (int i = 0; i < user.size(); i++) {
			if(name.equals(user.get(i).getUserName())){
				user.remove(i);
			}	
		}
		
	}
	
	
	public static void main(String[] args) {
		userInfo();
		addUser();
		userInfo();
		registeUser();
		userInfo();
	}
}
