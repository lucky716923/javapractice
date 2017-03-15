package Test0215;

import java.util.Scanner;

public class PracticeMath {
	Scanner sc=new Scanner(System.in);
	public void printMath1(){
		System.out.println("请输入1~7之间的数");
		int a=sc.nextInt();
		switch(a){
		case 1:
			System.out.println(a+":"+"你所选的课程为数学课");
			break;
		case 2:
			System.out.println(a+":"+"你所选的课程为语文课");
		    break;
		case 3:
			System.out.println(a+":"+"你所选的课程为英语课");
			break;
		case 4:
			System.out.println(a+":"+"你所选的课程为高等代数");
		    break;
		case 5:
			System.out.println(a+":"+"你所选的课程为大学物理");
			break;
		case 6:
			System.out.println(a+":"+"你所选的课程为线性代数");
		    break;
		case 7:
			System.out.println(a+":"+"你所选的课程为计算机");
			break;
		default:System.out.println("您的输入有错");
		}
	}
	
	public void printMath2(){
		int salary=3000;
		int target=500;
		System.out.println("基础薪水为："+salary);
		System.out.println("销售目标为："+target);
	    System.out.println("请输入您的销售额：");
	    int b=sc.nextInt();
		if(b>=target){
			System.out.println("您的薪水为："+salary*(1+0.3));
		}else{
			System.out.println("您的薪水为："+salary*(1-0.3));
		}
		}

	public void printMath3() {
			System.out.println("请输入季节：");
			String c = sc.next();
			if (c.equals("春季")) {
				System.out.println( "春季的水果：" + "木瓜" + " 红香蕉" + " 樱桃番茄 "
						+ "杨桃" + "柑橘橙");
			} else if (c.equals("夏季")) {
				System.out.println("夏季的水果：" + "西瓜" + "桃" + " 柠檬 " + "芒果"
						+ "梨");
			} else if (c.equals("秋季")) {
				System.out.println("秋季的水果：" + "无花果 " + "牛奶蕉 " + " 番石榴 "
						+ "鹤首瓜" + "菠萝");
			} else if (c.equals("冬季")) {
				System.out.println( "冬季的水果：" + "柚子 " + "猕猴桃 " + " 番石榴 "
						+ "苹果" + "橘子");
			} else {
				System.out.println("对不起，您的输入有错！");
			}
	}
	
	public void printMath4(){
		int a=95283;
		System.out.println("每个位上的数字之和为："+(a%10)+"+"+(a/10%10)+"+"+
		(a/100%10)+"+"+(a/1000%10)+"+"+(a/10000)+"="+(a%10+a/10%10+a/100%10+a/1000%10+a/10000));
	}
	
	public void printMath5(){
		for(int i=1;i<7;i++){
			for(int j=1;j<i;j++)
			System.out.print("*"+"\t");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		PracticeMath sa=new PracticeMath();
		sa.printMath1();
		sa.printMath2();
		sa.printMath3();
		sa.printMath4();
		sa.printMath5();
	}
}
