package Test0223;

public class Circle extends Point{
	public double radius;
	public void drawCircle(){
		System.out.println("����һ��Բ�ϵĵ�");
	}
	public Circle(){
	}
	public Circle(double x,double y,double radius){
		super(x,y);
		this.radius=radius;
		System.out.println("�����꣺"+x+"\t"+"�����꣺\t"+y+"\t"+"Բ�İ뾶��"+radius);
	}
}
