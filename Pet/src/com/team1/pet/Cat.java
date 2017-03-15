package com.team1.pet;


public class Cat extends Pet{
	//抓老鼠
	public void cathMouse(){
		
	}
	//小猫睡觉
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.color+"小猫"+super.name+
				"正在咕噜咕噜地睡觉");
	}

	//小猫吃东西
	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub
		System.out.println(super.color+"小猫"+super.name+
				"正在吃"+food.getName());
	}
}
