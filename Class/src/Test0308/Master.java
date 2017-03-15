package Test0308;

public class Master implements Runnable{
	private TicketShop tick=null;
	
	public Master(TicketShop tick) {
		this.tick=tick;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.tick.buy();
		}
	}
	

}
