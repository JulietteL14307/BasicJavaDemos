package com.java.basics;

// The do while loop is similar to the while loop with only difference that it checks for condition after executing the statements, and therefore is an example of Exit Control Loop.

public class DoWhileLoopDemo {
	
	public DoWhileLoopDemo() {
		
	}
	
	public void doWhileLoop() {
		
		System.out.println("* Do While Loop Demo *");
		
		int z = 1;
		
// The line will be printed even if the condition is false. 
		
		do {
			
			 System.out.println("Value of z: " + z);
			
// Incrementing the value of z for the next iteration
			
			z++;
			
		} 
		
// Exit loop after z >= 5
		
		while (z <= 5);
		
		System.out.println();
	}

}
