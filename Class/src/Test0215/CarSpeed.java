package Test0215;

public class CarSpeed {
	public static void main(String[] args) {
		int carNum = 0;  // ��ȥ�ĳ���������
		int speedingNum = 0; // ���ٵĳ���������
		while(carNum < 10){
			int x=(int)(Math.random()*200);  // ��һ������
			if(x>120){
				System.out.println("���ĳ��ѳ���:"+x);
				speedingNum++;  // ���ٳ���+1
			}else{
				System.out.println("���ĳ��ڻ�����ʻ");
			}
			
		carNum++;  // ��ȥ�ĳ���+1
		}
		System.out.println("���ٵĳ�������"+speedingNum);
		System.out.println("��ȥ�ĳ�������"+carNum);
		
		int i=1;
//		int a=i++;
		int b=++i;
//		System.out.println("a="+a+"i="+i);
		System.out.println("b="+b+"i="+i);
	}
}
