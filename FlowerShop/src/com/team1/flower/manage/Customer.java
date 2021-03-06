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
	//选花
	public static void choosefood(Order order) {
		SimpleFormatter current=new SimpleFormatter();
		while (true) {
			System.out.print("请选择您需要的花的序号：【以0结束】");
			int number = input.nextInt();
			if (number == 0) {
				break;
			} else {
				System.out.print("请输入您想买的数量：");
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
			System.out.println((i + 1) + "：" + list.get(i).flowerName + "\t"
					+ list.get(i).flowerType + "\t"
					+ list.get(i).flowerLanguage + "\t"
					+ list.get(i).flowerPrice + "\t" + list.get(i).flowerCount);
		}
	}
//	public static void lookOrder() {
//		int sum=0;
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println((i + 1) + "：" + list.get(i).flowerName + "\t"
//					+ list.get(i).flowerType + "\t"
//					+ list.get(i).flowerLanguage + "\t"
//					+ list.get(i).flowerPrice + "\t" + list.get(i).flowerCount);
//			sum+=list.get(i).flowerPrice*list.get(i).flowerCount;
//		}
//		System.out.println("您此次消费金额为："+sum);
//	}
	//留言
	public static String leaveword() {
		System.out.println("您是否需要留言，请选择对应序号\n1.留言\n2.不需要留言");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if (opt == 2)
			return "";
		System.out.println("请您留言");
		String word = sc.next();
		System.out.println("留言成功");
		return word;
	}

	public static void main(String[] args) {
//		choosefood();;
//		lookOrder();
//		fm.flowerInfo();
//		leaveword();
	}
}
