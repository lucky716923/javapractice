package Test0223;
//2.现有员工类，有姓名，地址，基本工资属性，董事类和经理类除以上属性，董事类有交通补助，经理类有所管部门，
//三个类中都有显示其基本信息的方法show，但其实现方式不同，请写出各类构造方法，及属性的get，set方法。
//并要用到this和super关键字。

public class Employee {
	public String name;//员工姓名
	public String address;//地址
	public int salary;//薪水
	
	
	
	public Employee() {	}
	public Employee(String name, String address, int salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		
	}
	public void showInfo(){
		System.out.println("姓名："+this.name+"\n"+"住址："+this.address+"\n"+"基本工资："+this.salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
