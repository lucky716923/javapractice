package Test0301;

public class FinallyReturn {
	public static void main(String[] args) {
		try{
			String s=null;
			System.out.println(s.length());
			return;
		}catch(NullPointerException e){
			System.out.println("��ָ���쳣"+e);
			
		}finally{
			System.out.println("main��������");
		}
	}

}
