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
		System.out.println("�������ĺ�=" + sum(20, 5));
		System.out.println("�������Ĳ�=" + minus(20, 5));
		System.out.println("�������ĳ˻�=" + plus(20, 5));
		System.out.println("����������=" + divide(20, 5));
	}
}
