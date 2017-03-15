package Test0308;

public class TicketManage  implements Runnable{
	private  int number=20;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"卖出第"+number--+"张票");
		}
	}
	public static void main(String[] args) {
		TicketManage tm=new TicketManage();
		Thread t1=new Thread(tm,"A窗口");
		Thread t2=new Thread(tm,"B窗口");
		t1.start();
		t2.start();
	}

}
