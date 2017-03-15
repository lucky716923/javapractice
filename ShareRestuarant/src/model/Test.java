package model;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			Login login=new Login();
			login= login.login();
			String name = login.getName();
			int opt=login.getPrivlige();
			if(opt==1){
				while(true){
					System.out.println("admin 1.查询  2.切换用户  3.退出");
					int optt=sc.nextInt();
					if(optt==1){
						new Order().queryall();
						continue;
					}
					if(optt==2)
						break;
					if(optt==3)
						System.exit(0);
					else
						System.out.println("input error");
				}
			}
			if(opt==2){
				while(true){
					System.out.println("user 1.选菜  2.退单  3.切换用户  4.退出");
					int oppt=sc.nextInt();
					if(oppt==1){
						Foodd foodlist=new Foodd();
						Foodd[] fl=foodlist.getFoodList();
						foodlist.screenprint(fl);
						customer cus=new customer();
						cus.choosefood(name,fl);//xuancan hanshu
						continue;
					}
					if(oppt==2){
						new Order().backlist(name);
						System.out.println("退单成功");
						continue;
					}
					if(oppt==3)
						break;
					if(oppt==4){
						System.exit(0);
					}
					else
						System.out.println("input error");
				}
			}
		}
	}
}