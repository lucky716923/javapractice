package Test0228;
//4.����һ��ѧ����ʵ�������˽ӿڡ�
public class Student2 implements Biology,Animal,People{

	@Override
	public void think() {
		System.out.println("����˼ά����");
		
	}

	@Override
	public void study() {
		System.out.println("����ѧϰ����");
		
	}

	@Override
	public void eat() {
		System.out.println("���ǳԵķ���");
		
	}

	@Override
	public void sleep() {
		System.out.println("����˯������");
		
	}

	@Override
	public void breath() {
		System.out.println("���Ǻ�������");
		
	}
	

}
