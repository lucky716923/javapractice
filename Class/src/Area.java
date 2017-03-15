
public class Area {
	
    void addArea(double width,double height){
	System.out.println("矩形的面积："+width*height);
    }
    
    void addArea(double radius){
    	System.out.println("圆的面积："+Math.PI*radius*radius);
    }
    
    void addArea(int top,int bottom,int height){
    	System.out.println("梯形的面积："+(top+bottom)*height/2);
    }
    public static void main(String[] args) {
		Area sc=new Area();
		sc.addArea(4.5);
		sc.addArea(3.4, 5.6);
		sc.addArea(3, 4, 2);
	}
}
