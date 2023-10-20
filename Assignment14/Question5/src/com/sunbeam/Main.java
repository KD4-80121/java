package com.sunbeam;

import java.util.Scanner;

@FunctionalInterface
interface Check<T> { // generic interface
	boolean compare(T x, T y);
}

public class Main {

	public static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T item : arr) {
			if (c.compare(item, key)) {
				count++;// This method should return count of elements in the array for which given
						// check is satisﬁed
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Integer[] arr = { 44, 77, 99, 22, 55, 66 };
		Integer key = 50;

		Double[] doubleArr = { 1.1, 1.2, 1.3, 1.2, 1.4, 1.5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any integerkey you want");
		Integer ikey = sc.nextInt();
		
		System.out.println("enter any doublekey you want");
		Double doublekey = sc.nextDouble();

		int icnt = countIf(arr, ikey, (x, y) -> x.equals(y));// if you want to write the programme we are write two keys
															// integer and double (call Integer Key)
		System.out.println("integer count" + icnt);
		int dcnt = countIf(doubleArr, doublekey, (x, y) -> x.equals(y)); //call double key (double
		System.out.println("Count = " + dcnt); // Output: Count = 4
		sc.close();

	}

}
