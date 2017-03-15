package TicketManage;

public class Passenger {
	private String name;

	public Passenger(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void buyTicket(TrainTicket ticket) {
		System.out.println("乘客" + name +"打算买票，信息为：" +ticket);
		Thread t = new Thread(new BuyTicketThread(this, ticket));
		t.start();
	}
	
	public void returnTicket(TrainTicket ticket) {
		System.out.println("乘客" + name +"打算退票，信息为：" +ticket);
		Thread t = new Thread(new ReturnTicketThread(this, ticket));
		t.start();
	}
	
	public String toString() {
		return "乘客[姓名=" +  name + "]";
	}
	
}
