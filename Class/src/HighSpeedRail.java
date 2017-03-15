public class HighSpeedRail {
	static double divice(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		System.out.print("概算投资：2209亿元" + "\n" + "运行时间：4.5小时" + "\n");
		System.out.println("里程：1318千米" + "\n" + "通车时间：2011年末" + "\n"
				+ "速度：350km/h");
		System.out.print("京泸高铁每千米投资额=" + divice(2209, 1318) + "亿元");
	}
}