package com.team1.pet;


public class Cat extends Pet{
	//ץ����
	public void cathMouse(){
		
	}
	//Сè˯��
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.color+"Сè"+super.name+
				"���ڹ��๾���˯��");
	}

	//Сè�Զ���
	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub
		System.out.println(super.color+"Сè"+super.name+
				"���ڳ�"+food.getName());
	}
}
