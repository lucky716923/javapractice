package Test0303;

/**
 * @author Lucky
 *
 */
public class Users implements Comparable<Users>{
	private String name;
	private String password;
	private int age;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Users(String name, String password, int age, String phone) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.phone = phone;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int age) {
		super();
		this.age = age;
	}
	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", age="
				+ age + ", phone=" + phone + "]";
	}
	@Override
	public int compareTo(Users o) {
//		// TODO Auto-generated method stub
		if(age>o.age){
			return 1;
		}else if(age<o.age){
			return -1;
		}else{
			return 0;
		}
	}
	

}
