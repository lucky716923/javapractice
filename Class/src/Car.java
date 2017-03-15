
public class Car {
	String Color;
	double price;
	double balance;
	String pwd;
	
	void buy(double price){
		this.price = price;
	}
	
	void buy(String name,double price){
		System.out.println("购买的车："+name+"价格"+price);
	}
	
    void carType(){
        String[] sa = new String[3];
        String[] name = {"奥迪","大众","奔驰"};
       
        for(int i=0;i<3;i++){
            if(i<3){
                System.out.println(name[i]);
            }
        }
    }
        
        
    
	public static void main(String[] args){
		System.out.println("请选择你要购买的车");
		Car sc=new Car();
		sc.carType();
		int a=0;
		for(int i=1;i<101;i++){
			a+=i;
		}
		System.out.println(a);
	}
}
	

