package com.java.basics;

// Getter and Setter are methods used to protect your data and secure your code. In both, the first letter of the variable should be capitalized.

// Getter returns the value.

// Setter sets or updates the value.

public class GetterSetterDemo {
	
	public GetterSetterDemo() {
		
		System.out.println("* Getter & Setter Demo *");
		
	}
		
// Member variable of this class
		
		private String name;
		
// Method 1 - Getter
		
		public String getName() { return name; }
		
// Method 2 - Setter
		
		public void setName(String N) {
			
// "this" keyword refers to current instance
			
		this.name = N;				
		
	}
	
}
