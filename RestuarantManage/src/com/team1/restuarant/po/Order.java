package com.team1.restuarant.po;

import java.text.SimpleDateFormat;


public class Order {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd   HH:MM:SS");
	String foodDescribe;//订单详情
	String orderTime;//订单时间
	int orderSum;//订单总额

	public String getFoodDescribe() {
		return foodDescribe;
	}

	public void setFoodDescribe(String foodDescribe) {
		String title = "\n订单\n";
		this.foodDescribe = title + foodDescribe;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public int getOrderSum() {
		return orderSum;
	}

	public void setOrderSum(int orderSum) {
		this.orderSum = orderSum;
	}
	public void showOrder(){
		Order s=new Order();
		s.getFoodDescribe();
	}
	public static void main(String[] args) {
		Order s=new Order();
		s.showOrder();
	}
}
