package Test0228;
//3、定义一个测试类，测试飞机和鸟。测试类中定义一个makeFly()方法，让会飞的事物飞起来。　
//4、然后在main方法中创建飞机对象和鸟对象，并在main方法中调用makeFly()方法，让飞机和鸟起飞。
public class Test2 {
//	多态
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
                                        