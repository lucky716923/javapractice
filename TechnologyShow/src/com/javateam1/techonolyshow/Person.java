package com.javateam1.techonolyshow;


public class Person {
    String name = "���";   
    Car car;
    BankCard card;
    
    public Person(){
    	card = new BankCard();
		car = new Car();
    }
    
	public Person(String name) {
		this.name = name;
		card = new BankCard();
		car = new Car();
	}
    
    String getName(){
    	return name;
    }
    
    void setName(String name){
    	this.name = name;
    }
    
    // ��ӡ������Ϣ
    void printPersonInfo(){
    	this.car.printCarInfo();
    }
    
    // ��ʻ����
    void driveCar(){
    	System.out.println(this.getName() + "���ڼ�ʻ " + this.car.getName());
    	this.car.move();
    }
    
}
