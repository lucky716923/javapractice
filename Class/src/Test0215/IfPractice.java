package Test0215;


import java.util.Scanner;

import Concat.People;
import Concat.Point;
public class IfPractice {
	public void print(){
		Scanner s=new Scanner(System.in);
		System.out.println("�����룺");
		int a=s.nextInt();
		while(true){
		switch(a){
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		}
		}
	}

	public static void main(String[] args) {

	IfPractice sa=new IfPractice();
	sa.print();
}
}
