package Test0313;

public class Student extends People{
    public String stuNumber;
	
	public Student(String name, int age,String stuNumber) {
		super(name, age);
		this.stuNumber=stuNumber;
		System.out.println("����Ϊ��"+name+"   "+"���䣺"+age+"  "+"ѧ�ţ�"+stuNumber);
		// TODO Auto-generated constructor stub
	}

	public String PrintInfo(){
		return "����Ϊ��"+name+"����"+age+"ѧ��"+stuNumber;
	}
   public static void main(String[] args) {
	Student s=new Student("����",20,"130901");
	s.PrintInfo();
}
}
