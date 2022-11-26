package com.java8;

//functional interface can have exactly one single abstract method
//it can have multiple static and default method

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void singleAbsMethod(int a);
//	void secondAbsMethod();
	default void welcome() {
		System.out.println("welcome....");
	}
}
