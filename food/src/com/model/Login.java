package com.model;

import java.util.Scanner;


public class Login {
	public void login(){
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("�����������˺�");
			String UserName=sc.next();
			System.out.println("���������ĵ�¼����");
			String pwd=sc.next();
			if(UserName.equals("admin")&& pwd.equals("admin")){
				System.out.println("���ѳɹ���¼");
				break;
			}else{
				System.out.println("�����˺Ż��������\n����������");
			}
		}
	
		}
	public static void main(String[] args) {
		Login sc=new Login();
		sc.login();
	}

}
