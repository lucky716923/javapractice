package Test0223;
//2.����Ա���࣬����������ַ�������������ԣ�������;�������������ԣ��������н�ͨ�����������������ܲ��ţ�
//�������ж�����ʾ�������Ϣ�ķ���show������ʵ�ַ�ʽ��ͬ����д�����๹�췽���������Ե�get��set������
//��Ҫ�õ�this��super�ؼ��֡�
public class Director extends Employee{
	public Director(){
		super("��³�","����",50);
	}
	public void showInfo(){	
		System.out.println(this.name+"��"+this.address+"�ϰ�"+"\t"+"нˮΪ��"
				+ ""+this.salary+"\t\t\t"+"�н�ͨ����");
	}

}
