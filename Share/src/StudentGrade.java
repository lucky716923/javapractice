

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		int score;
		double grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入您的成绩：");
		double a = sc.nextDouble();
		int b = (int) (a / 10);
		while (a >= 0 && a <= 100 && b < 10) {
			switch (b) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("您的成绩不及格");
				break;
			case 6:
				break;
			case 7:
				System.out.println("您的成绩良好");
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				System.out.println("您的成绩优秀");
				break;
			default:
				System.out.println("您的输入有错");
			}
			 a = sc.nextDouble();
			 b = (int) (a / 10);
		}
	}
}