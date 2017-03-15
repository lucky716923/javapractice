package Test0309;

import java.io.IOException;
import java.net.*;

public class ServerTest {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(10086);
			System.out.println("服务器正常启动。。。。。。。。");
			while(true){
				Socket s=ss.accept();
				System.out.println("用户接入成功。。。。。");
				new ServerThread(s).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
