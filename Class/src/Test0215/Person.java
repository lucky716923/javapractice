package Test0215;
public class Person {
	private long totalPerson;
	private long princePerson;
	private long hongKongPerson;
	private long cityPerson;

	public Person(long totalPerson, long princePerson, long hongKongPerson,
			long cityperson) {
		this.totalPerson = totalPerson;
		this.princePerson = princePerson;
		this.hongKongPerson = hongKongPerson;
		this.cityPerson = cityPerson;
	}

	public void print() {
		System.out.println("�й����˿�����" + totalPerson + "��" + "\nʡ��ֱϽ�к����������˿ڣ�"
				+ totalPerson + "��" + "\n��������˿�����" + totalPerson + "��"
				+ "\n���������˿�����" + totalPerson + "��");
	}

	public static void main(String[] args) {
		Person sc = new Person(1370536875, 1339724852, 23162123, 552300);
		sc.print();
	}
}
