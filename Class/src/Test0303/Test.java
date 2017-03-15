package Test0303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Users u1=new Users(23);
		Users u2=new Users(14);
		Users u3=new Users(45);
		Users u4=new Users(23);
		List<Users> li=new ArrayList<Users>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		li.add(u4);
		for(Users s:li){
			System.out.println(s.getAge());
		}
		
		Iterator<Users> it=li.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getAge());
		}
		
		
		Collections.sort(li);
		for(Users u:li){
			System.out.println(u.getAge());
		}
	}

}
