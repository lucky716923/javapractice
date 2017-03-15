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
			System.out.println("乘客" + passenger.getName() + "正在退票。。。。。。");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			调用同步加锁对象的notifyAll方法，通知所有等待这张票的线程
			ticket.notifyAll();
			System.out.println("乘客" + passenger.getName() + "退票成功，信息为：" + ticket);
			
		}
	}
	
}
