package Concat;

public class Point {
//	����һ��Point�࣬�г�Ա����x��y������getX(),setX()������һ�����췽
//
//	����ʼ��x��y������������A����������
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
    	 System.out.println("x��ֵΪ��"+x+"\n"+"y��ֵ:"+y);
     }
     public Point(){}
}
