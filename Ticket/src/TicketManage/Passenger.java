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
		System.out.println("�˿�" + name +"������Ʊ����ϢΪ��" +ticket);
		Thread t = new Thread(new BuyTicketThread(this, ticket));
		t.start();
	}
	
	public void returnTicket(TrainTicket ticket) {
		System.out.println("�˿�" + name +"������Ʊ����ϢΪ��" +ticket);
		Thread t = new Thread(new ReturnTicketThread(this, ticket));
		t.start();
	}
	
	public String toString() {
		return "�˿�[����=" +  name + "]";
	}
	
}
