package com.team1.flower.manage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.team1.flower.po.Flower;
import com.team1.flower.po.Order;

public class FlowerManage {
	static Scanner input = new Scanner(System.in);
	static List<Flower> flower = new ArrayList<Flower>();
	static {
		flower.add(new Flower( 1,"��õ��", "����", "��������", 20, 200));
		flower.add(new Flower( 2,"����ܰ", "ף��", "ΰ����ʥ�������ĸ��", 20, 200));
		flower.add(new Flower( 3,"��������", "����", "����ĥ��İ���", 10, 300));
		flower.add(new Flower(4,"�ưٺ�", "ף��", "����ף��", 12, 200));
		flower.add(new Flower(5, "������", "ף��", "Ũ����⣬���������", 20, 200));
		flower.add(new Flower( 6,"�쿵��ܰ", "ף��", " ףĸ�׽�������", 20, 200));
		flower.add(new Flower( 7,"�ٺϻ�", "ף��", "����úϣ�������Ӧ", 20, 200));
	}
	// ��ӡ�����л�����Ϣ
	public static void flowerInfo() {
		Order or=new Order();
		for (int i=0;i<flower.size();i++) {
			System.out.println(flower.get(i));
		}
	}

	// ���ӻ�����Ϣ
	public static void addFlower() {
		Flower f = new Flower();
		while (true) {
			System.out.print("��������ţ�");
			f.setFlowerNumber(getInputInt());
			System.out.print("�����뻨����");
			f.setFlowerName(input.next());
			System.out.print("���������ͣ�");
			f.setFlowerType(input.next());
			System.out.print("�����뻨�");
			f.setFlowerLanguage(input.next());
			System.out.print("������۸�");
			f.setFlowerPrice(getInputInt());
			System.out.print("������������");
			f.setFlowerCount(getInputInt());
			flower.add(f);
			break;
		}

	}
     
	// ɾ��ĳ�ֻ�
	public static void delete() {
		System.out.print("��������Ҫɾ���Ļ�����");
		String str=input.next();
		for (int i=0;i<flower.size(); i++) {
			if(flower.get(i).flowerName.equals(str))
				flower.remove(i);
		}

	}
     //��ĳ�ֻ�����֧��
	public static void addFlowerCount(){
		System.out.print("����������Ҫ���Ļ���");
		String flowerName=input.next();
		System.out.print("����������Ҫ����������");
		int count=getInputInt();
		for (int i=0;i<flower.size(); i++) {
			if(flowerName.equals(flower.get(i).flowerName)){
				int flowerCount=flower.get(i).flowerCount+count;
				flower.get(i).setFlowerCount(flowerCount);
		     }
		     }
		
	}
	public static int getInputInt(){
		int str;
		while(true){
			str =0;
			try{
				str = input.nextInt();
				break;
			} catch (InputMismatchException e){
				input.nextLine();
				System.out.println("��������");
			}
		}
		return str;
	}
	public static void main(String[] args) {
		flowerInfo();
		addFlower();
		flowerInfo();
		delete();
		flowerInfo();
		addFlowerCount();  
		flowerInfo();
	}
}