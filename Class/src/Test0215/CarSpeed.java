package Test0215;

public class CarSpeed {
	public static void main(String[] args) {
		int carNum = 0;  // 过去的车辆计数器
		int speedingNum = 0; // 超速的车辆计数器
		while(carNum < 10){
			int x=(int)(Math.random()*200);  // 给一个车速
			if(x>120){
				System.out.println("您的车已超速:"+x);
				speedingNum++;  // 超速车辆+1
			}else{
				System.out.println("您的车在缓慢行驶");
			}
			
		carNum++;  // 过去的车辆+1
		}
		System.out.println("超速的车辆数："+speedingNum);
		System.out.println("过去的车辆数："+carNum);
		
		int i=1;
//		int a=i++;
		int b=++i;
//		System.out.println("a="+a+"i="+i);
		System.out.println("b="+b+"i="+i);
	}
}
