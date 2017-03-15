package Test0301;

import java.util.Scanner;

public class Calender {
	Scanner s = new Scanner(System.in);

	public  void judge() {
		System.out.println("请输入年");
		int year = s.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"是闰年");	
		}else{
			System.out.println(year+"是平年");
		}	
	}
	
	public static void main(String[] args) {
		Calender c=new Calender();
		c.judge();
	}
	
}
