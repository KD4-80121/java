package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Strings {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		
		list.add("Abhishek");
		list.add("Danav deval");
		list.add("Ashish");	
		list.add("Jagdish");
		list.add("Abhijet");
		list.add("Sarang");
		
		String ele = Collections.max(list);
	//String ele = Collections.min(list);
System.out.println("max ele="+ele); //Give a "sarang" because of ascii values
	
	
	
	
	
}
}
