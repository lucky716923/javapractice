package TicketManage;

public class TestTicket {
	public static void main(String[] args) {
		Passenger p1 =new Passenger("����");
		TrainTicket ticket1 = new TrainTicket("T157", "0204", "20150312");
		Passenger p2 =new Passenger("����");
		TrainTicket ticket2 = new TrainTicket("T157", "0205", "20150312");
		Passenger p3 = new Passenger("����");
		Passenger p4 = new Passenger("����");
		Passenger p5 = new Passenger("����");
		
		p1.buyTicket(ticket1);
		p2.buyTicket(ticket2);
		p3.buyTicket(ticket1);
		p4.buyTicket(ticket1);
		p5.buyTicket(ticket2);
		
	}
}