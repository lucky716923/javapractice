
package Test0308;

public class ImplementTest implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("我是Runnable");
		}
	}
	
	public static void main(String[] args) {
		ImplementTest im = new ImplementTest();
		Thread t1 = new Thread(im);
		t1.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("我是main方法");
			if (i > 2) {
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
