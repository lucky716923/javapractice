package Test0222;

public class Student {
	private String name;
	private int age;
	private String sex;
	public School school;
	
	
	public Student() {}
	
	public Student(String name, int age, String sex, School school) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.school = school;
		System.out.println(name+"\t"+age+"\t"+sex+"\n"+"��"+school+"ʵϰ");
	}
	
	
	public void courseInfo(Course course){
		course.courseName="����";
		course.courseTeacher="����ʦ";
		System.out.println("ѡ����"+course.courseTeacher+"����"+course.courseName+"���ſ�");
	}
	
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	

}
