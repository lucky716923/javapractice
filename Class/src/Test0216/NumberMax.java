package Test0216;
import java.util.Scanner;


public class NumberMax {
	public static void main(String[] args) {
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
//		if(a>b&&a>c){
//			System.out.println("���ֵΪ��"+a);
//		}else if(b>a&&b>c){
//			System.out.println("���ֵΪ��"+b);
//		}else{
//			System.out.println("�����Ϊ��"+c);
//		}
		int max=a;
		if(b>max){
			max=b;
		} if(c>max){
			max=c;
		}else if(b>c){
			max=b;
		}
		System.out.println("���ֵΪ��"+max);
		}
	}

}
