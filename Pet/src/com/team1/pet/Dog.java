package com.team1.pet;


public class Dog extends Pet{
	//����
	public void lookAfterHouse(){
		
	}
	//С��˯��
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.color+"С��"+super.name+
				"���ں�����˯��");
	}
	//С���Է�
	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub
		System.out.println(super.color+"С��"+super.name+
				"���ڳ�"+food.getName());
	}

}
