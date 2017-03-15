package Test0215;
import java.util.Scanner;

public class Forest {
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入森林覆盖面积：");
		double a = sc.nextDouble();
		System.out.println("请输入人数：");
		int b = sc.nextInt();
		System.out.println("人均覆盖面积为：" + (a / b) + "平方米");
	}
	public static void main(String[] args) {
		Forest sa = new Forest();
		sa.print();
	}

}
