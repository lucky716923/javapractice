public class Order {
public static void main(String[] args){
	int a=12,b=13,c=14,d=15,e=16,f=17,h;
	h=a;
	a=f;
	f=h;
	h=b;
	b=e;
	e=h;
	h=c;
	c=d;
	d=h;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
}
}
