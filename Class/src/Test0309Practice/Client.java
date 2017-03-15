package Test0309Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private static Socket s;
	private static BufferedReader br=null;
	private static PrintWriter pw=null;
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			s=new Socket(InetAddress.getLocalHost(),5500);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			while(true){
				System.out.println("�ͻ���˵��");
				String str=input.next();
				pw.println(str);
				pw.flush();
				String st=br.readLine();
				System.out.println("����˷�����ϢΪ��"+st);
				if(st.equals("exit")){
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 

}