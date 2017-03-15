package com.team1.restuarant.menu;

import java.util.Scanner;

import com.team1.restuarant.manage.AlipayManage;
import com.team1.restuarant.manage.FoodManage;
import com.team1.restuarant.manage.UserManage;
import com.team1.restuarant.po.Order;

public class Menu {
	Scanner s=new Scanner(System.in);
	UserManage um=new UserManage();
	FoodManage  fm=new FoodManage();
	AlipayManage am=new AlipayManage();
	Order o=new Order();
	public void start(){
		System.out.println("1.��¼   2.ע��    3.�鿴�����û�   4.�˳�");
		um.initUserInfo();
		int input=s.nextInt();
		do{
			switch(input){
			case 1:
				System.out.println("1.��ͨ�û�     2.����Ա  3.�˳�  ");
				int input3=s.nextInt();
				if(input3==1){
					um.loginUser();
					ordinaryloginMenu();
				}
				if(input3==2){
					um.loginUser();
					manageloginMenu();
				}
				if(input3==3){
					start();
				}
				break;
			case 2:
				um.addUser();
				break;	
			case 3:
				um.initUserInfo();
				um.showUser();
				break;
			case 4:
				System.exit(0);
				break;	
			}
			System.out.println("�Ƿ���������� y.��       n.��");
			String d=s.next();
		}while(equals("y"));
	}
	
	public void ordinaryloginMenu(){
		System.out.println("1.����˵�   2.ѡ��   3.��ѯ����   4.֧��     5.�˳�");
		int input=s.nextInt();
			switch(input){
			case 1:
				fm.initFoodInfo();
				fm.printFoodList();
				break;	
			case 2:
				fm.initFoodInfo();
				fm.chooseFood(o);
				System.out.println(o.getFoodDescribe());
				break;		
			case 3:
				System.out.println(o.getOrderSum());
				break;	
			case 4:
				am.printResult();
				break;	
			case 5:
				start();
			default :
				System.out.println("���������������������");
			}	
	}
	
	public void manageloginMenu(){
		System.out.println("1.�˵�   2.���Ӳ�    3.ɾ����   4.��ѯ����     5.�˳�");
		int input=s.nextInt();
			switch(input){
			case 1:
				fm.initFoodInfo();
				fm.printFoodList();
				break;	
			case 2:
				fm.addFood();
				break;		
			case 3:
				fm.deleteFood();
				break;	
			case 4:
				am.printResult();
				break;	
			case 5:
				start();
			default :
				System.out.println("���������������������");
			}
			
	}
	
	public static void main(String[] args) {
		Menu m=new Menu();
//		m.start();
//		m.ordinaryloginMenu();
		m.start();
		m.ordinaryloginMenu();
	}
}
