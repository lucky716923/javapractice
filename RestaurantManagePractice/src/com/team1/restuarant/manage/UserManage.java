package com.team1.restuarant.manage;

import java.util.Scanner;

import com.team1.restuarant.po.User;

public class UserManage {
	User[] user = new User[100];
	Scanner sd = new Scanner(System.in);

	// ��ʼ���û�
	public void initUserInfo() {
		User user1 = new User();
		user1.userName = "admin";
		user1.userPwd = "admin1";
		user1.type = "����Ա";
		user[0] = user1;

		User user2 = new User();
		user2.userName = "����";
		user2.userPwd = "123456";
		user2.type = "��ͨ�û�";
		user[1] = user2;

		User user3 = new User();
		user3.userName = "����";
		user3.userPwd = "123456";
		user3.type = "��ͨ�û�";
		user[2] = user3;
	}
	
	 //�鿴�û�
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
   //ע��
	public void addUser(){
		System.out.println("������ע���˺�");
		String userName=sd.next();
		System.out.println("������ע���¼����");
		String userPwd=sd.next();
		System.out.println("�������¼����");
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

 
	// ��¼
	public void loginUser() {
		while(true){
		System.out.println("�����������û�����");
		String userName = sd.next();
		System.out.println("�������������룺");
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
			System.out.println("���ź�����û�е�½�ɹ�");
		} else {
			System.out.println("���ѳɹ���½");
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