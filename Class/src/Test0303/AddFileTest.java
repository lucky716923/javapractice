package Test0303;

import java.io.*;

public class AddFileTest {

	public static void main(String[] args) {
		String fileFirst="e:"+File.separator+"fileFirst.doc";
		String fileSecond="e:"+File.separator+"fileSecond.doc";
		File f1=new File(fileFirst);
		File f2=new File(fileSecond);
		try {
			f1.createNewFile();
			f2.createNewFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
