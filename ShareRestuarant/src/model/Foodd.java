package model;

public class Foodd {
	private int flid;
	private String flname;//caiming
	private double flprice;//caijiage
	private int flsize;//daxiao   0表示无大小分，1小份2大份

	
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
		Foodd[] fl={new Foodd(1,"砂锅米线           ", 9.5, 0 ),
					   new Foodd(2,"砂锅方便面       ", 10.0, 0 ),
					   new Foodd(3,"炒米饭               ", 9.5, 1 ),
					   new Foodd(4,"炒米饭               ", 11, 2 ),
					   new Foodd(5,"炒细面               ", 9.5, 1 ),
					   new Foodd(6,"炒细面               ", 11, 2 ),
					   new Foodd(7,"土豆丝炒肉盖饭", 12, 0 ),
					   new Foodd(8,"水饺                     ", 10, 1 ),
					   new Foodd(9,"水饺                     ", 15, 2 ),};
		return fl;
	}
	public void screenprint(Foodd[] fl){
		System.out.println("序号 \t菜名"+"\t           "+"价格"+"\t 大小份");
		for (int i = 0; i < fl.length; i++) {
			System.out.println((i+1)+"       "+fl[i].flname +"        "+fl[i].flprice+"    "+((fl[i].flsize>1)?"大份":(fl[i].flsize<1)?"没有大小份区别":"小份"));
		}
	}
}
