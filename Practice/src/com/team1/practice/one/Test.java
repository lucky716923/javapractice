package com.team1.practice.one;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		StationeryShop ss=new StationeryShop();
		Master m=new Master("С��", "Ů", 20);
		Pen a1=new Pen("�ֱ�", 5,false);
		Pen a2=new Pen("Ǧ��", 3,true);
		Pen a3=new Pen("���Ա�", 2,true);
		System.out.println("��ӭ�����ľߵ�");
		System.out.println("1.�ֱ�   2.Ǧ��  3.���Ա�");
		System.out.println("��ѡ����ϲ���ıʵ����");
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
				System.out.println("���������д�");
		}
		Teacher t=new Teacher();
		t.showTeacher();
		Student sd=new Student();
		sd.showStudent();
		
//		String name=JOptionPane.showInputDialog("��ٻ");
//		JOptionPane.showInputDialog(name);
	}
}
