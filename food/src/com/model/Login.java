package com.model;

import java.util.Scanner;


public class Login {
	public void login(){
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入您的账号");
			String UserName=sc.next();
			System.out.println("请输入您的登录密码");
			String pwd=sc.next();
			if(UserName.equals("admin")&& pwd.equals("admin")){
				System.out.println("您已成功登录");
				break;
			}else{
				System.out.println("您的账号或密码错误\n请重新输入");
			}
		}
	
		}
	public static void main(String[] args) {
		Login sc=new Login();
		sc.login();
	}

}
