package Test0223;
//��дPerson�࣬���������������䣻��д���乹�췽������Setter��Gestter��������Ҫʹ��this�ؼ���

public class Person {
	private String name;//����
	private int age;//����
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
		System.out.println("������"+name+"\n"+"���䣺"+age);
	}
	public static void main(String[] args) {
		Person p=new Person("С��", 12);
		
	}
	

}
