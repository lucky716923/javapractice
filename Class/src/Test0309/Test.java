package Test0309;

public class Test {
	public static void main(String[] args) {
		Class<?> st=null;
		Student s1=null;
		try {
			st=Class.forName("Test0309.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s1=(Student)st.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.setName("����");
		s1.setAge(20);
		System.out.println(s1);
	}

}
