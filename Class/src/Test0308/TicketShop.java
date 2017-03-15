package Test0308;

public class TicketShop {
	private String startName;//������
	private String stopName;//Ŀ�ĵ�
	private boolean flag=true;//û��Ʊ
	
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
		System.out.println("�����أ�"+startName+"\t"+"Ŀ�ĵأ�"+stopName);
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
		System.out.println("�ѳɹ������"+startName+"��"+stopName+"�Ļ�Ʊ");
		flag=true;
		super.notify();
	}

}