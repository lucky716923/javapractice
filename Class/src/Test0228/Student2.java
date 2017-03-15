package Test0228;
//4.定义一个学生类实现上述人接口。
public class Student2 implements Biology,Animal,People{

	@Override
	public void think() {
		System.out.println("我是思维方法");
		
	}

	@Override
	public void study() {
		System.out.println("我是学习方法");
		
	}

	@Override
	public void eat() {
		System.out.println("我是吃的方法");
		
	}

	@Override
	public void sleep() {
		System.out.println("我是睡觉方法");
		
	}

	@Override
	public void breath() {
		System.out.println("我是呼吸方法");
		
	}
	

}
