package Test0223;

public class Circle extends Point{
	public double radius;
	public void drawCircle(){
		System.out.println("这是一个圆上的点");
	}
	public Circle(){
	}
	public Circle(double x,double y,double radius){
		super(x,y);
		this.radius=radius;
		System.out.println("横坐标："+x+"\t"+"纵坐标：\t"+y+"\t"+"圆的半径："+radius);
	}
}
