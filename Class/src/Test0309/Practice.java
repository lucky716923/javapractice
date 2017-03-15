package Test0309;

import java.lang.reflect.Method;

public class Practice {
	private static String s="hello";
	public static void main(String[] args) {
		Class<?> c1=s.getClass();
		Class<?> c2=String.class;
		try {
			Class<?> c3=Class.forName("Test0309.Practice");
			System.out.println(c3);
		} catch (ClassNotFoundException e) {
			// TODO dAuto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1);
		System.out.println(c2);
		
		Method[] met=c1.getMethods();
		for(Method m:met){
			System.out.println(m);
		}
		
	}
	

}
