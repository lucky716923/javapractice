package Test0223;
//1.现有交通工具体系，总类为交通工具，交通工具分为汽车，船只，飞机，而汽车又分为轿车和公交车，
//每个类中都有show方法，说明自己是什么交通工具，请写出这些类，并使用测试类测试
public class SteamShip extends Vehicle{
	private int waterLine ;//水平线
	
	public int getWaterLine() {
		return waterLine;
	}

	public void setWaterLine(int waterLine) {
		this.waterLine = waterLine;
	}

	public void showSteamShipInfo(){
		setName("船");
		showInfo();
//		System.out.println("轮船在水平线为"+this.waterLine+"的水面上");
		
	}

}
