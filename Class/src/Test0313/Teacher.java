package Test0313;

public class Teacher extends People{
    public int salary;
	public Teacher(String name, int age,int salary) {
		super(name, age);
		this.salary=salary;
		System.out.println("姓名为："+name+"    "+"年龄:"+age+"   "+"薪水:"+salary);
		// TODO Auto-generated constructor stub
	}
	public String PrintInfo(){
		return "姓名为："+name+"年龄"+age+"薪水"+salary;
	}
	public static void main(String[] args) {
		Teacher t=new Teacher("李老师",34,2300);
		t.PrintInfo();
	}

}
