package model;

public class Foodd {
	private int flid;
	private String flname;//caiming
	private double flprice;//caijiage
	private int flsize;//daxiao   0��ʾ�޴�С�֣�1С��2���

	
	public int getFlid() {
		return flid;
	}
	public void setFlid(int flid) {
		this.flid = flid;
	}
	public String getFlname() {
		return flname;
	}
	public void setFlname(String flname) {
		this.flname = flname;
	}
	public double getFlprice() {
		return flprice;
	}
	public void setFlprice(double flprice) {
		this.flprice = flprice;
	}
	public int getFlsize() {
		return flsize;
	}
	public void setFlsize(int flsize) {
		this.flsize = flsize;
	}
	
	public Foodd(int flid,String flname, double flprice, int flsize) {
		this.flid=flid;
		this.flname = flname;
		this.flprice = flprice;
		this.flsize = flsize;
	}
	public Foodd(){
		
	}
	
	public Foodd[] getFoodList(){
		Foodd[] fl={new Foodd(1,"ɰ������           ", 9.5, 0 ),
					   new Foodd(2,"ɰ��������       ", 10.0, 0 ),
					   new Foodd(3,"���׷�               ", 9.5, 1 ),
					   new Foodd(4,"���׷�               ", 11, 2 ),
					   new Foodd(5,"��ϸ��               ", 9.5, 1 ),
					   new Foodd(6,"��ϸ��               ", 11, 2 ),
					   new Foodd(7,"����˿����Ƿ�", 12, 0 ),
					   new Foodd(8,"ˮ��                     ", 10, 1 ),
					   new Foodd(9,"ˮ��                     ", 15, 2 ),};
		return fl;
	}
	public void screenprint(Foodd[] fl){
		System.out.println("��� \t����"+"\t           "+"�۸�"+"\t ��С��");
		for (int i = 0; i < fl.length; i++) {
			System.out.println((i+1)+"       "+fl[i].flname +"        "+fl[i].flprice+"    "+((fl[i].flsize>1)?"���":(fl[i].flsize<1)?"û�д�С������":"С��"));
		}
	}
}
