import java.util.Scanner;
public class Rubbish {
	public static void main(String[] args) {
		Scanner output = new Scanner(System.in);
		System.out.println("请输入我国目前年产生的垃圾");
		String sc = output.next();
		System.out.println("请再输入:");
		String sa = output.next();
		System.out.print(sc+sa);
	}
}