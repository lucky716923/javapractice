package Test0223;
//1.���н�ͨ������ϵ������Ϊ��ͨ���ߣ���ͨ���߷�Ϊ��������ֻ���ɻ����������ַ�Ϊ�γ��͹�������
//ÿ�����ж���show������˵���Լ���ʲô��ͨ���ߣ���д����Щ�࣬��ʹ�ò��������
public class Car extends Vehicle{
	private int gears;//��λ
	private int wheelbase;//���
	
	
	public int getGears() {
		return gears;
	}


	public void setGears(int gears) {
		this.gears = gears;
	}


	public int getWheelbase() {
		return wheelbase;
	}


	public void setWheelbase(int wheelbase) {
		this.wheelbase = wheelbase;
	}


	public void showCarInfo(){
		setName("����");
		showInfo();
//		System.out.println("�����ĵ�λ"+this.gears+"\n"+"���������Ϊ"+this.wheelbase+"����");
		
	}
	public void showInfo(){
		System.out.println(getName()+"��С�Ľ�ͨ����");
	}

}
