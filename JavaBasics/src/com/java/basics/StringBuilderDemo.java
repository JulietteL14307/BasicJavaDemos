package com.java.basics;

// The StringBuilder class is almost identical to the StringBuffer class, however the StringBuilder class differs on the base of synchronization. The StringBuffer class provides guarantee of synch. whereas the StringBuilder class does not.

// Instances of StringBuilder are safer for the use of single threads, and StringBuffer for the use of multiple threads.

public class StringBuilderDemo {
	
	public StringBuilderDemo() {
		
	}
	
	public void stringBuilder() {
		
		System.out.println("* StringBuilder Demo *");
		
// Creating a StringBuilder object using the StringBuilder() constructor
				
		StringBuilder str1 = new StringBuilder();
				
		str1.append("MySBuilder");
				
// Printing the string to the console
				
		System.out.println("StringBuilder String1 = " + str1.toString());
				
// Creating a StringBuilder object using StringBuilder(CharSequence) constructor
				
		StringBuilder str2 = new StringBuilder("AAABBBCCC");
				
// Printing the string
				
		System.out.println("StringBuilder String2 = " + str2.toString());
				
// Creating a StringBuilder object using StringBuilder(capacity) constructor
				
		StringBuilder str3 = new StringBuilder(10);
				
// Printing the string
				
		System.out.println("StringBuilder String3 capacity = " + str3.capacity());
				
// Creating a StringBuilder object using StringBuilder(String) constructor
				
		StringBuilder str4 = new StringBuilder(str1.toString());
				
// Printing the string
				
		System.out.println("StringBuilder String4 = " + str4.toString());
				
		System.out.println();
		
	}

}

// There are many other StringBuilder methods which can be explored here :

// https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
