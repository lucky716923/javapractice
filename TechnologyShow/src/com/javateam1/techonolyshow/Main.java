package com.javateam1.techonolyshow;

import java.util.Scanner;

public class Main {

	static void runSystem(){
		Scanner input = new Scanner(System.in);	// ��ʼ�����빤��
		Person poet = new Person();	// ����ʫ�˶���
		
		System.out.println("������������");
		poet.setName(input.next());
		System.out.println("��ӭ�㣬" + poet.getName());
		
		while(true){
			System.out.println("��ѡ������\n1.����   2.����");
			System.out.println("���������ַ�������ʾ");
			int str = input.nextInt();
			if (str == 1){
				poet.card.runSystem(input);
			} else if(str == 2){
				poet.car.runCarSystem(input, poet);
			} else{
				System.out.println("лл�ݹ�");
				break;
			}
				
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("��ʾ��ʼ\n");
		runSystem();
		System.out.println("\n��ʾ����");
	}
	
	
}
