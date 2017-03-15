package com.team1.pet;
	//向上抽取的父类
public abstract class Pet {
	//名字
	public String name;
	//毛色
	public String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//吃饭
	public abstract void eat(Food food);
		
	//睡觉
	public abstract void sleep();
	
}
