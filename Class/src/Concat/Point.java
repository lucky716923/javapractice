package Concat;

public class Point {
//	创建一个Point类，有成员变量x，y，方法getX(),setX()，还有一个构造方
//
//	法初始化x和y。创建类主类A来测试它。
     private int x;
     private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
     public Point(int x,int y){
    	 this.x=x;
    	 this.y=y;
     }
     public void print(){
    	 System.out.println("x的值为："+x+"\n"+"y的值:"+y);
     }
     public Point(){}
}
