package Test0223;
//1.现有交通工具体系，总类为交通工具，交通工具分为汽车，船只，飞机，而汽车又分为轿车和公交车，
//每个类中都有show方法，说明自己是什么交通工具，请写出这些类，并使用测试类测试

public class Vehicle {
	private String engine; //发动机
	private String name;//名称
	private double tonnage;//吨位
	
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
		System.out.println("我是"+getName()+"交通工具");
	}

}
