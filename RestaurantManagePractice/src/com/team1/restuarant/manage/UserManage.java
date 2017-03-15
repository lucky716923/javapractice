package com.team1.restuarant.manage;

import java.util.Scanner;

import com.team1.restuarant.po.User;

public class UserManage {
	User[] user = new User[100];
	Scanner sd = new Scanner(System.in);

	// 初始化用户
	public void initUserInfo() {
		User user1 = new User();
		user1.userName = "admin";
		user1.userPwd = "admin1";
		user1.type = "管理员";
		user[0] = user1;

		User user2 = new User();
		user2.userName = "张三";
		user2.userPwd = "123456";
		user2.type = "普通用户";
		user[1] = user2;

		User user3 = new User();
		user3.userName = "李四";
		user3.userPwd = "123456";
		user3.type = "普通用户";
		user[2] = user3;
	}
	
	 //查看用户
		public void showUser(){
			if(user==null){
				return;
			}
			for (int i = 0; i < user.length; i++) {
				User user5=user[i];
				if(user5==null){
					break;
				}
			System.out.println(user5.userName+"\t"+user5.userPwd+"\t"+user5.type);	
			}
		}
   //注册
	public void addUser(){
		System.out.println("请输入注册账号");
		String userName=sd.next();
		System.out.println("请输入注册登录密码");
		String userPwd=sd.next();
		System.out.println("请输入登录类型");
		String type=sd.next();
		User user4=new  User();
		user4.userName=userName;
		user4.userPwd=userPwd;
		user4.type=type;
		for (int i = 0; i < user.length; i++) {
//			user4=user[i];
			if(user[i]==null){
				user[i]=user4;
				break;
			}
		}
	}

 
	// 登录
	public void loginUser() {
		while(true){
		System.out.println("请输入您的用户名：");
		String userName = sd.next();
		System.out.println("请输入您的密码：");
		String userPwd = sd.next();
		User user4 = null;
		boolean success = false;
		for (int j = 0; j < user.length; j++) {
			user4 = user[j];
			if (user4 == null) {
				break;
			}
			if (userName.equals(user4.userName)
					&& userPwd.equals(user4.userPwd)) {
				success = true;
				break;
			} 
		}
		if (!success){
			System.out.println("很遗憾，您没有登陆成功");
		} else {
			System.out.println("您已成功登陆");
			break;
		}
		}
	}
	public static void main(String[] args) {
		UserManage sc = new UserManage();
		sc.initUserInfo();
		sc.showUser();
		sc.loginUser();
		sc.addUser();
		sc.showUser();
	}

}
