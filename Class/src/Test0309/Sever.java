package Test0309;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Sever {
	 private static BufferedReader  br=null;
	 private static PrintWriter bw=null;
	 private static ServerSocket ss;
	 private static Socket s;
	 static Scanner input=new Scanner(System.in);
	
	 public static void main(String[] args) {
		 try {
			ss=new ServerSocket(5500);
			System.out.println("��������������........");
			s=ss.accept();
			System.out.println("���ӳɹ�"+s.getRemoteSocketAddress());
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			bw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true){
				String string=br.readLine();
				System.out.println("Sever�������˶���"+string);
				System.out.println("Sever�������������Ҫ���͵����ݣ�");
				String sd=input.next();
				bw.println(sd);
				bw.flush();//ˢ��
				if(sd.equals("exit")){
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 bw.close();
		 try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}