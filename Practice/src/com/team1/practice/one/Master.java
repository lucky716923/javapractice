package com.team1.practice.one;

public  class Master {
	private String name;
	private int age;
	private String sex;
	private Pen pen;
	
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Master(String name, String sex, int age) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Master() {}
	
	public void showInfo(){
		System.out.println(this.name+"\t"+"性别："+this.sex+"\t"+this.age+"岁");
	}
//	买笔
	public void buyPen(Pen p) throws PersonalException{
		if(p.isStatus()==true){
			this.pen=p;
//			throw new PersonalException("您已经完成购买");
		}
//		else{
//			throw new PersonalException("您买的笔已经卖完了");
//		}

	}
//输出买笔的信息
	public String buyInfo(){
		if(pen!=null){
			return "购买者姓名："+this.name+"\t"+"年龄："+this.age+
				"\t"+"笔的名称："+pen.getName()+"\t"+"笔的价格"+pen.getName()	;
		}else{
			return "购买者姓名："+this.name+"\t"+"年龄："+this.age+
					"\t";
		}
		
	}
}
