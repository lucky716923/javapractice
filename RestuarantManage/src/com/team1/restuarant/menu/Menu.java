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
			System.out.println("1.登录   2.注册    3.查看所有用户   4.退出");
			um.initUserInfo();
			int str1=getInputIntNum();
			switch(str1){
			case 1:
				System.out.println("1.普通用户     2.管理员  ");
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
		System.out.println("1.浏览菜单   2.选菜   3.查询订单   4.支付     5.退出");
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
				System.out.println("您的输入错误，请重新输入");
			}	
		}
	}
	
	public void manageloginMenu() {
		um.initUserInfo();
		um.loginUser();
		fm.initFoodInfo();
		while (true) {
			System.out.println("1.菜单   2.增加菜    3.删除菜   4.查询订单     5.退出");
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
				System.out.println("您的输入错误，请重新输入");
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
				System.out.println("输入有误");
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Menu m=new Menu();
		m.start();
	}
}
