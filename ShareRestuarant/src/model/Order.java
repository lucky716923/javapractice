package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String cname; //caiming
	private double paymon;
	private String word;//shuxiang
	private List<Foodd> list;
	static List<Order> listsum=new ArrayList<Order>();
	
	public Order(){}
	
	public void additem(String cname,List<Foodd> list,double paymon,String word){
		this.cname=cname;
		this.paymon=paymon;
		this.list=list;
		this.word=word;
		listsum.add((Order)this);
		System.out.println("ok");
	}
	public void queryall(){
		System.out.println(listsum.size());
		if(listsum.size()==0)
		return ;
		for(int i=0;i<listsum.size();i++){
			System.out.println("##############################################");
			System.out.println("姓名："+listsum.get(i).cname+"\n消费金额："+
							   listsum.get(i).paymon+"元(RMB) \n备注："+
							   listsum.get(i).word);
			System.out.println("所选菜品如下：");
			for (int j = 0; j < listsum.get(i).list.size(); j++) {
				
				System.out.println(listsum.get(i).list.get(j).getFlname()+"  "+
							   	   listsum.get(i).list.get(j).getFlprice()+"  "+
							       ((listsum.get(i).list.get(j).getFlsize()>1)?"大份":(listsum.get(i).list.get(j).getFlsize()<1)?"没有大小份区别":"小份"));
			}
		}
	}
	
	public void backlist(String name){
		for (int i=0;i<listsum.size(); i++) {
			if(listsum.get(i).cname.equals(name))
				listsum.remove(i);
		}
	}
	
}
