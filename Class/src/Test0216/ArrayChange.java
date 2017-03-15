package Test0216;

public class ArrayChange {
	public static void main(String[] args) {
		int a[]={5,11,15,24,36,47,59,66};
		for(int i=0;i<a.length-4;i++){
		int	b=a.length-1;
		int c;
		c=a[i];
		a[i]=a[b-i];
		a[b-i]=c;
	}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

