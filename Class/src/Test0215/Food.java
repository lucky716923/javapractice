package Test0215;

public class Food {
	 private  double a=2.48752567f;
	 private  double b=0.2;
	 public void print() {
		System.out.println("�˷���ʳΪ��" + a + "�ڶ�" + "\nÿ���˳Ե���ʳΪ��" + b + "��"
				+ "\n�˷���ʳ��������������Ϊ��" + (int)(a / b) + "��");
	}
	 public static void main(String[] args) {
		Food sc=new Food();
		sc.print();
	}
}
  