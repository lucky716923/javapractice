package Concat;
public class People {
	
	private String name;
	private int age;
	private String sex;
	private double height;
	public People(String  name,int age,String sex,double height){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.height=height;
	}
	public void speak( ){
		System.out.println("���ã�");
	}
	
	public int add(int a,int b){
		return a+b;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	public void printPeopleInfo(){
		System.out.println("\n������" + name + "\n����:" + age + "\n�Ա�:" + sex + "\n���:" + height);
	}
	public People(){}

}
