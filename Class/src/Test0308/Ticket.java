package Test0308;

public class Ticket implements Runnable{
	private TicketShop tick=null;
	public Ticket(TicketShop tick) {
		this.tick=tick;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=false;
		for (int i = 1; i < 10; i++) {
			if(flag){
				this.tick.product("西安", "渭南"+i);
				flag=false;
			}
			else{
				this.tick.product("西安", "成都"+i);
				flag=true;
		    }
	  }
   }
}
