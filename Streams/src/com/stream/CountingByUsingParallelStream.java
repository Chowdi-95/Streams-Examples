package com.stream;

import java.util.Arrays;
import java.util.List;

public class CountingByUsingParallelStream {

	public static void main(String[] args) {
		List<String> listedIteams = Arrays.asList("apple","banana","guva","orange","apple","mango","apple");
		
		long count=listedIteams.parallelStream().filter(x->x.equals("apple")).count();
		System.out.println(count);

	}

}
