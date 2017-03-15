package Test0227;

public class Employee {
	private String name;
	private String id;
	private int pay;
	
	public void  info(){
		System.out.println("我是员工类");
	}

	public String getName() {
		return name;
	}
	
	public Employee(String name, String id, int pay) {
		super();
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
