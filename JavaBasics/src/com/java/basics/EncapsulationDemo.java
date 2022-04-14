package com.java.basics;

// Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.

// The data in a class is hidden from other classes using the data hiding concept which is achieved by making the members or methods of a class private, and the class is exposed to the end-user or the world without providing any details behind implementation using the abstraction concept, so it is also known as a combination of data-hiding and abstraction.

public class EncapsulationDemo {
	
	public EncapsulationDemo() {
		
	}
	
	// private variables declared can only be accessed by public methods of this class
	
	private String yourName;
	private int yourAge;
	
	// get method for name to access private variable yourName
	
	public String getName() { return yourName; }
	
	// get method for age to access private variable yourAge
	
	public int getAge() { return yourAge; }
	
	// set method for name to access private variable yourName
	
	public void setName(String newName) {
		
		System.out.println();
		
		System.out.println("* Encapsulation Demo *");
		
		yourName = newName;
		
	}
	
	// set method for age to access private variable yourAge
	
	public void setAge(int newAge) {
		
		yourAge = newAge;
		
	}

}
