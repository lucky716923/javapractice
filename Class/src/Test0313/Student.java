package Test0313;

public class Student extends People{
    public String stuNumber;
	
	public Student(String name, int age,String stuNumber) {
		super(name, age);
		this.stuNumber=stuNumber;
		System.out.println("姓名为："+name+"   "+"年龄："+age+"  "+"学号："+stuNumber);
		// TODO Auto-generated constructor stub
	}

	public String PrintInfo(){
		return "姓名为："+name+"年龄"+age+"学号"+stuNumber;
	}
   public static void main(String[] args) {
	Student s=new Student("张三",20,"130901");
	s.PrintInfo();
}
}
