package Test0223;
//2.现有员工类，有姓名，地址，基本工资属性，董事类和经理类除以上属性，董事类有交通补助，经理类有所管部门，
//三个类中都有显示其基本信息的方法show，但其实现方式不同，请写出各类构造方法，及属性的get，set方法。
//并要用到this和super关键字。
public class Manager extends Employee{
	public Manager(){
		super("刘经理","上海",30);
	}
	public void showInfo(){	
		System.out.println(this.name+"在"+this.address+"上班"+"\t"+"薪水为："
				+this.salary+"\t\t\t"+"管理着技术部门");
	}

}
