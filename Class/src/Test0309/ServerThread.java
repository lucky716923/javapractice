package Test0309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerThread extends Thread{
	private Socket s;

	public ServerThread(Socket s) {
		super();
		this.s = s;
	}
	
	public void  run(){
		BufferedReader br=null;
		PrintWriter pw=null;
		try {
		br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
		while(true){
			String string=br.readLine();
			System.out.println("Sever服务器读到："+s.getRemoteSocketAddress()+string);
			System.out.println("Server服务器请输入：");
			Scanner input=new Scanner(System.in);
			String str=input.next();
			pw.println(str+"["+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").
					format(new Date())+"]");
			pw.flush();
			if(str.equals("exit")){
				break;
			}
		}
		} catch (IOException e) {
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
