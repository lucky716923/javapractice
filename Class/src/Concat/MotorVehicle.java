package Concat;
//����һ���������������ࣺ
//���ԣ����ƺ�(String)������(int)��������(double)
//���ܣ�����(��������)������(�����Լ�)���޸ĳ��ƺţ���ѯ������������
//��д�������췽����һ��û���βΣ��ڷ����н����ƺ����á�XX1234������
//������Ϊ100������������Ϊ100����һ����Ϊ������������Ը�ֵ��
//��2���������ࣺ
//�������д�����������������
//������һ��ʱ�����޲����Ĺ��췽�������ó�Ա����ʹ�䳵��Ϊ����
//A9752������������١�
//�����ڶ���ʱ�����в����Ĺ��췽����ʹ�䳵��Ϊ����B5086��,����Ϊ150,
//����Ϊ200����������١�
//�����������������Ϣ
public class MotorVehicle {
	private String carNumber;
	private int speed;
	private double loadCapacity;
	public void accelarate(){
		speed+=20;
	}
	public void decelarate(){
		speed-=30;
	}
    public void setCarNumber(String carNumber){
    	this.carNumber=carNumber;
    }
    public String getCarnumber(){
    	return carNumber;
    }
    public double getLoadCapacity(){
    	return loadCapacity;
    }
    public  MotorVehicle(){
    	carNumber="xx1234";
        speed=100;
    	loadCapacity=100;
    }
    public  MotorVehicle(String carNumber,int speed,double loadCapacity){
    	this.carNumber=carNumber;
    	this.speed=speed;
    	this.loadCapacity=loadCapacity;
    }
    public String toString(){
    	return "carNumber="+carNumber+"   speed="+speed+"   loadCapacity="+loadCapacity;
    }
}
