package Test0301;

public class FinallyReturn {
	public static void main(String[] args) {
		try{
			String s=null;
			System.out.println(s.length());
			return;
		}catch(NullPointerException e){
			System.out.println("空指针异常"+e);
			
		}finally{
			System.out.println("main方法结束");
		}
	}

}
