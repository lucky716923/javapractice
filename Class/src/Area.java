
public class Area {
	
    void addArea(double width,double height){
	System.out.println("���ε������"+width*height);
    }
    
    void addArea(double radius){
    	System.out.println("Բ�������"+Math.PI*radius*radius);
    }
    
    void addArea(int top,int bottom,int height){
    	System.out.println("���ε������"+(top+bottom)*height/2);
    }
    public static void main(String[] args) {
		Area sc=new Area();
		sc.addArea(4.5);
		sc.addArea(3.4, 5.6);
		sc.addArea(3, 4, 2);
	}
}
