package Test0215;

public class Food {
	 private  double a=2.48752567f;
	 private  double b=0.2;
	 public void print() {
		System.out.println("浪费粮食为：" + a + "亿吨" + "\n每个人吃的粮食为：" + b + "吨"
				+ "\n浪费粮食可养活人数估计为：" + (int)(a / b) + "人");
	}
	 public static void main(String[] args) {
		Food sc=new Food();
		sc.print();
	}
}
  