package Test0308;

public class TestTicket {
	public static void main(String[] args) {
		
		TicketShop tt=new TicketShop();
		Ticket t=new Ticket(tt);
		Master m=new Master(tt);
		new Thread(t).start();
		new Thread(m).start();
	}
	
	 

}
