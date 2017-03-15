package Concat;



//创建第一个时调用无参数的构造方法，调用成员方法使其车牌为“辽
//A9752”，并让其加速。
//创建第二个时调用有参数的构造方法，使其车牌为“辽B5086”,车速为150,
//载重为200，并让其减速。
//输出两辆车的所有信息
public class MotorVehicleConcat {
	public static void main(String[] args) {
		MotorVehicle sc=new MotorVehicle();
		sc.setCarNumber("辽A9752");
		sc.accelarate();
		MotorVehicle sa=new MotorVehicle("辽B5086", 150, 200);
		sc.decelarate();
		System.out.println(sc);
		System.out.println(sa);
	}

}
