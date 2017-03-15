public class Order2 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4, e = 5, f;
		f = a;
		a = e;
		e = b;
		b = d;
		d = e;
		e = f;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
