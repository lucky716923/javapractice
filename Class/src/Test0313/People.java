package Test0313;

public class People {
	 public static String name;
	 public static int age;
	 
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		People.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		People.age = age;
	}

	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String PrintInfo(){
		return "����Ϊ��"+name+"����"+age;
	}
	

}
