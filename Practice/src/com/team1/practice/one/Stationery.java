package com.team1.practice.one;

public class Stationery {
	private String name;
	private int price;
	private boolean status;

	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Stationery(String name, int price,boolean status) {
		super();
		this.name = name;
		this.price = price;
		this.status=true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void showInfo(){
		System.out.println(this.name+"\t"+"¼Û¸ñ£º"+this.price+"\t");
	}

	

}
