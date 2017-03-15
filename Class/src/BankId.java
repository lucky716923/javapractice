import java.util.Scanner;


public class BankId {
    String id;
    double balance;
    
    double getBalance(){
    	return balance;
    }
    
    double  deposit(int amount){
    	balance+=amount;
    	return amount;
    }
    
    void  deposit(String id,int amount){
    	balance+=amount;
     	System.out.println("ø®∫≈£∫"+id+"¥Ê«Æ£∫"+amount);
    }
    
    int withDraw(int amount){
    	balance-=amount;
    	return amount;
    }
    
    void withDraw(int amount,String id){
    	balance-=amount;
    	System.out.println("ø®∫≈£∫"+id+"»°«Æ£∫"+amount);
    }
    
    BankId(){}
    
    BankId(String id){
    	this.id=id;
    }

	public static void main(String[] args) {
		BankId sc = new BankId();
		Scanner sa=new Scanner(System.in);
		System.out.println("¥Ê«Æ£∫" + sc.deposit(100));
		System.out.println("≤È—Ø”‡∂Ó£∫" + sc.getBalance());
		sc.deposit("123456", 124);
		System.out.println("≤È—Ø”‡∂Ó£∫" + sc.getBalance());
		System.out.println("Ã·œ÷£∫" + sc.withDraw(100));
		System.out.println("≤È—Ø”‡∂Ó£∫" + sc.getBalance());
		sc.withDraw(100, "123456");
		System.out.println("≤È—Ø”‡∂Ó£∫" + sc.getBalance());
	}
}
