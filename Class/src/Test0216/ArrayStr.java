package Test0216;

import java.util.Arrays;

//9、定义两个String类型的数组，a,b，
//将a中的第一个元素赋值到b数组中，
//从第二个数组的第二个位置中开始，赋值两个元素
public class ArrayStr {
	public static void main(String[] args) {
		String[] a={"苹果","香蕉","梨","芒果"};
		String[] b=new String[]{"hehe","sd","dfg","dgfe","rer","haha"};
		 b[2]=a[0];
		 for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		 b[1]="睡觉";
		 b[2]="上课";
		 for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		 
	}  
}
