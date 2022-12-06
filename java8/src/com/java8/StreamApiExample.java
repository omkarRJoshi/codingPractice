package com.java8;

import java.util.*;
import java.util.stream.Stream;

public class StreamApiExample {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,6,7,8,9);
		Stream<Integer> data = nums.stream();
		
		data.forEach(n -> System.out.println(n));
		
		data.forEach(n -> System.out.println(n));

	}

}
