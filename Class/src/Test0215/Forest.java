package Test0215;
import java.util.Scanner;

public class Forest {
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɭ�ָ��������");
		double a = sc.nextDouble();
		System.out.println("������������");
		int b = sc.nextInt();
		System.out.println("�˾��������Ϊ��" + (a / b) + "ƽ����");
	}
	public static void main(String[] args) {
		Forest sa = new Forest();
		sa.print();
	}

}
