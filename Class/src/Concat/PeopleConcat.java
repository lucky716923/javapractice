package Concat;
//��2���������ࣺ
//����һ���������С����������Ա��С�������18�꣬���1.80��
//�øö�����ó�Ա������
//˵������ã���
//����23+45��ֵ
//�����ָ�Ϊ�����ġ�

public class PeopleConcat {
	public static void main(String[] args) {
		People sc=new People("����",18,"��",1.80);
		sc.printPeopleInfo();
		sc.speak();
		System.out.println(sc.add(23, 45));
		sc.setName("����");
		sc.printPeopleInfo();
	}
}
