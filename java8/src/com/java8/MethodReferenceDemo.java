package com.java8;

// method reference is a replacement of lambda expression.
// It is used to refer method of functional interface to an existing method. 
// Mainly it is used for code reusability.

public class MethodReferenceDemo {

	public static void main(String[] args) {
		FunctionalInterfaceDemo fDemo1 = (a) -> System.out.println(a);
		fDemo1.singleAbsMethod(10);
		
		FunctionalInterfaceDemo fDemo2 = Test :: testImplementation;
		fDemo2.singleAbsMethod(10);
	}

}

class Test{
	public static void testImplementation(int a) {
		System.out.println(a + " from test implementation");
	}
}
