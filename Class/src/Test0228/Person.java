package Test0228;
//1.请声明一个person接口，指明鼻子，眼睛，嘴巴的数量，并声明走路，吃饭，睡觉的方法
public interface Person {
	public static final int eyesNum=2;
	public static final int noseNum=1;
	public static final int mouthNum=1;
	public abstract void walk();
	public abstract void eat();
	public abstract void sleep();

}
