package TicketManage;

import java.util.ArrayList;

public class TicketSeller {
	private static ArrayList<TrainTicket> pool = new ArrayList<TrainTicket>();
	 
	static{
		pool.add(new TrainTicket("T157", "0204", "20150312"));
		pool.add(new TrainTicket("T157", "0205", "20150312"));
		pool.add(new TrainTicket("T157", "0206", "20150312"));
		pool.add(new TrainTicket("T157", "0207", "20150312"));
		pool.add(new TrainTicket("T157", "0208", "20150312"));
		pool.add(new TrainTicket("T157", "0209", "20150312"));
		pool.add(new TrainTicket("T157", "0210", "20150312"));
	}
	
	
	public static TrainTicket sellTicket(TrainTicket ticket) {
		TrainTicket t = null;
		for (TrainTicket t1:pool) {
			if(t1.equals(ticket)){
				t = t1;
				System.out.println("正在出票" + t1 + "请耐心等待。。。。");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pool.remove(t1);
				break;
			}
			
		}
		return t;
	}
	public static void returnTicket(TrainTicket ticket){
		synchronized (ticket) {
			pool.add(ticket);
		}
	}
}


