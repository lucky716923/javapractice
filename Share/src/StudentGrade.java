

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		int score;
		double grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ĳɼ���");
		double a = sc.nextDouble();
		int b = (int) (a / 10);
		while (a >= 0 && a <= 100 && b < 10) {
			switch (b) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("���ĳɼ�������");
				break;
			case 6:
				break;
			case 7:
				System.out.println("���ĳɼ�����");
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				System.out.println("���ĳɼ�����");
				break;
			default:
				System.out.println("���������д�");
			}
			 a = sc.nextDouble();
			 b = (int) (a / 10);
		}
	}
}