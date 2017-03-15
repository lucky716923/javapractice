package Test0223;
//1.现有交通工具体系，总类为交通工具，交通工具分为汽车，船只，飞机，而汽车又分为轿车和公交车，
//每个类中都有show方法，说明自己是什么交通工具，请写出这些类，并使用测试类测试
public class Plan extends Vehicle {
	public void showPlanInfo(){
		setName("飞机");
		showInfo();
	}

}
