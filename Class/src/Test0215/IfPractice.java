package Test0215;


import java.util.Scanner;

import Concat.People;
import Concat.Point;
public class IfPractice {
	public void print(){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入：");
		int a=s.nextInt();
		while(true){
		switch(a){
		case 0:
			System.out.println("星期日");
			break;
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		}
		}
	}

	public static void main(String[] args) {

	IfPractice sa=new IfPractice();
	sa.print();
}
}
