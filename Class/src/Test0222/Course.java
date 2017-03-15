package Test0222;

public class Course {
	public String courseTeacher;
	public String courseName;
	
	
	public Course() {}
	public Course(String courseTeacher, String courseName) {
		super();
		this.courseTeacher = courseTeacher;
		this.courseName = courseName;
	}
	public String getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	

}
