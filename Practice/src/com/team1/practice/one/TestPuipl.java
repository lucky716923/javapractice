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
					System.out.println("�����Ѿ�����");
					return false;
				}
			}
			p[num]=pu;
			num++;
			}else{
				System.out.println("��������");
				return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		Puipl p1 = new Puipl("����", "Ů", 16);
		Puipl p2 = new Puipl("�ٺ�", "��", 17);
		Puipl p3 = new Puipl("����", "Ů", 16);
		Puipl p4 = new Puipl("�Ǻ�", "��", 23);
		Puipl p5 = new Puipl("�ε�", "Ů", 16);
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
