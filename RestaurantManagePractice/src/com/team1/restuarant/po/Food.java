package com.team1.restuarant.po;

public class Food {
	//ʳ������
	public String foodName;
	//ʳ��۸�
	public int foodPrice;
	// ��С��
	public String foodSize;
	//�Ƿ����ɾ��       true  ��ʾ����ɾ��  false��ʾ�Ѿ�ɾ��
	public boolean isDelete=true;
	//֧��״̬
	public boolean payStatus=true;

	public String toString() {
		return  foodName  + foodPrice+ foodSize;
	}
	
	public static void main(String[] args) {
		Food f = new Food();
		f.foodName = "youp";
		f.foodPrice = 100;
		f.foodSize = "dao";
		System.out.println(f);
	}
	
}
