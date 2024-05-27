package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplicationwithNextNumber {

	public static void main(String[] args) {
		List<Integer> listedNumbers = Arrays.asList(11,2,3,4,5,6,7,8,9);
		List<Integer> result=listedNumbers.stream().map(x->{
			int index = listedNumbers.indexOf(x);
			int nextIndex=(index +1)% listedNumbers.size();
			return x*listedNumbers.get(nextIndex);
		}).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
