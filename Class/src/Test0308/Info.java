package Test0308;

public class Info {
	private String name;
	private String content;
	private boolean flag=true;//û�в�Ʒ��
	
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
//������������Ʒ
	public synchronized void set(String name,String content){
		System.out.print("��ʼ������Ʒ��");
		if(!flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//�ȴ�������ȡ�߲�Ʒ
		}
		this.setName(name);//���ù�˾���֣�
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
//	�����߻�ȡ��Ʒ
	public synchronized void get(){
		System.out.print("��ʼ���ѣ���");
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
		System.out.println("��˾���ƣ�"+this.getName()+"\t��Ʒ���ƣ�"+this.getContent());
		flag=true;
		super.notify();
	}

}