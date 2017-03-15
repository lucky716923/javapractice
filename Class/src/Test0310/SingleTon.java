package Test0310;

public class SingleTon {
	//¶öººÊ½
//	private SingleTon(){}
//	
//	static SingleTon sing=new SingleTon();
//	
//	public static SingleTon getIstance(){
//		return sing;
//	}
	//ÀÁººÊ½
	private SingleTon(){}
	static SingleTon sing=null;
	public static SingleTon getInstance(){
		if(sing==null){
		sing=new SingleTon();
		}
		return sing;
	}
	
	public static void main(String[] args) {
//		new SingleTon();
		SingleTon	hu=SingleTon.getInstance();
	}

}
