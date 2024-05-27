package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingMostRepatedByUsingParallelStream {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple","guva","banana","apple","orange","guva","kiwi","apple");
		//store into a map collection
		Map<String,Long> groupedItems=items.parallelStream().collect(Collectors.groupingByConcurrent(item->item,Collectors.counting()));
		
		//find the most occurence element
		String mostrepatedItem = groupedItems.entrySet().parallelStream()
		.max(Map.Entry.comparingByValue())
		.map(Map.Entry::getKey).orElse("No items found");
		
		// print the value
		System.out.println("The most repated Item is :" + mostrepatedItem);

	}

}
