package Test0216;

import java.util.Arrays;
import java.util.Scanner;

//7、有一个数列：8，4，2，1，23，344，12
//1）猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
//2）求数列中所有数值的和
//3）循环输出数列的值

public class Random {

	public static void main(String[] args) {
		int []  a={8,4,2,1,23,344,12};
//		Scanner s=new Scanner(System.in);
//		int sc=0;
//		
//		while(true){
//			System.out.println("请输入一个数：");
//		    sc=s.nextInt();	    
//		    boolean flag = false;
//		    for(int i = 0; i < a.length; i++){
//		    	if(sc==a[i]){
//		    		flag = true;
//		    	}
//		    }
//		    
//		    if(flag){
//		    	System.out.println("此数包含在数组中");
//		    } else {
//		    	System.out.println("此数不包含在数组中");
//		    }
//		}	
		Scanner sc=new Scanner(System.in);
		int b = 0;
		int sum=0;
		for(int i=1;i<6;i++){
			System.out.println("请输入第"+i+"个数");
			 b=sc.nextInt();
		Arrays.sort(a);
	    int c=Arrays.binarySearch(a, b);
	    if(c>0){
	    	System.out.println(b+"包含在内");
	    }else{
	    	System.out.println(b+"不包含在内");
	    }
		}
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			System.out.println(a[i]);
		}
		System.out.println("sum="+sum);
	}
}
