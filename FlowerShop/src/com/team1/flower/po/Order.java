package com.team1.flower.po;
//���ԣ��������顢����ʱ�䡢�����ܶ�
public class Order {
	private String orderInfo;//��������
	private String orderTime;//����ʱ��
	private int orderSum;//�����ܶ�
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
