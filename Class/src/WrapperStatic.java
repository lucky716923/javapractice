import java.util.Scanner;

public class WrapperStatic {
	String name;
	int num;

	String setName(String casName) {
		name = casName;
		return name;
	}

	String getName() {
		return name;
	}

	int setNum(int newNum) {
		num = newNum;
		return num;
	}

	int getNum() {
		return num;
	}

	double save(double amount) {
		num += amount;
		return amount;
	}
	{System.out.println("����ʵ����");}
	static {System.out.println("���Ǿ�̬��");}
	public static void main(String[] args) {
		WrapperStatic c = new WrapperStatic();
		WrapperStatic a=new WrapperStatic();
		System.out.print("���������֣�");
		c.setName("����");
		System.out.println(c.getName());
		c.setNum(34);                                  
		System.out.println(c.getNum());
		System.out.println(c.save(12));
		System.out.println("��Ϊ��" + c.getNum());
	}
} 
