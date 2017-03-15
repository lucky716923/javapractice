package Test0216;
import java.util.Scanner;


public class NumberMax {
	public static void main(String[] args) {
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三个数：");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
//		if(a>b&&a>c){
//			System.out.println("最大值为："+a);
//		}else if(b>a&&b>c){
//			System.out.println("最大值为："+b);
//		}else{
//			System.out.println("最大数为："+c);
//		}
		int max=a;
		if(b>max){
			max=b;
		} if(c>max){
			max=c;
		}else if(b>c){
			max=b;
		}
		System.out.println("最大值为："+max);
		}
	}

}
