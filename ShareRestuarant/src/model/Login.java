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
			System.out.println("���ǹ���Ա������ͨ�û���1.admin  2.user");
			this.privlige=sc.nextInt();
			System.out.println("�������¼��");
			this.name=sc.next();
			System.out.println("����������");
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
			System.out.println("��������������������");
		}
		return this;
	}
}
