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
		System.out.println("��ѡ��,�����Ӧ�Ĳ���ż��ɡ���0��ʾ��β��");
		List<Foodd> list=new ArrayList<Foodd>();
		while(true){
			chooseid=sc.nextInt();
			if(chooseid==0){
				break;
			}
			list.add(fl[chooseid-1]);
		}
		System.out.println("��ѡ��������²�Ʒ");
		for(Foodd foodlist:list){
			System.out.println(foodlist.getFlid()+"\t"+foodlist.getFlname()+"\t"
					+foodlist.getFlprice()+"\t"+((foodlist.getFlsize()>1)?"���":(foodlist.getFlsize()<1)?"û�д�С������":"С��"));
		}
		double paymon=pay(list);
		System.out.println("��л   "+name+"  �ڱ������òͣ���һ������"+paymon+"Ԫ(RMB)������֧��");
		String word=leaveword();
		Order order=new Order();
		order.additem(name,list,paymon,word);
	}
	
	public String leaveword(){
		System.out.println("���Ƿ���Ҫ���ԣ���ѡ���Ӧ���\n1.����\n2.����Ҫ����");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		if(opt==2)
			return "";
		System.out.println("��������");
		String word=sc.next();
		System.out.println("���Գɹ�");
		return word;
	}
}
