package com.team1.pet;
	//���ϳ�ȡ�ĸ���
public abstract class Pet {
	//����
	public String name;
	//ëɫ
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
	//�Է�
	public abstract void eat(Food food);
		
	//˯��
	public abstract void sleep();
	
}
