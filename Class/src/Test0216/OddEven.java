package Test0216;
import java.util.Scanner;


public class OddEven {
	public static void main(String[] args) {
//		for(int i=0;i<30;i++){
//			if(i%2==1){
//				System.out.println(i+"������");
//			}else{
//				System.out.println(i+"��ż��");
//			}
//		}
		
//		int time = 0;
//		while(time<10){
//			Scanner sc=new Scanner(System.in);
//			System.out.println("������һ��������");
//			int a=sc.nextInt();
//		if(a%2==1){
//			System.out.println(a+"������");
//		}else{
//			System.out.println(a+"��ż��");
//		}
//		time++;
//		}
		Scanner sc=new Scanner(System.in);
		int b = 0;
		while(b<30){
        System.out.println("���һ�������:");
		int a=(int)((Math.random())*200);
		if(a%2==0){
			System.out.println(a+"��ż��");
		}else{
			System.out.println(a+"������");
		}
		b++;
		}
	} 
}
