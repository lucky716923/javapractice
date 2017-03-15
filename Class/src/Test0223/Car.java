package Test0223;
//1.现有交通工具体系，总类为交通工具，交通工具分为汽车，船只，飞机，而汽车又分为轿车和公交车，
//每个类中都有show方法，说明自己是什么交通工具，请写出这些类，并使用测试类测试
public class Car extends Vehicle{
	private int gears;//档位
	private int wheelbase;//轴距
	
	
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
		setName("汽车");
		showInfo();
//		System.out.println("汽车的档位"+this.gears+"\n"+"汽车的轴距为"+this.wheelbase+"厘米");
		
	}
	public void showInfo(){
		System.out.println(getName()+"是小的交通工具");
	}

}
