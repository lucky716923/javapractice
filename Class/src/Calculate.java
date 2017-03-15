public class Calculate {
	static int sum(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	static int plus(int x, int y) {
		return x * y;
	}

	static int divide(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		System.out.println("两个数的和=" + sum(20, 5));
		System.out.println("两个数的差=" + minus(20, 5));
		System.out.println("两个数的乘积=" + plus(20, 5));
		System.out.println("两个数的商=" + divide(20, 5));
	}
}
