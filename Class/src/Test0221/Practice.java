package Test0221;

import java.util.Date;

public class Practice {
	private String beginstation;
	private String endStation;
	private Date time;
	private static int ticketNumber;
	
	public void setTicketNumber(){
		 ticketNumber=500;
	}
	public int getTicketNumber(){
		return ticketNumber;
	}
	public void buyTicketNumber(int amount){
		ticketNumber-=amount;
	}
	public void backTicketNumber(int amount){
		ticketNumber+=amount;
	}
	public static void main(String[] args) {
		Practice s=new Practice();
		s.setTicketNumber();
		s.buyTicketNumber(200);
		System.out.println("卖了200张车票后，剩下"+s.getTicketNumber()+"张");
		s.backTicketNumber(100);
		System.out.println("退了100张车票后，剩下"+s.getTicketNumber()+"张");
	}

}
