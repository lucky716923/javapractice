package List;

public class Method {
	public static <T> void getMethod(T x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		getMethod(3);
		getMethod("hello");
		getMethod(new Book("java",34));
	}

}
