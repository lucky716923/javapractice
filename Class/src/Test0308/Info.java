package Test0308;

public class Info {
	private String name;
	private String content;
	private boolean flag=true;//没有产品了
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
//生产者生产产品
	public synchronized void set(String name,String content){
		System.out.print("开始生产产品！");
		if(!flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//等待消费者取走产品
		}
		this.setName(name);//设置公司名字？
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setContent(content);
		flag=false;
		System.out.println(name+","+content);
		super.notify();
	}
//	消费者获取产品
	public synchronized void get(){
		System.out.print("开始消费！！");
		if(flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("公司名称："+this.getName()+"\t产品名称："+this.getContent());
		flag=true;
		super.notify();
	}

}
