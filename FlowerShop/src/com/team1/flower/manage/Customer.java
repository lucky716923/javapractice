package com.team1.flower.manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import com.team1.flower.po.Flower;
import com.team1.flower.po.Order;
import com.team1.flower.po.User;

public class Customer {
	static FlowerManage fm;
	static Scanner input = new Scanner(System.in);
	static List<Flower> list = new ArrayList<Flower>();
	//ѡ��
	public static void choosefood(Order order) {
		SimpleFormatter current=new SimpleFormatter();
		while (true) {
			System.out.print("��ѡ������Ҫ�Ļ�����ţ�����0������");
			int number = input.nextInt();
			if (number == 0) {
				break;
			} else {
				System.out.print("�������������������");
				int count = FlowerManage.getInputInt();
				String describe="";
				int sum=0;
				for (int i = 0; i < fm.flower.size(); i++) {
					Flower fms = fm.flower.get(i);
					if (number == fms.flowerNumber) {
						int flowerCount = fms.flowerCount - count;
						fms.setFlowerCount(flowerCount);
						Flower f = new Flower();
						f.setFlowerName(fms.getFlowerName());
						f.setFlowerType(fms.getFlowerType());
						f.setFlowerLanguage(fms.getFlowerLanguage());
						f.setFlowerPrice(fms.getFlowerPrice());
						f.setFlowerCount(count);
						list.add(f);
						describe=list.toString();
						
					}
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "��" + list.get(i).flowerName + "\t"
					+ list.get(i).flowerType + "\t"
					+ list.get(i).flowerLanguage + "\t"
					+ list.get(i).flowerPrice + "\t" + list.get(i).flowerCount);
		}
	}
//	public static void lookOrder() {
//		int sum=0;
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println((i + 1) + "��" + list.get(i).flowerName + "\t"
//					+ list.get(i).flowerType + "\t"
//					+ list.get(i).flowerLanguage + "\t"
//					+ list.get(i).flowerPrice + "\t" + list.get(i).flowerCount);
//			sum+=list.get(i).flowerPrice*list.get(i).flowerCount;
//		}
//		System.out.println("���˴����ѽ��Ϊ��"+sum);
//	}
	//����
	public static String leaveword() {
		System.out.println("���Ƿ���Ҫ���ԣ���ѡ���Ӧ���\n1.����\n2.����Ҫ����");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if (opt == 2)
			return "";
		System.out.println("��������");
		String word = sc.next();
		System.out.println("���Գɹ�");
		return word;
	}

	public static void main(String[] args) {
//		choosefood();;
//		lookOrder();
//		fm.flowerInfo();
//		leaveword();
	}
}