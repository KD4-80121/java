package com.sunbeam;

import java.util.stream.IntStream;

public class Sum {
	public static void main(String[] args) {

		IntStream str1=IntStream.range(1, 10);
		int sum=str1.sum();

		System.out.println("Sum="+sum);
		IntStream str2=IntStream.range(1, 10);
		System.out.println(str2.summaryStatistics());


	}



}
