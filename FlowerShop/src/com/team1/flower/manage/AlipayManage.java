package com.team1.flower.manage;
import java.util.Scanner;


public class AlipayManage {
		private double balance;

		void setBbalance(double balance) {
			this.balance = balance;
		}

		public double getBalance() {
			return balance;
		}

		public void save(double amount) {
			balance += amount;
			System.out.println("��ϲ����Ǯ�ɹ���");
		}

		public void pay(double amount) {
			balance -= amount;
			System.out.println("��ϲ��֧���ɹ���");
		}
		public void printResult() {
			Scanner sc = new Scanner(System.in);
			AlipayManage sa = new AlipayManage();
			System.out.println("�����뿨�ţ�");
			String a = sc.next();
			boolean flag=true;
			System.out.println("���������룺");
			String b = sc.next();
			while (true) {
				if(flag==false)break;
				System.out.println("������������Ҫ����ģ�");
				System.out.println("1.��ѯ���\t2.��Ǯ\t3.֧��\t4.�˳�");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("���:" + sa.getBalance());
					break;
				case 2:
					System.out.println("��Ҫ��Ľ��Ϊ��");
					sa.save(sc.nextDouble());
					break;
				case 3:
					System.out.println("������֧����");
					sa.pay(sc.nextDouble());
					break;
				case 4:
					flag=false;
					break;
				default:
					System.out.println("���������д���");
					sc.nextDouble();
					break;
				}
			}                                                          
		}

		public static void main(String[] args) {
			AlipayManage sa = new AlipayManage();
			Scanner sc = new Scanner(System.in);
			sa.printResult();
		}
	}

