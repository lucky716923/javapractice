package Test0308;

public class Customer implements Runnable{
	private Info info=null;

	public Customer(Info info) {
		this.info = info;
	}

	@Override
	public void run() {
		for (int i = 1; i < 21; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.info.get();
		}
		
	}
	

}
