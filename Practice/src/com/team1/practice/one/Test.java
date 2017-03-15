package com.team1.practice.one;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		StationeryShop ss=new StationeryShop();
		Master m=new Master("小芳", "女", 20);
		Pen a1=new Pen("钢笔", 5,false);
		Pen a2=new Pen("铅笔", 3,true);
		Pen a3=new Pen("中性笔", 2,true);
		System.out.println("欢迎来到文具店");
		System.out.println("1.钢笔   2.铅笔  3.中性笔");
		System.out.println("请选择您喜欢的笔的序号");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		switch(num){
		case 1:
			try {
				m.buyPen(a1);
			} catch (PersonalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ss.update(a1);
			System.out.println(m.buyInfo());
			break;
		case 2:
			try {
				m.buyPen(a2);
			} catch (PersonalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ss.update(a2);
			System.out.println(m.buyInfo());
			break;	
		case 3:
			try {
				m.buyPen(a3);
			} catch (PersonalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ss.update(a3);
			System.out.println(m.buyInfo());
			break;
			default :
				System.out.println("您的输入有错");
		}
		Teacher t=new Teacher();
		t.showTeacher();
		Student sd=new Student();
		sd.showStudent();
		
//		String name=JOptionPane.showInputDialog("李倩");
//		JOptionPane.showInputDialog(name);
	}
}
