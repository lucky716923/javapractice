package Test0309Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private static ServerSocket ss=null;
	private static Socket s;
	private static BufferedReader br=null;
	private static PrintWriter pw=null;
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			ss=new ServerSocket(5500);
			System.out.println("服务器正常启动。。。。。。");
			s=ss.accept();
			System.out.println("连接成功"+s.getRemoteSocketAddress());
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true){
				String str=br.readLine();
				System.out.println("客户端发来内容："+str);
				System.out.println("服务器输入内容：");
				String sc=input.next();
				pw.println(sc);
				pw.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.close();
	}

}
