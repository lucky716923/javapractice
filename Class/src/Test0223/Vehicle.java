package Test0223;
//1.���н�ͨ������ϵ������Ϊ��ͨ���ߣ���ͨ���߷�Ϊ��������ֻ���ɻ����������ַ�Ϊ�γ��͹�������
//ÿ�����ж���show������˵���Լ���ʲô��ͨ���ߣ���д����Щ�࣬��ʹ�ò��������

public class Vehicle {
	private String engine; //������
	private String name;//����
	private double tonnage;//��λ
	
	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public double getTonnage() {
		return tonnage;
	}


	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void showInfo(){
		System.out.println("����"+getName()+"��ͨ����");
	}

}
