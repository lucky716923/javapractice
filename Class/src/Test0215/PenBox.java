package Test0215;

public class PenBox {
	private String name;
	private String color;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PenBox(){}
	public static void main(String[] args) {
		PenBox sc=new PenBox();
//		sc.setName("±ÊÍ²");
//		System.out.println(sc.getName());
//		sc.setColor("ºìÉ«");
//		System.out.println(sc.getColor());
//		sc.setColor("×ØÉ«");
//		System.out.println(sc.getColor());
//		sc.setType("circle");
//		System.out.println(sc.getType());
//     	sc.setType("circle");
//		System.out.println(sc.getType());
		System.out.println(sc.equals("dfl"));
	}

}
