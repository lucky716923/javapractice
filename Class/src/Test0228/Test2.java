package Test0228;
//3������һ�������࣬���Էɻ����񡣲������ж���һ��makeFly()�������û�ɵ��������������
//4��Ȼ����main�����д����ɻ����������󣬲���main�����е���makeFly()�������÷ɻ�������ɡ�
public class Test2 {
//	��̬
	public void makeFly(CanFly  Canfly){
	      Canfly.fly();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	}
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		Plane p=new Plane();
		t.makeFly(p);
		Bird b=new Bird();
		t.makeFly(b);
	}
}
                                        