package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FoodList {
	//��ʾ�˵�
	public Food[] showFoodList(){
		Food[] fl={new Food(1,"ɰ������           ", 9.5, 0 ),
				   new Food(2,"ɰ��������       ", 10.0, 0 ),
				   new Food(3,"���׷�               ", 9.5, 1 ),
				   new Food(4,"���׷�               ", 11, 2 ),
				   new Food(5,"��ϸ��               ", 9.5, 1 ),
				   new Food(6,"��ϸ��               ", 11, 2 ),
				   new Food(7,"����˿����Ƿ�", 12, 0 ),
				   new Food(8,"ˮ��                     ", 10, 1 ),
				   new Food(9,"ˮ��                     ", 15, 2 )};
		System.out.println("                                     �˵�   ");
		for (int i = 0; i < fl.length; i++) {
			System.out.println(fl[i].getId()+"\t"+fl[i].getName()+
								"\t"+fl[i].getPrice()+"\t"+((fl[i]
								.getSize()>1)?"���":((fl[i].getSize
								()<1)?"�޴�С����":"С��")));
			
		}
		
		return fl;
	}
	//ѡ��
	public void choosefood(Food[] fl){
		List<Food> list=new ArrayList<Food>();
		System.out.println("ѡ��,������˶�Ӧ�����[0��ʾ����]");
		Scanner sc=new Scanner(System.in);
		double sum=0;
		while(true){
			int chooseid=sc.nextInt();
			if(chooseid>fl.length || chooseid < 0){
				System.out.println("�������");
				continue;
			}
			if(chooseid==0)break;
			list.add(fl[chooseid-1]);
		}
		System.out.println("����ѡ�Ĳ˵����£� ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+
					"\t"+list.get(i).getPrice()+"\t"+
		((list.get(i).getSize()>1)?"���":((list.get(i).getSize()<1)?"�޴�С����":"С��")));
		}
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i).getPrice();
		}
		System.out.println("���������ѽ��Ϊ��"+sum);
	}


}