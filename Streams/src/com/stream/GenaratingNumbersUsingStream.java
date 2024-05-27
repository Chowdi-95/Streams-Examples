package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class GenaratingNumbersUsingStream {

	public static void main(String[] args) {
		 List<Integer> al= Arrays.asList(1,2,3,4,5,6,7,8,9);
		// printing numbers using stream
		IntStream.range(0, al.size()).filter(x-> al.get(x)>0).forEach((index)->{
			Integer num= al.get(index);
			System.out.println(num);
		});

	}

}
