package Test0309;

import java.lang.reflect.Constructor;

public class Test2 {
	public static void main(String[] args) {
		Class<?> st=null;
		Student s1=null;
		Student s2=null;
		try {
			st=Class.forName("Test0309.Student");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			s1=(Student)st.newInstance();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Constructor<?>[] con=st.getConstructors();
		System.out.println("������еĹ��췽��");
		for (int i = 0; i < con.length; i++) {
			System.out.println("��"+i+"�����췽��"+con[i]);
		}
		
		try {
			s1=(Student)con[0].newInstance();
			s2=(Student)con[1].newInstance("zahngsan");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.setName("����");
		s1.setAge(20);
		System.out.println("�޲����Ĺ������"+s1);
		System.out.println("�в����Ĺ������"+s2);
	}

}