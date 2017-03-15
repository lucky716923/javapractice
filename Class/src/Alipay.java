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
			System.out.println("余额不足");
			return false;
		} else {
			balance = balance - amount;
			System.out.println("余额=" + balance);
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
		System.out.print("余额为：");
		s.setBalance(100);
		System.out.println(s.getBalance());
		System.out.print("存钱：");
		System.out.println(s.save(100));
		System.out.println("存钱后余额为：" + s.getBalance());
		System.out.print("提现：");     		
		System.out.println(s.withdraw(150));
		System.out.println("提现后的余额:"+s.getBalance());
		System.out.println("判断提现的金额与余额的大小        "+"提现："+s.withdraw(200));
		System.out.println(s.with(300));
	}
}
