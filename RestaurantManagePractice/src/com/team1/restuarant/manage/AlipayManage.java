package com.team1.restuarant.manage;
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
			System.out.println("恭喜您存钱成功！");
		}

		public void pay(double amount) {
			balance -= amount;
			System.out.println("恭喜您支付成功！");
		}

		public boolean printResult() {
			Scanner sc = new Scanner(System.in);
			AlipayManage sa = new AlipayManage();
			System.out.println("请输入卡号：");
			String a = sc.next();
			System.out.println("请输入密码：");
			String b = sc.next();
			while (true) {
				System.out.println("请输入您所需要服务的：");
				System.out.println("1.查询余额\t2.存钱\t3.支付\t4.退出");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("余额:" + sa.getBalance());
					break;
				case 2:
					System.out.println("请输入存入金额：");
					sa.save(sc.nextDouble());
					break;
				case 3:
					System.out.println("请输入支付金额：");
					sa.pay(sc.nextDouble());
					break;
				default:
					System.out.println("您的输入有错误");
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

