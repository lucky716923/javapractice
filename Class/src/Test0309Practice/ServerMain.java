package Test0309Practice;

import java.io.IOException;
import java.net.*;

public class ServerMain {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(10086);
			System.out.println("������������������������������");
			while(true){
				Socket s=ss.accept();
				System.out.println("�û�����ɹ�����������");
				new SeverTest(s).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}