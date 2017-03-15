
public class Weight {
	static double add(double x, double y) {
		return x / (y * y);
	}

	public static void main(String[] args) {
		System.out.println("正常：BMI=18~25" + "\n" + "超重：BIM=25~30");
		System.out.println("轻度肥胖：BIM=30~35" + "\n" + "中度肥胖:BIM=35~40");
		System.out.println("重度肥胖:BIM>40");
		System.out.println("BIM=" + add(34.5, 1.4));
	}
}
