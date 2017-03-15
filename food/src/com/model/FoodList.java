package com.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FoodList {
	//显示菜单
	public Food[] showFoodList(){
		Food[] fl={new Food(1,"砂锅米线           ", 9.5, 0 ),
				   new Food(2,"砂锅方便面       ", 10.0, 0 ),
				   new Food(3,"炒米饭               ", 9.5, 1 ),
				   new Food(4,"炒米饭               ", 11, 2 ),
				   new Food(5,"炒细面               ", 9.5, 1 ),
				   new Food(6,"炒细面               ", 11, 2 ),
				   new Food(7,"土豆丝炒肉盖饭", 12, 0 ),
				   new Food(8,"水饺                     ", 10, 1 ),
				   new Food(9,"水饺                     ", 15, 2 )};
		System.out.println("                                     菜单   ");
		for (int i = 0; i < fl.length; i++) {
			System.out.println(fl[i].getId()+"\t"+fl[i].getName()+
								"\t"+fl[i].getPrice()+"\t"+((fl[i]
								.getSize()>1)?"大份":((fl[i].getSize
								()<1)?"无大小区别":"小份")));
			
		}
		
		return fl;
	}
	//选菜
	public void choosefood(Food[] fl){
		List<Food> list=new ArrayList<Food>();
		System.out.println("选菜,请输入菜对应的序号[0表示结束]");
		Scanner sc=new Scanner(System.in);
		double sum=0;
		while(true){
			int chooseid=sc.nextInt();
			if(chooseid>fl.length || chooseid < 0){
				System.out.println("输入错误");
				continue;
			}
			if(chooseid==0)break;
			list.add(fl[chooseid-1]);
		}
		System.out.println("您所选的菜单如下： ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+
					"\t"+list.get(i).getPrice()+"\t"+
		((list.get(i).getSize()>1)?"大份":((list.get(i).getSize()<1)?"无大小区别":"小份")));
		}
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i).getPrice();
		}
		System.out.println("您本次消费金额为："+sum);
	}


}