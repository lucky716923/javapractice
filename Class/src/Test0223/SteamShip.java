package Test0223;
//1.���н�ͨ������ϵ������Ϊ��ͨ���ߣ���ͨ���߷�Ϊ��������ֻ���ɻ����������ַ�Ϊ�γ��͹�������
//ÿ�����ж���show������˵���Լ���ʲô��ͨ���ߣ���д����Щ�࣬��ʹ�ò��������
public class SteamShip extends Vehicle{
	private int waterLine ;//ˮƽ��
	
	public int getWaterLine() {
		return waterLine;
	}

	public void setWaterLine(int waterLine) {
		this.waterLine = waterLine;
	}

	public void showSteamShipInfo(){
		setName("��");
		showInfo();
//		System.out.println("�ִ���ˮƽ��Ϊ"+this.waterLine+"��ˮ����");
		
	}

}
