package Test0223;
//2.����Ա���࣬����������ַ�������������ԣ�������;�������������ԣ��������н�ͨ�����������������ܲ��ţ�
//�������ж�����ʾ�������Ϣ�ķ���show������ʵ�ַ�ʽ��ͬ����д�����๹�췽���������Ե�get��set������
//��Ҫ�õ�this��super�ؼ��֡�

public class Employee {
	public String name;//Ա������
	public String address;//��ַ
	public int salary;//нˮ
	
	
	
	public Employee() {	}
	public Employee(String name, String address, int salary) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		
	}
	public void showInfo(){
		System.out.println("������"+this.name+"\n"+"סַ��"+this.address+"\n"+"�������ʣ�"+this.salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
