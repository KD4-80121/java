package com.sunbeam;

import java.util.Scanner;

public class Person {

	private String name;
	
	public void acceptData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		this.name= sc.next();

		}
	
	public void displayData()
	{
		
		System.out.println("name="+name);
		
	}
	
}
