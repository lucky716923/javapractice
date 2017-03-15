package Concat;

import Test0215.Detail;

public class BookConcat {
	public static void main(String[] args) {
		Book sc = new Book("西游记", "中国人民出版社", 34.5, 12435);
		Detail sa = new Detail("小明", "13544565798", "354989406");
		System.out.println(sc);
		System.out.println(sa);
	}
}