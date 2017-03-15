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
		System.out.println("您好！");
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
		System.out.println("\n姓名：" + name + "\n年龄:" + age + "\n性别:" + sex + "\n身高:" + height);
	}
	public People(){}

}
