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
		System.out.println("è�����ࣺ" + type + "\nè����ɫ��" + color + "\nè�����䣺" + age
				+ "\nè�����أ�" + weight);
	}

	public void catSpeak() {
		System.out.println("è�Ľ���������");
	}

	public void catPlay() {
		System.out.println("è��ϴ��");
	}

	public static void main(String[] args) {
		Cat sc = new Cat("��è", "��ɫ", 2, 5);
		sc.print();
		sc.catPlay();
		sc.catSpeak();
	}
}
