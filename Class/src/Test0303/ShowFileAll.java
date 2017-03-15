package Test0303;

import java.io.File;

public class ShowFileAll {
	public static void main(String[] args) {
		String first="f:/ORACLE"; 
		File  f=new File(first);
		File[] f1=f.listFiles();
		String[] str=f.list();
		for (int i = 0; i < str.length; i++) {
			System.out.println("lujing"+f1[i].getParent()+f1[i].getName()+
					f1[i].length());
		}
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
		}
		
	}

}
