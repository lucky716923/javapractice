
public class Weight {
	static double add(double x, double y) {
		return x / (y * y);
	}

	public static void main(String[] args) {
		System.out.println("������BMI=18~25" + "\n" + "���أ�BIM=25~30");
		System.out.println("��ȷ��֣�BIM=30~35" + "\n" + "�жȷ���:BIM=35~40");
		System.out.println("�ضȷ���:BIM>40");
		System.out.println("BIM=" + add(34.5, 1.4));
	}
}
