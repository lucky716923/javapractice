package com.team1.restuarant.manage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



import com.team1.restuarant.menu.Menu;
import com.team1.restuarant.po.Food;
import com.team1.restuarant.po.Order;

public class FoodManage {
	Food[] food = new Food[100];
	Scanner ad = new Scanner(System.in);

	public Food[] getFood() {
		return food;
	}

	public void setFood(Food[] food) {
		this.food = food;
	}

	// ��ʼ��ʳ��   ������һ������food��
	public void initFoodInfo() {
		Food food1 = new Food();
		food1.foodName = "ɰ������";
		food1.foodPrice = 8;
		food1.foodSize = "��ͨ";
		food[0] = food1;

		Food food2 = new Food();
		food2.foodName = "ɰ������";
		food2.foodPrice = 8;
		food2.foodSize = "��ͨ";
		food[1] = food2;

		Food food3 = new Food();
		food3.foodName = "ɰ��������";
		food3.foodPrice = 8;
		food3.foodSize = "��ͨ";
		food[2] = food3;

		Food food4 = new Food();
		food4.foodName = "ţ����";
		food4.foodPrice = 10;
		food4.foodSize = "���";
		food[3] = food4;

		Food food5 = new Food();
		food5.foodName = "ţ����1";
		food5.foodPrice =    9;
		food5.foodSize = "С��";
		food[4] = food5;

		Food food6 = new Food();
		food6.foodName = "������1";
		food6.foodPrice = 9;
		food6.foodSize = "С��";
		food[5] = food6;

		Food food7 = new Food();
		food7.foodName = "������2";
		food7.foodPrice = 10;
		food7.foodSize = "���";
		food[6] = food7;

		Food food8 = new Food();
		food8.foodName = "��������1";
		food8.foodPrice = 9;
		food8.foodSize = "С��";
		food[7] = food8;

		Food food9 = new Food();
		food9.foodName = "��������2";
		food9.foodPrice = 9;
		food9.foodSize = "���";
		food[8] = food9;
	}

	// ��ӡ�˵�    
	//	��Ҫ�����ű��붨��һ�������������Լӣ�ע�����ɾ������һ������Ų��Լӣ������Լӱ���ŵ����
	public void printFoodList() {
		System.out.println(" �˵�\n ���� \t\t \t�۸�\t ");
		int a=0;
		for (int i = 0; i < food.length; i++) {
			Food foodlist = food[i];
			if (foodlist == null) {
				break;
			}
			if (foodlist.isDelete == false) {
				continue;
			}
			a++;
			System.out.println(a + "." + foodlist.foodName + "\t\t\t"
					+ foodlist.foodPrice + "\t\t   " + foodlist.foodSize );
		}
	}

	// ����ʳ��
	//����һ��food������food1 �����ӵ�ʳ��������ڣ���Ϊ��������food�Ļ��������ӵģ��������food1����
	//	food�У�ע�����Ǵ�foodΪ��ʱ��ʼ����food1���ֵ��
	
	public void addFood() {
		System.out.println("����ʳ��        \n������ʳ�����ƣ�         ���磺������");
		String foodName = ad.next();
		System.out.println("������ʳ��۸�          ���磺7");
		int foodPrice = ad.nextInt();
		System.out.println("������ʳ����          ���磺 ����  ");
		String foodSize = ad.next();
		Food food1 = new Food();
		food1.foodName = foodName;
		food1.foodPrice = foodPrice;
		food1.foodSize = foodSize;
		food1.isDelete = true;
		food1.payStatus = true;
		for (int i = 0; i < food.length; i++) {
			if (food[i] == null) {
				food[i] = food1;
				break;
			}
		}
	}

	// ɾ��ʳ��   
	//	����һ��food2�����飬��food�����е�ֵ����food2����Ҫɾ��һ���˱���ʹ������ɾ����״̬��ɾ
	//	������food�Ļ�����ɾ���������ڴ�ӡ�˵�ʱ���������ɾ���ľͲ������ӡ
	public void deleteFood() {
		while(true){
			System.out.println("����������Ҫɾ���Ĳ���");
			String deleteFoodName = ad.next();
			boolean flag = false; // δɾ��
			for (int i = 0; i < food.length; i++) {
				Food food2 = food[i];
				if (food2 == null) {
					break;
				}
				if (deleteFoodName.equals(food2.foodName)) {
					food2.isDelete = false;
					flag = true;  // ��ɾ��
					break;
				}
			}
			if (!flag){
				System.out.println("���������������������");
				System.out.println("1.����ɾ��    2.�˳�");
				int str=Menu.getInputIntNum();
				if(str==1){
					continue;
				}else{
					break;
				}
			}
		break;	
		}
		
	}
	
		//	�õ���ʵ������
	private int getRealIndex(int choose) {
		int a = 0;
		for (int i = 0; i < food.length; i++) {
			Food foodlist = food[i];
			if (foodlist == null) {
				break;
			}
			if (foodlist.isDelete == false) {
				continue;
			}
			a++;
			if (a == choose){
				return i;
			}
		}
		return -1;
	}
	
		//ѡ�� 
	public void chooseFood(Order order){
		SimpleDateFormat currentTime=new SimpleDateFormat("yyyy-MM-dd   HH:MM:SS");
		System.out.println("������������Ҫ�����     ����0����");
		int sum = 0;
		String describe = "";
		while (true) {
				int choose = ad.nextInt();
				if(choose == 0){
					break;
				}else if (choose >0 && choose <= food.length){
					int index = getRealIndex(choose);  //��ʵ����
					if (index >=0&&index<=food.length) {
						Food f = food[index];
						System.out.println(food[index]);
						describe += f.toString() + "\n";
						sum+=food[index].foodPrice;
					}else{
						System.out.println("���������д�");
					}
					
				}else {
					System.out.println("���������д�");
				}
		}
		String time = currentTime.format(new Date());
		describe = describe + "������һ��������"+sum +"Ԫ\n" + time;
		order.setFoodDescribe(describe);
		order.setOrderSum(sum);
		order.setOrderTime(time);
	}


	public static void main(String[] args) {
		FoodManage sc = new FoodManage();
		Order order = new Order();
		sc.initFoodInfo();
//		sc.printFoodList();
//		sc.addFood();
//		sc.printFoodList();
		sc.deleteFood();
		sc.printFoodList();
//		sc.chooseFood(order);
//		System.out.println(order.getFoodDescribe());
	}

}