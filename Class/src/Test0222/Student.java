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
		System.out.println(name+"\t"+age+"\t"+sex+"\n"+"在"+school+"实习");
	}
	
	
	public void courseInfo(Course course){
		course.courseName="高数";
		course.courseTeacher="高老师";
		System.out.println("选择了"+course.courseTeacher+"带的"+course.courseName+"这门课");
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
