
public class Add {
    int a;
    int b;
    double c;
    double d;
    
   static  int  add(int a, int b){
    	return a+b;
    }
     
   static double muni(double c,double d){
    	return c+d;
    }
    
    public static void main(String[] args){
    	System.out.println(add(4,5));
    	System.out.println(muni(3.0,5.0));
    }
}
