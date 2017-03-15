package Test0301;

public class ExceptionPractice {
	public static void main(String[] args) {
		int[] i=new int[]{1,2};
		try{
			for (int j = 0; j < 3; j++) {
				System.out.println(i[j]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界"+e);
			
		}finally{
			System.out.println("main方法结束");
		}
	}

}
