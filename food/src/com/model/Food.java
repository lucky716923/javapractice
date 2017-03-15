package com.model;

public class Food {
	private int id;//序号
	private String name;//食物名
	private double price;//食物价格
	private int size;//0 表示无大小分区别  1 小份  2 大份
	public Food(int id, String name, double price, int size) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.size = size;
	}
	
	public Food(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

}
