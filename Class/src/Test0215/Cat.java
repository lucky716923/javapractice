package Test0215;
public class Cat {
	private String type;
	private String color;
	private int age;
	private double weight;

	public Cat(String type, String color, int age, double weight) {
		this.type = type;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

	public void print() {
		System.out.println("猫的种类：" + type + "\n猫的颜色：" + color + "\n猫的年龄：" + age
				+ "\n猫的体重：" + weight);
	}

	public void catSpeak() {
		System.out.println("猫的叫声：喵喵");
	}

	public void catPlay() {
		System.out.println("猫在洗脸");
	}

	public static void main(String[] args) {
		Cat sc = new Cat("花猫", "黄色", 2, 5);
		sc.print();
		sc.catPlay();
		sc.catSpeak();
	}
}
