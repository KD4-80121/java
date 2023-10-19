package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		class Book4PriDescCpomparator implements Comparator<Book4>
		{
			@Override
			public int compare(Book4 b1,Book4 b2) {
				int diff=-Double.compare(b1.getPrice(),b2.getPrice());
				return diff;
			
		}
	}
		
	
	
		TreeSet<Book4> set = new TreeSet<>(new Book4PriDescCpomparator());
		
		set.add(new Book4("A12",100,"Deval",1));
		set.add(new Book4("A13",200,"Abhishek",2));
		set.add(new Book4("A14",300,"Akash",3));
		set.add(new Book4("A15",400,"Abhijet",4));
		set.add(new Book4("A16",500,"soham",5));
		set.add(new Book4("A16",500,"soham",5));
		set.add(new Book4("A17",500,"Abhishek",6));
	
	
		Iterator<Book4> itr3 = set.iterator();
		while(itr3.hasNext()){
			
			Book4 b4=  itr3.next();
			System.out.println(b4);
	
	
	}
		
		
		
		
}	
		
		
		
		
		
}
