package Test0306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest {
	public static void main(String[] args) {
	BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("«Î ‰»Îƒ⁄»›");
	String str=null;
	try {
		str=br.readLine();
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(str);
	}

}
