package TicketManage;

public class BuyTicketThread implements Runnable {
	private Passenger passenger;
	private TrainTicket ticket;
	public BuyTicketThread(Passenger passenger, TrainTicket ticket) {
		super();
		this.passenger = passenger;
		this.ticket = ticket;
	}
	@Override
	public void run() {
		synchronized(ticket) {
			TrainTicket t = TicketSeller.sellTicket(ticket);
			while(t==null) {
				System.out.println(passenger.getName()+ "�ܱ�Ǹ��Ʊ�Ѿ��۳�����ȴ���Ʊ");
					try {
						ticket.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			if(t!=null){
				System.out.println(passenger.getName()+"��Ʊ�ɹ�����ϢΪ��" + ticket);
			}
		}
	}
	
}