package Test0308;

public class TicketShop {
	private String startName;//出发地
	private String stopName;//目的地
	private boolean flag=true;//没有票
	
	public String getStartName() {
		return startName;
	}

	public void setStartName(String startName) {
		this.startName = startName;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}


	public synchronized void product(String startName,String stopName) {
		if(!flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.setStartName(startName);
		this.setStopName(stopName);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("出发地："+startName+"\t"+"目的地："+stopName);
		flag=false;
		super.notify();
	}
	
	public synchronized void buy() {
		if(flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("已成功购买从"+startName+"到"+stopName+"的火车票");
		flag=true;
		super.notify();
	}

}
