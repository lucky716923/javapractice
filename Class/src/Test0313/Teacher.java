package Test0313;

public class Teacher extends People{
    public int salary;
	public Teacher(String name, int age,int salary) {
		super(name, age);
		this.salary=salary;
		System.out.println("����Ϊ��"+name+"    "+"����:"+age+"   "+"нˮ:"+salary);
		// TODO Auto-generated constructor stub
	}
	public String PrintInfo(){
		return "����Ϊ��"+name+"����"+age+"нˮ"+salary;
	}
	public static void main(String[] args) {
		Teacher t=new Teacher("����ʦ",34,2300);
		t.PrintInfo();
	}

}
