package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GettingSumOfAllUsingStream {

	public static void main(String[] args) {
		int[] numberList= {12,45,56,56,96,99,102,112};
		IntStream.of(numberList).forEach(System.out::println);
		System.out.println("------");
		
		IntStream.of(numberList).distinct().forEach(System.out::println);
		//System.out.println(sum);

	}

}
