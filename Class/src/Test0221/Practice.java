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
		System.out.println("����200�ų�Ʊ��ʣ��"+s.getTicketNumber()+"��");
		s.backTicketNumber(100);
		System.out.println("����100�ų�Ʊ��ʣ��"+s.getTicketNumber()+"��");
	}

}
