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
		System.out.println("1.登录   2.注册    3.查看所有用户   4.退出");
		um.initUserInfo();
		int input=s.nextInt();
		do{
			switch(input){
			case 1:
				System.out.println("1.普通用户     2.管理员  3.退出  ");
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
			System.out.println("是否继续操作： y.是       n.否");
			String d=s.next();
		}while(equals("y"));
	}
	
	public void ordinaryloginMenu(){
		System.out.println("1.浏览菜单   2.选菜   3.查询订单   4.支付     5.退出");
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
				System.out.println("您的输入错误，请重新输入");
			}	
	}
	
	public void manageloginMenu(){
		System.out.println("1.菜单   2.增加菜    3.删除菜   4.查询订单     5.退出");
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
				System.out.println("您的输入错误，请重新输入");
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
