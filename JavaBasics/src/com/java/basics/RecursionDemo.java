package com.java.basics;

// Recursion is the act of making a method call itself.

// It is important to be careful when using recursion because it can be easy to create an infinite loop.

public class RecursionDemo {
	
	public RecursionDemo() {
		
	}
	
	public void recursion() {
						
		System.out.println("* Recursion Demo *");
		
		int result = sum(5);
		
		System.out.println(result);
		
		System.out.println();
		
	}
	
	public static int sum(int a) {
		
		if (a > 0) {
			
// add parameter "a" to the sum of all numbers less than "a" and return the result 
			
			return a + sum(a - 1);
			
		} else {
			
			return 0;
			
		}
		
	}

}
