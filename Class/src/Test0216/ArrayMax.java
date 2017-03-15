package Test0216;

import java.util.Scanner;

public class ArrayMax {
	public static void main(String[] args) {
		int [] ary=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=1;i<6;i++){
			System.out.println("请输入第"+i+"个数：");
			ary[i-1]=s.nextInt();
		}
		int max=ary[0];
	    for(int i=1;i<5;i++){
	    	if(ary[i]>max){
	    		max=ary[i];
	    	}
	    }
		System.out.println(max);
	}
}
