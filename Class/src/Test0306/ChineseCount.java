package Test0306;

import java.io.*;

public class ChineseCount {
	public static void main(String[] args) {
		File f=new File("F://Test.java");
		int  readTime;
		int count = 0;
		int number=0;//中文的个数
		char[] c=new char[1024];
		FileReader fs=null;
		try {
			fs = new FileReader(f);
			while((readTime=fs.read())!=-1){
				c[count]=(char)readTime;
				if(c[count]<='\u9FA5'&&c[count]>='\u4E00'){
					number++;
				}
				count++;
			}
			fs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("汉字的个数："+number);
		System.out.println("内容为："+new String(c, 0, count));
	}
}
