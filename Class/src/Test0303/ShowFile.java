package Test0303;

import java.io.File;
import java.io.IOException;

public class ShowFile {
	public static void main(String[] args) {
		String file="e:\\"+"FileFirst.txt";
		File f1=new File(file);
		try {
			f1.createNewFile();
			System.out.println("chuangjianchenggong ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
