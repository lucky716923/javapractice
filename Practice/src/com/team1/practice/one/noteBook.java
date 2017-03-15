package com.team1.practice.one;

public class noteBook  extends Stationery{
	public noteBook(String name, int price, boolean status) {
		super(name, price, status);
	}

	public void showInfo(){
		setName("数学本");
		setPrice(1);
		System.out.println(getName()+"\t"+"价格："+getPrice()+"元\t"+"做作业的笔记本");
	}

}
