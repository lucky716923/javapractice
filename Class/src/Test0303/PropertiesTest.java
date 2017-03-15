package Test0303;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties pt=new Properties();
		try {
			pt.load(new FileInputStream(new File("src/Test0303/test.properties")));
			pt.setProperty("name", "ÕÅÈý");
			pt.setProperty("password", "123456");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pt.getProperty("name"));
		System.out.println(pt.getProperty("password"));
		 
	}

}
