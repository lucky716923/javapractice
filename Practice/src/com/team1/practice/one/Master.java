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
		System.out.println(this.name+"\t"+"�Ա�"+this.sex+"\t"+this.age+"��");
	}
//	���
	public void buyPen(Pen p) throws PersonalException{
		if(p.isStatus()==true){
			this.pen=p;
//			throw new PersonalException("���Ѿ���ɹ���");
		}
//		else{
//			throw new PersonalException("����ı��Ѿ�������");
//		}

	}
//�����ʵ���Ϣ
	public String buyInfo(){
		if(pen!=null){
			return "������������"+this.name+"\t"+"���䣺"+this.age+
				"\t"+"�ʵ����ƣ�"+pen.getName()+"\t"+"�ʵļ۸�"+pen.getName()	;
		}else{
			return "������������"+this.name+"\t"+"���䣺"+this.age+
					"\t";
		}
		
	}
}
