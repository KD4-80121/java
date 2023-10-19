package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		
	
	Set<Book2> set = new LinkedHashSet<>();
	
	set.add(new Book2("A12",100,"Deval",1));
	set.add(new Book2("A13",200,"Abhishek",2));
	set.add(new Book2("A14",300,"Akash",3));
	set.add(new Book2("A15",400,"Abhijet",4));
	set.add(new Book2("A16",500,"soham",5));
	set.add(new Book2("A16",500,"soham",5));
	set.add(new Book2("A17",500,"Abhishek",6));

	Iterator<Book2> itr1 = set.iterator();
	
	while(itr1.hasNext()) {
		Book2 b1 = itr1.next();
		System.out.println(b1);

	
	}

}
}
