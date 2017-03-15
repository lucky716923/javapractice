package Test0306;

import java.io.*;

public class Change {

	public static void main(String[] args) {
//		String fileName="F://test.txt";
//		File f=new File(fileName);
//		try {
//			InputStreamReader uft=new InputStreamReader(new FileInputStream(f),"UTF-8");
//			InputStreamReader gbk=new InputStreamReader(new FileInputStream(f),"GBK");
//			char[] c1=new char[1024];
//			char[] c2=new char[1024];
//			int iuft=uft.read(c1);
//			int igbk=gbk.read(c2);
//			uft.close();
//			gbk.close();
//			System.out.println("UTF-8的内容为："+ new String(c1, 0, iuft));
//			System.out.println("GBK的内容为："+ new String(c2, 0, igbk));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 	
		
		String file1="f://test.txt";
		String file2="f://tst.txt";
		File f1=new File(file1);
		File f2=new File(file2);
		try {
			OutputStreamWriter ut=new OutputStreamWriter(new FileOutputStream(file1),"UtF-8");
			OutputStreamWriter gb=new OutputStreamWriter(new FileOutputStream(file2),"GBK");
			char[] word="shjd我爱北京".toCharArray();
			ut.write(word);
			gb.write(word        );
			ut.close();
			gb.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("UTF-8的长度："+f1.length());
		System.out.println("GBK的长度："+f2.length());
	}
}
