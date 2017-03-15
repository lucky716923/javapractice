package Test0303;
import java.io.*;
public class readFile {
	public static void main(String[] args) {
		String filename="src/Test0303/test.txt";
		File file=new File(filename);
		byte b[]=new byte[(int)file.length()];
		String str="\n哈哈哈";
		try {
			//字节流读取和写入
			InputStream input=new FileInputStream(file);
			input.read(b);
			System.out.println(new String(b));
			input.close();
			OutputStream output=new FileOutputStream(file,true);
			output.write(str.getBytes());
			output.close();
			
			
			
//			 * 字符流读取和写入
			char[] cbuf=new char[1024];
			FileReader fr=new FileReader(file);
			fr.read(cbuf);
			System.out.println(new String(cbuf));
			
			FileWriter fw=new FileWriter(file);
			fw.write(new String(b)+"\n北京天安门");
			fw.close();
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
