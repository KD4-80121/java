package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		//declare map: key=isbn, value=Book object
		Map<String,Book5> map = new HashMap<>();
		int choice;

		while((choice=menu())!=0)
		{

			Scanner sc=new Scanner(System.in);
			switch(choice)
			{
			case 1:
				Book5 b1 = new Book5();
				b1.accept();
				map.put(b1.getIsbn(), b1);
				break;

			case 2:
				System.out.println("Enter the key isbm ");
				String isbn = sc.next();
				Book5 f = map.get(isbn);
				System.out.println(f+",");
			}
		}

	}

	public static int menu()
	{
		int choice;
		System.out.println("1. Insert into map");
		System.out.println("2. Find in map");
		System.out.print("Enter your choice ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

}


