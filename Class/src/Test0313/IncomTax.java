package Test0313;

import java.util.Scanner;

public class IncomTax {
	static Scanner input=new Scanner(System.in);
	public static void info(){
		System.out.print("请输入员工姓名：");
		String name=input.next();
		System.out.print("请输入员工工资：");
		int salary=input.nextInt();
		System.out.print("请输入员工加班补贴：");
		int money=input.nextInt();
		double sum=salary+money;
		System.out.print("员工李刚的税前收入为"+sum+"元，");
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
		System.out.println("税后收入为"+money2+
				"元，您缴纳的个人所得税为"+save);
	}
	public static void main(String[] args) {
		info();
		
	}

}
