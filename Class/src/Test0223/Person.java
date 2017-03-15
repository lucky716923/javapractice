package Test0223;
//请写Person类，有属性姓名和年龄；请写出其构造方法，及Setter，Gestter方法，需要使用this关键字

public class Person {
	private String name;//姓名
	private int age;//年龄
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("姓名："+name+"\n"+"年龄："+age);
	}
	public static void main(String[] args) {
		Person p=new Person("小明", 12);
		
	}
	

}
