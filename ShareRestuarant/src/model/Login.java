package model;

import java.util.Scanner;

public class Login {
	private int privlige;
	private String name;
	private String passwd;
	public int getPrivlige() {
		return privlige;
	}
	public void setPrivlige(int privlige) {
		this.privlige = privlige;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Login login(){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("您是管理员还是普通用户，1.admin  2.user");
			this.privlige=sc.nextInt();
			System.out.println("请输入登录名");
			this.name=sc.next();
			System.out.println("请输入密码");
			this.passwd=sc.next();
			if(this.name .equals("") || this.passwd.equals(""))
				continue;
			if(this.privlige==1 && this.name.equals("admin") && this.passwd.equals("admin")){
				System.out.println("admin login success");
				break;
			}
			else if(this.privlige==2){
				System.out.println("user login success");
				break;
			}
			System.out.println("您输入有误，请重新输入");
		}
		return this;
	}
}
