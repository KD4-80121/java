package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {
	
	
	public static void main(String[] args) {
		
	
	Set<Book3> set = new TreeSet<>();
	
	
	set.add(new Book3("A12",100,"Deval",1));
	set.add(new Book3("A13",200,"Abhishek",2));
	set.add(new Book3("A14",300,"Akash",3));
	set.add(new Book3("A15",400,"Abhijet",4));
	set.add(new Book3("A16",500,"soham",5));
	set.add(new Book3("A16",500,"soham",5));
	set.add(new Book3("A17",500,"Abhishek",6));
	set.add(new Book3("A17",500,"Abhishek",6));


	
	Iterator<Book3> itr3 = set.iterator();
	while(itr3.hasNext()){
		
		Book3 b3=  itr3.next();
		System.out.println(b3);
		
	}
	
	

}
}

