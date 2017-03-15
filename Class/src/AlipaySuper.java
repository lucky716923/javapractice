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
		System.out.println("恭喜您存钱成功！");
	}

	void give(double amount) {
		balance -= amount;
		System.out.println("恭喜您转账成功！");
	}

	void withDraw(double amount) {
		balance -= amount;
		System.out.println("恭喜您提现成功！");
	}

	boolean printResult() {
		Scanner sc = new Scanner(System.in);
		AlipaySuper sa = new AlipaySuper();
		System.out.println("请输入卡号：");
		String a = sc.next();
		System.out.println("请输入密码：");
		String b = sc.next();
		while (true) {
			System.out.println("请输入您所需要服务的：");
			System.out.println("1.查询余额\t2.存钱\t3.转账\t4.提现\t5.退出");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("余额:" + sa.getBalance());
				break;
			case 2:
				System.out.println("请输入存入金额：");
				sa.save(sc.nextDouble());
				break;
			case 3:
				System.out.println("请输入转账金额：");
				sa.give(sc.nextDouble());
				break;
			case 4:
				System.out.println("请输入提现金额：");
				sa.withDraw(sc.nextDouble());
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("您的输入有错误");
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
