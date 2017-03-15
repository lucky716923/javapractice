package Test0309;

import java.lang.reflect.Method;

public class ClassDemo {
	public static void main(String[] args) {
		Student s=new Student();
		String info=s.getClass().getName();
		System.out.println("S对象的类路径信息是："+info);
		Class<?> c1=null ;
		Class<?> c2=null ;
		Class<?>  c3=null ;
		
		try {
			c1=Class.forName("Test0309.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c2=Student.class;
		c3=new Student().getClass();
		System.out.println("c1="+c1.getName());
		System.out.println("c2="+c2.getName());
		System.out.println("c3="+c3.getName());
		
		Method[] m=c1.getMethods();
		for(Method x:m){
			System.out.println(x);
		}
	}

}
