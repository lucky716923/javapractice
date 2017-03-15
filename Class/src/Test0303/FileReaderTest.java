package Test0303;

import java.io.File;
import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {
//		System.out.println("当前系统编码");
//		System.out.println(System.getProperty("file.encoding"));
		String fileName="f://test.txt";
		File f=new File(fileName);
		char[] c=new char[(int)f.length()];
		try {
			FileReader fr=new FileReader(f);
			fr.read(c);
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);
	}

}
