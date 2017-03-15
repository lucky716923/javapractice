package com.team1.practice.one;

public class TestPuipl {
	Puipl[] p = new Puipl[5];
	int num = 0;
	public boolean add(Puipl pu) {
		if (num < p.length) {
			if (num == 0) {
				p[num] = pu;
				num++;
				return true;
			}
			for (int i = 0; i <=num; i++) {
				if (pu.equals(p[i])) {
					System.out.println("对象已经存在");
					return false;
				}
			}
			p[num]=pu;
			num++;
			}else{
				System.out.println("数组已满");
				return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		Puipl p1 = new Puipl("哈哈", "女", 16);
		Puipl p2 = new Puipl("嘿嘿", "男", 17);
		Puipl p3 = new Puipl("哈哈", "女", 16);
		Puipl p4 = new Puipl("呵呵", "男", 23);
		Puipl p5 = new Puipl("滴滴", "女", 16);
		TestPuipl ps=new TestPuipl();
		System.out.println(ps.add(p1));
		System.out.println(ps.add(p2));
		System.out.println(ps.add(p3));
		System.out.println(ps.add(p4));
		System.out.println(ps.add(p5));
	for (int i = 0; i <ps.p.length; i++) {
		System.out.println(ps.p[i]);
	}
	}
}
