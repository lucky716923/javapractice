package com.javateam1.techonolyshow;


import java.util.Scanner;

public class Car {
	String name;
	double speed = 40;  // �ٶ�
	String color;
	int gear;  //��λ
	double price;  // �۸�
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setSpeed(double speed){
		this.speed = speed;
	}
	
	double getSpeed(){
		return speed;
	}
	
	void setColor(String color){
		this.color = color;
	}
	
	String getColor(){
		return color;
	}
	
	int getGear(){
		return gear;
	}
	
	// �ҵ�
	void putIntoGear(int gear){
		this.gear = gear;
		if (gear == 1){
			this.speed = 20;
		} else if(gear == 2){
			this.speed = 40;
		} else if(gear == 3){
			this.speed = 60;
		} else if(gear == 4){
			this.speed = 80;
		} else{
			this.speed = 100;
		}
	}
	
	void setPrice(double price){
		this.price = price;
	}
	
	double getPrice(){
		return price;
	}
	
	// �����ƶ�
	void move(){
		if (speed > 40){
			System.out.println("������" + speed + "����ٶ��ڼ���");
		} else {
			System.out.println("������" + speed + "����ٶ�������");
		}
		
	}
	
	void move(int speed){
		setSpeed(speed);
		move();
	}
	
	void printCarInfo(){
		System.out.println(this.getColor() + "��" + this.getName());
	}
	
	void runCarSystem(Scanner input, Person poet){
		Car carArray[] = new Car[4];  // ��������Car
		
		String name[] = {"ѩ����", "�µ�", "����", "�������֮��"};
		String color[] = {"��ɫ", "��ɫ", "��ɫ", "��ɫ"};
		double price[] = {1000000, 2000000, 3000000, 40000000};
		
		for(int i = 0; i < carArray.length; i++){
			carArray[i] = new Car();
			carArray[i].setName(name[i]);
			carArray[i].setColor(color[i]);
			carArray[i].setPrice(price[i]);
		}
		
		System.out.println("��ӭ " + poet.getName() +  " �������ճ���\n��ѡ����Ҫ����ĳ�:\n");
		for(int i = 0; i < carArray.length; i++ ){
			Car car = carArray[i];
			System.out.println((i + 1) + "." + car.name + " " + car.color 
					+ "  " + car.price);
		}
		System.out.println("������Ҫ����ĳ���");
		
		
		int str = input.nextInt();
		if (str > 0 && str < carArray.length + 1){
			Car car = carArray[str-1];
			boolean canbuy = poet.card.withdraw(car.getPrice());
			if (canbuy){
				System.out.println(car.getColor() + "��" + car.getName() + "���������ˣ�");
				
				poet.card.printBalance();
				poet.car = car;
				
				System.out.println("��ҵ���1~4����");
				
				int str1 = input.nextInt();
				if (str1 > 0 && str1 < 5){
					poet.car.putIntoGear(str1);
				}
				
				poet.printPersonInfo();
				poet.driveCar();
			}
		}
	}
}
