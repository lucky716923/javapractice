package Test0216;

import java.util.Arrays;
import java.util.Scanner;

//7����һ�����У�8��4��2��1��23��344��12
//1��������Ϸ���Ӽ�������������һ�����ݣ��ж��������Ƿ��������
//2����������������ֵ�ĺ�
//3��ѭ��������е�ֵ

public class Random {

	public static void main(String[] args) {
		int []  a={8,4,2,1,23,344,12};
//		Scanner s=new Scanner(System.in);
//		int sc=0;
//		
//		while(true){
//			System.out.println("������һ������");
//		    sc=s.nextInt();	    
//		    boolean flag = false;
//		    for(int i = 0; i < a.length; i++){
//		    	if(sc==a[i]){
//		    		flag = true;
//		    	}
//		    }
//		    
//		    if(flag){
//		    	System.out.println("����������������");
//		    } else {
//		    	System.out.println("������������������");
//		    }
//		}	
		Scanner sc=new Scanner(System.in);
		int b = 0;
		int sum=0;
		for(int i=1;i<6;i++){
			System.out.println("�������"+i+"����");
			 b=sc.nextInt();
		Arrays.sort(a);
	    int c=Arrays.binarySearch(a, b);
	    if(c>0){
	    	System.out.println(b+"��������");
	    }else{
	    	System.out.println(b+"����������");
	    }
		}
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			System.out.println(a[i]);
		}
		System.out.println("sum="+sum);
	}
}
