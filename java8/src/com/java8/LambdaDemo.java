package com.java8;

import java.util.function.BiConsumer;

// program to add two numbers
// Lambda expression is an anonymous function (without name, return type ans access modifier)

public class LambdaDemo {

	public static void main(String[] args) {
		LambdaDemo ld = new LambdaDemo();
		ld.addTwoNimbers(10, 5);
		
		BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
		
		biConsumer.accept(10, 5);
	}
	
	public void addTwoNimbers(int a, int b) {
		System.out.println(a + b);
	}

}
