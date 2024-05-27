package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class GettingMaxValue {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,23,46,44,56,74);
		
	OptionalInt max =list.stream().mapToInt(Integer::intValue).max();
		
		if(max.isPresent()) {
			System.out.println("Max is:" + max.getAsInt());
		}else {
			System.out.println("No max is there");
		}
		

	}

}
