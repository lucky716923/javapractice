public class Circumference {
	static int plus(int a, int b) {
		return a * b;
	}

	static int divice(int a, int b) {
		return (a + b) * 2;
	}

	public static void main(String[] args) {
		System.out.print("面积=" + plus(5, 8) + "\n");
		System.out.print("周长=" + divice(5, 8));
	}
}