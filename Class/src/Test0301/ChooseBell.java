package Test0301;

public class ChooseBell {
	public static  void chooseBell(){
		int[] b=new int[6];
		for (int i = 0; i < b.length; i++) {
			b[i]=(int)(Math.random()*33+1);
			System.out.print(b[i]+"\t");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("选出的红色球为：");
		chooseBell();
		System.out.println();
		System.out.println("选出的蓝色球为：");
		int b=(int)(Math.random()*33+1);
		System.out.print(b);
	}
	

}
