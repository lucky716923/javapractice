package Test0217;

public class ManyArray {
	public static void main(String[] args) {
		int [][] a=new int[5][];
		a[0]=new int[]{23,45,56,23,24};
		a[1]=new int[]{4,45,34,22,323};
		a[2]=new int[]{23,45,56,23,24};
		a[3]=new int[]{4,45,34,22,323};
		a[4]=new int[]{23,45,56,23,24};
	for (int i = 0; i < a.length; i++) {
			for (int j=0; j < a[i].length; j++) {
			System.out.print(a[i][j]+"\t");
			}
			System.out.println();	
			}	
	System.out.println("******************************************");
	for (int i = 0; i < a.length; i++) {
		for (int x = i; x <a.length; x++) {
			System.out.print(a[i][x]+"\t");
		}
		System.out.println();	
		}	
	System.out.println("******************************************");
	for (int i = 0; i < a.length; i++) {
		for (int j=0; j < a .length; j++){
			if(j<i){
				System.out.print("\t");
			}else{
			System.out.print(a[i][j]+"\t");
			}
		}	
		System.out.println();
	}
			System.out.println("******************************************");
	
			int [][] b=new int[5][];
			b[0]=new int[]{2,4,6,3,24};
			b[1]=new int[]{4,45,34,22,323};
			b[2]=new int[]{2,4,6,3,24};
			b[3]=new int[]{4,45,34,22,323};
			b[4]=new int[]{22,4,6,3,24};
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("**************************************************");
			 System.arraycopy(a, 3, b, 2, 2);
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b.length; j++) {
					System.out.print(b[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("**************************************************");
			
			for (int i = 0; i < a.length; i++) {
				for (int j=0; j < a .length; j++){
					if(i!=j){
						System.out.print("\t");
					}else{
					System.out.print(a[i][i]+"\t");
					}
				}	
				System.out.println();
			}
					System.out.println("******************************************");
			
	}
}


