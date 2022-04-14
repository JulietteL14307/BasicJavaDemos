package com.java.basics;

// Method overloading can be done by changing :

// The number of parameters in two methods

// The data types of the parameters of the methods

// The Order of the parameters of the methods

public class OverloadedMethodDemo {
	
	public OverloadedMethodDemo() {
		
		System.out.println("* Overloaded Method Demo *");
		
	}
	
	// Method Overloading by way of changing the number of parameters
	
	// Method 1 - adding two integer values
	
	public int add(int a, int b) {
		
		int sum = a + b;
		return sum;
		
	}
	
	// Method 2 - adding three integer values
	
	public int add(int a, int b, int c) {
		
		int sum = a + b + c;
		return sum;
		
	}

}

// Method overloading is an example of polymorphism.

// The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form. 


