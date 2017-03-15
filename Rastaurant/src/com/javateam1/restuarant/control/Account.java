package com.javateam1.restuarant.control;

import java.util.Scanner;

import com.javateam1.restuarant.model.Balance;
import com.javateam1.restuarant.model.Food;
import com.javateam1.restuarant.model.FoodList;
import com.javateam1.restuarant.model.Order;
import com.javateam1.restuarant.model.OrderList;
import com.javateam1.restuarant.model.Restaurant;
import com.javateam1.restuarant.view.Menu;

public class Account {
	private final int INIT_FOODLIST_NUM = 10;
	private Scanner sc = new Scanner(System.in);
	private static int i = 1;
	private String id;
	private String pwd;
	private Balance balance;
	private OrderList orderlist;
	private int type; // 0 ��ͨ�˻�  1 ����Ա
	
	public Account(){
		id = String.format("%04d", i++);
		pwd = id;
		balance = new Balance();
		orderlist = new OrderList();
		setType(0);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Balance getBalance() {
		return balance;
	}

	public void setBalance(Balance balance) {
		this.balance = balance;
	}

	
	public void order(FoodList foods, Restaurant rest){
		Food[] foodlist = new Food[INIT_FOODLIST_NUM];
		Order order = new Order();
		int i = 0;
		foods.printList();
		while(true){
			System.out.println("\n���������(q.�˳�)��");
			System.out.print("#:");
			String name = sc.next();
			if (name.equals("Q") || name.equals("q")){
				if(i>0){
					order.setFoods(foodlist);
					order.setPay(false);
					order.calSumMoney();
					order.printInfo();
					this.orderlist.addOrder(order);
					rest.getOrders().addOrder(order);
				}
				break;
			}
			int index = foods.findFood(name);
			if (index >= 0){
				if ( i < foodlist.length){
					foodlist[i] = foods.getFoodList()[index];
					i++;
				} else {
					System.out.println("ÿ�����" + foodlist.length + "�ݲ�");
					break;
				}
			} else {
				System.out.println("\n����Ĳ��������ڣ�����������");
			}
		}
	}
	
	public void payOrder(){
		orderlist.printOrderNoPayList();
		System.out.println("\n��������Ҫ֧���Ķ�����ţ�");
		System.out.print("#:");
		int str = Menu.getInputIntNum();
		int num = orderlist.getNoPayIndex(str);
		Order order = orderlist.getOrders()[num];
		double payMoney = order.getSumMoney();
		if(pay(payMoney)){
			order.setPay(true);
		}
	}
	
	public void recharge(){
		System.out.println("\n�������ֵ��");
		System.out.print("#:");
		double num = sc.nextDouble();
		if (num > 0){
			balance.deposite(num);
		} else {
			System.out.println("��������ȷ�����");
		}
	}
	
	
	public boolean pay(double num){
		if (balance.withDraw(num)){
			System.out.println("֧���ɹ�");
			return true;
		} else {
			System.out.println("֧��ʧ��");
			return false;
		}
	}
	
	public void viewBalance(){
		System.out.println("��ǰ��" + balance.getBalance() + "Ԫ");
	}
	
	public void printAccountInfo(){
		System.out.println("�˺ţ�" + getId() + "\t���룺" + getPwd());
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		a.printAccountInfo();
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void printOrderInfo() {
		orderlist.printOrderList();
	}
	
	public void deletOrder(){
		orderlist.printOrderList();
		System.out.println("��������Ҫɾ���Ķ������");
		System.out.println("#");
		int num = sc.nextInt();
		orderlist.deletOrder(num);
	}
}
