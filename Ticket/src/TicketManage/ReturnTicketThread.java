package TicketManage;

public class ReturnTicketThread implements Runnable {
	private Passenger passenger;
	private TrainTicket ticket;
	
	public ReturnTicketThread(Passenger passenger, TrainTicket ticket) {
		super();
		this.passenger = passenger;
		this.ticket = ticket;
	}

	public void run(){
		synchronized(ticket){
			TicketSeller.returnTicket(ticket);
			System.out.println("�˿�" + passenger.getName() + "������Ʊ������������");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			����ͬ�����������notifyAll������֪ͨ���еȴ�����Ʊ���߳�
			ticket.notifyAll();
			System.out.println("�˿�" + passenger.getName() + "��Ʊ�ɹ�����ϢΪ��" + ticket);
			
		}
	}
	
}