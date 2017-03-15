package com.team1.restuarant.po;

public class Food {
	//食物名称
	public String foodName;
	//食物价格
	public int foodPrice;
	// 大小份
	public String foodSize;
	//是否可以删除       true  表示可以删除  false表示已经删除
	public boolean isDelete=true;
	//支付状态
	public boolean payStatus=true;

	public String toString() {
		return  foodName  + foodPrice+ foodSize;
	}
	
	public static void main(String[] args) {
		Food f = new Food();
		f.foodName = "youp";
		f.foodPrice = 100;
		f.foodSize = "dao";
		System.out.println(f);
	}
	
}
