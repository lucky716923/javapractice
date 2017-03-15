package com.team1.flower.po;
//属性：订单详情、订单时间、订单总额
public class Order {
	private String orderInfo;//订单详情
	private String orderTime;//订单时间
	private int orderSum;//订单总额
	public String getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
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
	public Order(String orderInfo, String orderTime, int orderSum) {
		super();
		this.orderInfo = orderInfo;
		this.orderTime = orderTime;
		this.orderSum = orderSum;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
