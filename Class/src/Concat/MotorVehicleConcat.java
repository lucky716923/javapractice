package Concat;



//������һ��ʱ�����޲����Ĺ��췽�������ó�Ա����ʹ�䳵��Ϊ����
//A9752������������١�
//�����ڶ���ʱ�����в����Ĺ��췽����ʹ�䳵��Ϊ����B5086��,����Ϊ150,
//����Ϊ200����������١�
//�����������������Ϣ
public class MotorVehicleConcat {
	public static void main(String[] args) {
		MotorVehicle sc=new MotorVehicle();
		sc.setCarNumber("��A9752");
		sc.accelarate();
		MotorVehicle sa=new MotorVehicle("��B5086", 150, 200);
		sc.decelarate();
		System.out.println(sc);
		System.out.println(sa);
	}

}
