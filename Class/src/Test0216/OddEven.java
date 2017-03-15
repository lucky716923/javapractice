package Test0216;
import java.util.Scanner;


public class OddEven {
	public static void main(String[] args) {
//		for(int i=0;i<30;i++){
//			if(i%2==1){
//				System.out.println(i+"是奇数");
//			}else{
//				System.out.println(i+"是偶数");
//			}
//		}
		
//		int time = 0;
//		while(time<10){
//			Scanner sc=new Scanner(System.in);
//			System.out.println("请输入一个整数：");
//			int a=sc.nextInt();
//		if(a%2==1){
//			System.out.println(a+"是奇数");
//		}else{
//			System.out.println(a+"是偶数");
//		}
//		time++;
//		}
		Scanner sc=new Scanner(System.in);
		int b = 0;
		while(b<30){
        System.out.println("输出一个随机数:");
		int a=(int)((Math.random())*200);
		if(a%2==0){
			System.out.println(a+"是偶数");
		}else{
			System.out.println(a+"是奇数");
		}
		b++;
		}
	} 
}
