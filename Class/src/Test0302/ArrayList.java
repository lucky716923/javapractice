package Test0302;

public class ArrayList <E>{
	private String name;
	private E adress;
	private E hight;
	private int age;
	
	
	
	@Override
	public String toString() {
		return "ArrayList [name=" + name + ", adress=" + adress + ", hight="
				+ hight + ", age=" + age + "]";
	}
	public ArrayList(String name, E adress, E hight, int age) {
		super();
		this.name = name;
		this.adress = adress;
		this.hight = hight;
		this.age = age;
	}
	public ArrayList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public E getAdress() {
		return adress;
	}
	public void setAdress(E adress) {
		this.adress = adress;
	}
	public E getHight() {
		return hight;
	}
	public void setHight(E hight) {
		this.hight = hight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
