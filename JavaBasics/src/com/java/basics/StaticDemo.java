package com.java.basics;

// Static methods are methods in Java that can be called without creating an instance of the class. They can be referenced by the class name itself or to the object of the class.

// They are designed to be shared among all objects created in the same class.

// Static methods CANNOT be overridden because they are resolved using static binding by the compiler at compile time. 

public class StaticDemo {
	
	public static String demoName = "";
	
	public static void demo(String name) {
		
		demoName = name;
		
	}

}