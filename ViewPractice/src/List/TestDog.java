package List;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;


public class TestDog {
	public static void main(String[] args) {
		Person p1=new Person("����",21,15891161655l);
		Person p2=new Person("С��",34,15891161656l);
		Person p3=new Person("����",12,15891161657l);
		Person p4=new Person("С��",45,15891161658l);
		Dog d1=new Dog("����","��ɫ");
		Dog d2=new Dog("�ٺ�","��ɫ");
		Dog d3=new Dog("�Ǻ�","��ɫ");
		Dog d4=new Dog("����","��ɫ");
		HashMap<Person,Dog> hm=new HashMap<Person,Dog>();
		hm.put(p1, d1);
		hm.put(p2, d2);
		hm.put(p3, d3);
		hm.put(p4, d4);
		Set<Person> k=hm.keySet();
		for(Person p:k){
			System.out.println(p+":"+hm.get(p));
		}
		System.out.println("***************************************");
		TreeMap<Person,Dog> tm=new TreeMap<Person,Dog>();
		tm.put(p1, d1);
		tm.put(p2, d2);
		tm.put(p3, d3);
		tm.put(p4, d4);
		Set<Person> w=tm.keySet();
		for(Person p:w){
			System.out.println(p+":"+tm.get(p));
		}
	}
	
	

}
