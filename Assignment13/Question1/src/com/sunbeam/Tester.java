package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Tester {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<>();
		
		set.add(new Book("A12",100,"Deval",1));
		set.add(new Book("A13",200,"Abhishek",2));
		set.add(new Book("A14",300,"Akash",1));
		set.add(new Book("A15",400,"Abhijet",1));
		set.add(new Book("null",500,"soham",1));
		set.add(new Book("null",500,"soham",1));
		Iterator<Book> itr1 = set.iterator();
		while(itr1.hasNext()) {
			Book b=itr1.next();
			System.out.println(b);
	
	
	}

}
}
