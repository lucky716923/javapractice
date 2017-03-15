package com.team1.restuarant.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.team1.restuarant.manage.AlipayManage;
import com.team1.restuarant.manage.FoodManage;
import com.team1.restuarant.manage.UserManage;
import com.team1.restuarant.po.Order;

public class Menu {
	static Scanner s=new Scanner(System.in);
	UserManage um=new UserManage();
	FoodManage  fm=new FoodManage();
	AlipayManage am=new AlipayManage();
	Order o=new Order();
	public void start(){
		do{
			System.out.println("1.��¼   2.ע��    3.�鿴�����û�   4.�˳�");
			um.initUserInfo();
			int str1=getInputIntNum();
			switch(str1){
			case 1:
				System.out.println("1.��ͨ�û�     2.����Ա  ");
				int str2=getInputIntNum();
				if(str2==1){
					um.initUserInfo();
					um.loginUser();
					ordinaryloginMenu();
				}else{
					manageloginMenu();
				}
				break;
			case 2:
				um.addUser();
				break;	
			case 3:
				um.showUser();
				break;
			case 4:
				System.exit(0);
				break;	
			}
			
		}while(true);
	}
	
	public void ordinaryloginMenu(){
		while(true){
		System.out.println("1.����˵�   2.ѡ��   3.��ѯ����   4.֧��     5.�˳�");
		int str1=getInputIntNum();
			switch(str1){
			case 1:
				fm.initFoodInfo();
				fm.printFoodList();
				break;	
			case 2:
				fm.initFoodInfo();
				fm.chooseFood(o);
				break;		
			case 3:
				System.out.println(o.getFoodDescribe());
				break;	
			case 4:
				am.printResult();
				break;	
			case 5:
				start();
				break;
			default :
				System.out.println("���������������������");
			}	
		}
	}
	
	public void manageloginMenu() {
		um.initUserInfo();
		um.loginUser();
		fm.initFoodInfo();
		while (true) {
			System.out.println("1.�˵�   2.���Ӳ�    3.ɾ����   4.��ѯ����     5.�˳�");
			int str1=getInputIntNum();
			switch (str1) {
			case 1:
				fm.printFoodList();
				break;
			case 2:
				fm.addFood();
				break;
			case 3:
				fm.deleteFood();
				break;
			case 4:
				System.out.println(o.getFoodDescribe());
				break;
			case 5:
				start();
				break;
			default:
				System.out.println("���������������������");
			}
		}
	}
	public static int getInputIntNum(){
		int str;
		while(true){
			str = 0;
			try{
				str = s.nextInt();
//				System.out.println("haohaoh");
				break;
			} catch (InputMismatchException e){
				s.nextLine();
				System.out.println("��������");
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Menu m=new Menu();
		m.start();
	}
}
