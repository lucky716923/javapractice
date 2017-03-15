package Test0303;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
	public static void main(String[] args) {
		String fileName="f:test.txt";
		String word="hello word";
		File f=new File(fileName);
		try {
			FileWriter fw=new FileWriter(f,true);
			fw.write(word);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
