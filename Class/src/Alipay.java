public class Alipay {
 String user;
 double balance;
 double save;
	String pwd;
	void setUser(String newUser) {
		user = newUser;
	}
	String getUser() {
		return user;
	}
	void setBalance(double newBalance){
		 balance=newBalance;
	}
	double getBalance(){
		return balance;
	}
	double save(double amount) {
		balance += amount;
		return amount;
		
	}
	double withdraw(double amount) {
		balance -= amount;
		return amount;
	}
	boolean with(double amount) {
		if (amount > balance) {
			System.out.println("����");
			return false;
		} else {
			balance = balance - amount;
			System.out.println("���=" + balance);
			return true;
		}
	}
	void setPwd(String newPwd) {
		pwd = newPwd;
	}
	String getPwd(){
		return pwd;
	}
	public static void main(String[] args){
		Alipay s=new Alipay();
		System.out.print("���Ϊ��");
		s.setBalance(100);
		System.out.println(s.getBalance());
		System.out.print("��Ǯ��");
		System.out.println(s.save(100));
		System.out.println("��Ǯ�����Ϊ��" + s.getBalance());
		System.out.print("���֣�");     		
		System.out.println(s.withdraw(150));
		System.out.println("���ֺ�����:"+s.getBalance());
		System.out.println("�ж����ֵĽ�������Ĵ�С        "+"���֣�"+s.withdraw(200));
		System.out.println(s.with(300));
	}
}
