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
			System.out.println(Thread.currentThread().getName()+"������"+number--+"��Ʊ");
		}
	}
	public static void main(String[] args) {
		TicketManage tm=new TicketManage();
		Thread t1=new Thread(tm,"A����");
		Thread t2=new Thread(tm,"B����");
		t1.start();
		t2.start();
	}

}