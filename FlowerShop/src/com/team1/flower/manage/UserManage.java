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
		user.add(new User("С��","13456","�����û�"));
		user.add(new User("����","13456","��ͨ�û�"));
		user.add(new User("����","13456","��ͨ�û�"));
	}
	public static  void userInfo(){
		for(User u:user){  
			System.out.println(u);
		}
	}
	//�û�ע��
	public static void addUser(){
		User u=new User();
		System.out.print("�������û�����");
		u.setUserName(input.next());
		System.out.print("�������û����룺");
		u.setUserPwd(input.next());
		System.out.print("�������û����ͣ�  ");
		u.setUserType(input.next());
		user.add(u);
	}
	//ע���û�
	public static void registeUser(){
		System.out.print("����������ע�����û���");
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