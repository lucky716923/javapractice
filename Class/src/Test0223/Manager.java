package Test0223;
//2.����Ա���࣬����������ַ�������������ԣ�������;�������������ԣ��������н�ͨ�����������������ܲ��ţ�
//�������ж�����ʾ�������Ϣ�ķ���show������ʵ�ַ�ʽ��ͬ����д�����๹�췽���������Ե�get��set������
//��Ҫ�õ�this��super�ؼ��֡�
public class Manager extends Employee{
	public Manager(){
		super("������","�Ϻ�",30);
	}
	public void showInfo(){	
		System.out.println(this.name+"��"+this.address+"�ϰ�"+"\t"+"нˮΪ��"
				+this.salary+"\t\t\t"+"�����ż�������");
	}

}
