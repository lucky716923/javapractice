package Test0313;

import java.util.Scanner;

public class IncomTax {
	static Scanner input=new Scanner(System.in);
	public static void info(){
		System.out.print("������Ա��������");
		String name=input.next();
		System.out.print("������Ա�����ʣ�");
		int salary=input.nextInt();
		System.out.print("������Ա���Ӱಹ����");
		int money=input.nextInt();
		double sum=salary+money;
		System.out.print("Ա����յ�˰ǰ����Ϊ"+sum+"Ԫ��");
		double count;
		double save;
		if(sum<2000){
			count=0;
		}else{
			count=sum-2000;
		}
		if(count>0&&count<=500){
			save=count*0.05;
		}else if(count>500&&count<=2000){
			save=count*0.1;
		}else if(count>2000&&count<=5000){
			save=count*0.15;
		}else if(count>5000&&count<=20000){
			save=count*0.2;
		}else{
			save=count*0.3;
		}
		double money2=sum-save;
		System.out.println("˰������Ϊ"+money2+
				"Ԫ�������ɵĸ�������˰Ϊ"+save);
	}
	public static void main(String[] args) {
		info();
		
	}

}