package Test0301;

import java.util.Scanner;

public class Calender {
	Scanner s = new Scanner(System.in);

	public  void judge() {
		System.out.println("��������");
		int year = s.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"������");	
		}else{
			System.out.println(year+"��ƽ��");
		}	
	}
	
	public static void main(String[] args) {
		Calender c=new Calender();
		c.judge();
	}
	
}
