package com.team1.practice.one;

public class noteBook  extends Stationery{
	public noteBook(String name, int price, boolean status) {
		super(name, price, status);
	}

	public void showInfo(){
		setName("��ѧ��");
		setPrice(1);
		System.out.println(getName()+"\t"+"�۸�"+getPrice()+"Ԫ\t"+"����ҵ�ıʼǱ�");
	}

}
