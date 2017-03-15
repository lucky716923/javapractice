package com.javateam1.restuarant.control;

import java.util.Scanner;

import com.javateam1.restuarant.model.*;
import com.javateam1.restuarant.view.Menu;

public class Manager extends Account{
	private Scanner sc = new Scanner(System.in);
	
	public Manager(){
	}

	public void addFood(FoodList foodlist){
		foodlist.addFood();
	}
	
	public void deletFood(FoodList foodlist){
		foodlist.deleteFood();
	}
	
	public void modifyFood(FoodList foodlist){
		foodlist.modifyFood();
	}
	
	public void findFood(FoodList foodlist){
		foodlist.findFood();
	}
	
	public void printModifyFoodlist(FoodList foodlist){
		while(true){
			System.out.println("1.��Ӳ�  2.ɾ����  3.�޸Ĳ�  4.���Ҳ� 5.�˳�");
			System.out.print("#:");
			int str = Menu.getInputIntNum();
			
			switch(str) {
			case 1:
				addFood(foodlist);
				break;
			case 2:
				deletFood(foodlist);
				break;
			case 3:
				modifyFood(foodlist);
				break;
			case 4:
				findFood(foodlist);
				break;
			default:
				System.out.println("��������");
				break;
			}
		}
		
	}

	public void printAllOrder(OrderList orders) {
		orders.printOrderList();
	}

	public void deleteOrder(OrderList orders) {
		orders.printOrderList();
		System.out.println("��������Ҫɾ���Ķ������");
		System.out.println("#");
		int num = Menu.getInputIntNum();
		orders.deletOrder(num);
	}
}
