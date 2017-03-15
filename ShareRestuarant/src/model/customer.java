package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class customer {
	
	public double pay(List<Foodd> list){
		double sum=0;
		for (int i = 0; i < list.size(); i++) {
			sum+=list.get(i).getFlprice();
		}
		return sum;
	}
	public void choosefood(String name,Foodd[] fl){
		Scanner sc=new Scanner(System.in);
		int chooseid=0;
		System.out.println("请选餐,输入对应的菜序号即可【以0表示结尾】");
		List<Foodd> list=new ArrayList<Foodd>();
		while(true){
			chooseid=sc.nextInt();
			if(chooseid==0){
				break;
			}
			list.add(fl[chooseid-1]);
		}
		System.out.println("您选择的是以下菜品");
		for(Foodd foodlist:list){
			System.out.println(foodlist.getFlid()+"\t"+foodlist.getFlname()+"\t"
					+foodlist.getFlprice()+"\t"+((foodlist.getFlsize()>1)?"大份":(foodlist.getFlsize()<1)?"没有大小份区别":"小份"));
		}
		double paymon=pay(list);
		System.out.println("感谢   "+name+"  在本餐厅用餐，您一共消费"+paymon+"元(RMB)，请您支付");
		String word=leaveword();
		Order order=new Order();
		order.additem(name,list,paymon,word);
	}
	
	public String leaveword(){
		System.out.println("您是否需要留言，请选择对应序号\n1.留言\n2.不需要留言");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		if(opt==2)
			return "";
		System.out.println("请您留言");
		String word=sc.next();
		System.out.println("留言成功");
		return word;
	}
}
