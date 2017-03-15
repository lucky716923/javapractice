package Test0309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class ClientTest {
	public static void main(String[] args) {
		try {
			Socket s=new Socket(InetAddress.getLocalHost(),10086);
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			Scanner sc=new Scanner(System.in);
			while(true){
				String ad=sc.next();
				if("exit".equals(ad.trim())){
					pw.println("exit");
					pw.flush();
					break;
				}
				pw.println("客户端发来消息："+ad);
				pw.flush();
				String str=br.readLine();
				System.out.println("Client读取到："+str);
			}
			pw.close();
			br.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
