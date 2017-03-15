package Concat;
//（2）创建主类：
//创建一个对象：名叫“张三”，性别“男”，年龄18岁，身高1.80；
//让该对象调用成员方法：
//说出“你好！”
//计算23+45的值
//将名字改为“李四”

public class PeopleConcat {
	public static void main(String[] args) {
		People sc=new People("张三",18,"男",1.80);
		sc.printPeopleInfo();
		sc.speak();
		System.out.println(sc.add(23, 45));
		sc.setName("李四");
		sc.printPeopleInfo();
	}
}
