package Test0216;
import java.util.Arrays;


public class Array {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 23;
		a[1] = 34;
		a[2] = 45;
		a[3] = 12;
		a[4] = 23;
		int [] c;
		int d;
//		Arrays.sort(a);
//		d=Arrays.binary;
//		System.out.println(d);
//		c=Arrays.copyOf(a, 4);
//		c=Arrays.copyOfRange(a, 0, 2);
		Arrays.fill(a, 22);
//		int[] b;
//		b = a;
//		b[3] = 34;
//		b[0] = 67;
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
