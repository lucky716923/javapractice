package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book("java",34);
		Book b2=new Book("c",45);
		list.add(b1);
		list.add(b2);
		System.out.println("******************List1**********************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("******************List2**********************");
		for (Book b:list) {
			System.out.println(b);
		}
		System.out.println("*******************HashSet*********************");
	   HashSet<Book> head=new HashSet<Book>();
	   Book d1=new Book("µç·¹¹ø",55);
	   Book d2=new Book("¹ÒºÅ·Ñ",45);
	   Book b3=new Book("z",35);
	   Book b4=new Book("java",35);
	   head.add(d1);
	   head.add(d2);
	   head.add(b3);
	   head.add(b4);
	   for(Book s:head){
		   System.out.println(s);
	   }
	   System.out.println("*******************TreeSet*********************");
	   TreeSet<Book> tree=new TreeSet<Book>();
	   Book c1=new Book("java",45);
	   Book c2=new Book("c",35);
	   Book c3=new Book("java",45);
	   Book c4=new Book("c",46);
	   tree.add(c1);
	   tree.add(c2);
	   tree.add(c3);
	   tree.add(c4);
	   for(Book s:tree){
		   System.out.println(s);
	   }
       Iterator<Book> it = list.iterator();
       while (it.hasNext()) {
           System.out.println(it.next());
       }
	  
	}

}
