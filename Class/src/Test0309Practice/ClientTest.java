
package Test0309Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {
	private static Socket s=null;
	private static BufferedReader br=null;
	private static PrintWriter pw=null;
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		try {
		    s=new Socket(InetAddress.getLocalHost(),10086);
			br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			System.out.print("��������Ϣ��");
			String str=input.next();
			while(true){
				if("exit".equals(str.trim())){
					pw.println("exit");
					pw.flush();
					break;
			}
			pw.println(str);
			pw.flush();	
			String sc=br.readLine();
			System.out.println("����˷�����Ϣ��"+sc);
			}
			br.close();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}