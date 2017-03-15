package Test0222;

public class School {
	private String address;
	private String schoolName;
	
	
	public School() {}
	
	public School(String address, String schoolName) {
		super();
		this.address = address;
		this.schoolName = schoolName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String toString() {
		return address+ schoolName;
	}
	
	
}
