package com.javateam1.restuarant.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.javateam1.restuarant.control.Account;
import com.javateam1.restuarant.control.AccountArray;
import com.javateam1.restuarant.control.Manager;
import com.javateam1.restuarant.model.*;

public class Menu {
	static Scanner sc = new Scanner(System.in);
	Restaurant rest = new Restaurant();
	AccountArray accountarray = new AccountArray();
	Manager manager = new Manager();
	FoodList foodlist = rest.getFoodlist();
	OrderList orders = rest.getOrders();
	
	public void printMain(){
		while(true){
			System.out.println("\n**************��ӭ����Team1�͹�****************");
			System.out.println("��ѡ���������");
			System.out.println("1.��ͨ�û���¼\n2.����Ա��¼\n3.�鿴�˵�\n4.�û�ע��\n5.�˳�");
			System.out.print("#:");
			int str = getInputIntNum();
			switch(str){
			case 1: 
				Account customer = accountarray.signIn(0);
				if( customer != null){
					printCustomerMenu(customer);
				}
				break;
			case 2:
				Manager manager =  (Manager) accountarray.signIn(1);
				if( manager != null){
					printManagerMenu(manager);
				}
				break;
			case 3:
				foodlist.printList();
				break;
			case 4:
				accountarray.addAccount();
				break;
			case 5:
				System.out.println("лл�ݹ�");
				System.exit(0);
				break;
			case 10:
				accountarray.printAccountArray();
				break;
			default:
				System.out.println("��������");
			}
		}
	}
	
	public void printManagerMenu(Manager manager){
//		j.�޸Ĳ˵����ݣ�����ˣ� ��ѯ�˻��� ��ѯȫ���������� ��ɾ������
		while(true){
			System.out.println("\n1.�޸Ĳ˵����� 2.��ѯ�˻���� 3.��ѯȫ����������   4.ɾ������ 0.�˳�");
			System.out.print("#:");
			int str = getInputIntNum();
			
			if (str == 0){
				break;
			}
			switch(str){
			case 1:
				manager.printModifyFoodlist(foodlist);
				break;
			case 2:
				manager.viewBalance();
				break;
			case 3:
				manager.printAllOrder(orders);
				break;
			case 4:
				manager.deleteOrder(orders);
			default:
				System.out.println("��������");
				break;
			}
		}
	}
	
	public void printCustomerMenu(Account account){
//		i.��� ��ѯ�Լ��Ķ�������ѡ�� ��ѯ�Լ���֧����Ϣ����ѡ��
		while(true){
			System.out.println("\n1.��� 2.�鿴�Լ��Ķ��� 3.֧���˵� 4.��ֵ 5.��ѯ���  6.ɾ������ 0.�˳�");
			System.out.print("#:");
			int str = getInputIntNum();
			if (str == 0){
				break;
			}
			switch(str){
			case 1:
				account.order(foodlist,rest);
				break;
			case 2:
				account.printOrderInfo();
				break;
			case 3:
				account.payOrder();
				break;
			case 4:
				account.recharge();
				break;
			case 5:
				account.viewBalance();
				break;
			case 6:
				account.deletOrder();
				break;
			default:
				System.out.println("��������");
				break;
			}
		}
	}
	
	public static int getInputIntNum(){
		int str;
		while(true){
			str = 0;
			try{
				str = sc.nextInt();
				System.out.println("haohaoh");
				break;
			} catch (InputMismatchException e){
				sc.nextLine();
				System.out.println("��������");
			}
		}
		return str;
	}
	
	public static double getInputDoubleNum(){
		double str;
		while(true){
			str = 0;
			try{
				str = sc.nextDouble();
				break;
			} catch (InputMismatchException e){
				sc.nextLine();
				System.out.println("��������");
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printMain();
		System.out.println(Menu.getInputIntNum());
	}
	
}
