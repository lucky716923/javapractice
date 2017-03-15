package com.javateam1.restuarant.control;

import java.util.Scanner;

import com.javateam1.restuarant.view.Menu;

public class AccountArray {
	private final int INIT_NUM = 10;
	private Account[] accounts = new Account[100];
	private int listLength = 0;
	
	public AccountArray(){
		initAccountArray();
	}
	
	private void initAccountArray() {
		// ��ʼ������Ա�˻�
		accounts[0] = new Manager();
		accounts[0].setId("admin");
		accounts[0].setPwd("admin");
		accounts[0].setType(1);
		
		for (int i = 1; i < 10; i++) {
			accounts[i] = new Account();
		}
		listLength = INIT_NUM;
	}
	
	public void printAccountArray(){
		for (int i = 0; i < accounts.length; i++){
			if (accounts[i] == null){
				break;
			} else {
				accounts[i].printAccountInfo();
			}
		}
	}
	
	public int findAccount(String id){
		int index = -1;
		for (int i = 0; i < accounts.length; i++){
			if (accounts[i] == null){
				break;
			} else {
				if (accounts[i].getId().equals(id)){
					index = i;
					break;
				}
			}
		}
		return index;
	}
	
	public void addAccount(){
		if (listLength >= accounts.length){
			System.out.println("�˻��洢����,�޷����");
			return;
		}
		Scanner sc = new Scanner(System.in);
		Account ac = null;
		
		while(true){
			System.out.println("�������˻����ͣ�0.��ͨ�˻�  1.����Ա�˻�");
			System.out.print("#:");
			int str = Menu.getInputIntNum();
			if (str == 0){
				ac = new Account();
			}else if (str == 1){
				ac = new Manager();
			} else {
				System.out.println("����������");
				continue;
			}
			ac.setType(str);
			break;
		}
		System.out.println("�������˻�����");
		String id;
		while(true){
			System.out.print("#:");
			id = sc.next();
			if (findAccount(id) < 0){
				ac.setId(id);
				System.out.println("���������룺");
				System.out.print("#:");
				ac.setPwd(sc.next());
				accounts[listLength] = ac;
				listLength++;
				break;
			} else {
				System.out.println("��ǰ�˻��Ѵ���,���������룺");
			}
		}
	}
	
	public Account authenticate(String id, String pwd, int type){
		int index = findAccount(id);
		
		if (index < 0){
			System.out.println("�˻���������");
			return null;
		} else if (accounts[index].getType() == type){
			if(accounts[index].getPwd().equals(pwd)){
				System.out.println("��֤�ɹ�");
				return accounts[index];
			}else{
				System.out.println("�˻��������벻ƥ��");
				return null;
			}
		} else{
			System.out.println("�˻����Ͳ�ƥ��");
			return null;
		}
	}
	
	public Account signIn(int type){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������˻�����");
		System.out.print("#:");
		String id = sc.next();
		System.out.println("���������룺");
		System.out.print("#:");
		String pwd = sc.next();
		Account account = authenticate(id, pwd, type);
		if ( account != null){
			return account;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		AccountArray a = new AccountArray();
		a.printAccountArray();
		a.addAccount();
		a.printAccountArray();
	}
}
