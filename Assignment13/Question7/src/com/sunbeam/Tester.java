package com.sunbeam;

public class Tester {
	public static void main(String[] args) {
		Employee1[] arr =new Employee1[3];
		arr[0]=new Clerk(4000);
		arr[1]=new Manager(6000,5000);
		arr[2]=new Laber(400,100);
		
		double TotalIncome=Employee1.TotalIncome(arr);
		System.out.println(TotalIncome);
		
		
		
		
		
	}

}
