package com.javateam1.restuarant.model;

import java.util.Scanner;

public class FoodList {
	private final Food[] foods = {
		new Food("���Ų˳���Ϻ", 42), new Food("�㽶����", 42),
		new Food("������˵�", 38),  new Food("���͸���", 38),
		new Food("ũ��һ����", 42), new Food("����Ҷ����������", 42),
		new Food("С����ɽ��", 42), new Food("�ε���ˮ����", 42),
		new Food("��֭��ɽ", 42), new Food("�ཷ���������", 42),
	};
	private Scanner sc = new Scanner(System.in);
	
	private Food[] foodList;  // ���в���ɵ�һ���˵�
	private int listLength;
	
	public FoodList(){
		initFoodList();
	}
	public FoodList(Food[] foodlist){
		initFoodList();
		System.arraycopy(foodlist, 0, this.foodList, 0, foodlist.length);
	}
	
	public void initFoodList(){
		foodList = new Food[100];
		listLength = 0;
		System.arraycopy(foods, 0, this.foodList, 0, foods.length);
		listLength = foods.length;
	}

	public Food[] getFoodList() {
		return foodList;
	}

	public void setFoodList(Food[] foodList) {
		this.foodList = foodList;
	}
	
	// ��ӡ�˵��б�
	public void printList(){
		System.out.printf("%s\t\t%s\n", "����", "�۸�");
		int index = 1;
		for (int i = 0; i < listLength; i++){
			Food f = foodList[i];
			if(f==null) break;
			if (f.isDelete()){
				System.out.print(index + ".");
				f.printInfo();
				index++;
			}
		}
	}
	
	// ���ʳ��
	public void addFood(Food f){
		int num = listLength;
		if (num < foodList.length-1){
			foodList[num] = f;
			listLength++;
		} else {
			System.out.println("��Ĳ˵��洢�����ˣ��������");
		}
	}
	
	public void addFood(){
		System.out.println("��Ӳˣ�");
		Food f = new Food();
		
		while(true){
			System.out.println("�����������");
			String name = sc.next();
			if (findFood(name) < 0){
				f.setName(name);
				System.out.println("������۸�");
				f.setPrice(sc.nextDouble());
				System.out.println("�Ƿ�ɲ鿴(����'y' or 'n')��");
				String isOrNo = sc.next();
				if (isOrNo.equals("y")){
					f.setDelete(true);
				} else {
					f.setDelete(false);
				}
				addFood(f);
				break;
			} else {
				System.out.println("��ǰ���Ѵ���");
			}
		}
		
		
	}
	
	// ɾ��ʳ��
	public void deleteFood(int index){
		int indexTrue = 0; // ��ʵ����
		int indexVitral = 0; //�����ӡ����
		for (int i = 0; i< listLength; i++){
			indexTrue = i;
			if (foodList[i].isDelete()){
				indexVitral++;
				if (indexVitral == index){
					break;
				}
			}
		}
		if (index >= 0 && index < listLength ){
			foodList[indexTrue].setDelete(false);
		} else {
			System.out.println("��������������");
		}
	}
	
	public void deleteFood(){
		System.out.println("ɾ���ˣ�");
		System.out.println("������˵�������");
		int index = sc.nextInt();
		deleteFood(index);
	}
	
	// ����ʳ��
	public int findFood(String name){
		boolean isFind = false;
		int index = 0;
		for(int i = 0; i < listLength; i++){
			Food f = foodList[i];
			if (f == null) break;
			if (f.getName().equals(name)){
				f.printInfo();
				isFind = true;
				index = i;
			}
		}
		if(!isFind){
			return -1;
		}
		return index;
	}
	
	public void findFood(){
		System.out.println("������Ҫ��ѯ�Ĳ���");
		String name = sc.next();
		if(findFood(name) < 0){
			System.out.println("������������ڣ���ϵ�ϰ����");
		}
	}
	
	// �޸�ʳ��
	public void modifyFood(String name){
		int index = findFood(name);
		System.out.println("index=" + index);
		System.out.println("���������(���䰴'n'):");
		String str = sc.next();
		if(str.equals("n") || str.equals("N")){
			sc.nextLine();
		}else {
			foodList[index].setName(str);
		}
		
		System.out.println("������۸�(���䰴'n'):");
		String strP = sc.next();
		if(strP.equals("n") || strP.equals("N")){
			sc.nextLine();
		}else {
			double price = Double.valueOf(strP); 
			foodList[index].setPrice(price);
		}
	}
	public void modifyFood(){
		System.out.println("��������Ҫ�޸ĵĲ�����");
		String name = sc.next();
		modifyFood(name);
	}
	
	
	public static void main(String[] args) {
		FoodList fl = new FoodList();
		fl.printList();
//		fl.addFood();
//		fl.printList();
//		fl.deleteFood();
//		fl.printList();
//		fl.modifyFood();
//		fl.printList();
//		fl.findFood();
//		fl.printList();
	}
	
	
}
