import java.util.Scanner;

public class AlipaySuper {
	double balance;

	void setBbalance(double balance) {
		this.balance = balance;
	}

	double getBalance() {
		return balance;
	}

	void save(double amount) {
		balance += amount;
		System.out.println("��ϲ����Ǯ�ɹ���");
	}

	void give(double amount) {
		balance -= amount;
		System.out.println("��ϲ��ת�˳ɹ���");
	}

	void withDraw(double amount) {
		balance -= amount;
		System.out.println("��ϲ�����ֳɹ���");
	}

	boolean printResult() {
		Scanner sc = new Scanner(System.in);
		AlipaySuper sa = new AlipaySuper();
		System.out.println("�����뿨�ţ�");
		String a = sc.next();
		System.out.println("���������룺");
		String b = sc.next();
		while (true) {
			System.out.println("������������Ҫ����ģ�");
			System.out.println("1.��ѯ���\t2.��Ǯ\t3.ת��\t4.����\t5.�˳�");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("���:" + sa.getBalance());
				break;
			case 2:
				System.out.println("����������");
				sa.save(sc.nextDouble());
				break;
			case 3:
				System.out.println("������ת�˽�");
				sa.give(sc.nextDouble());
				break;
			case 4:
				System.out.println("���������ֽ�");
				sa.withDraw(sc.nextDouble());
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("���������д���");
				sc.nextDouble();
				break;
			}
		}                                                          
	}

	public static void main(String[] args) {
		AlipaySuper sa = new AlipaySuper();
		Scanner sc = new Scanner(System.in);
		sa.printResult();
	}
}
