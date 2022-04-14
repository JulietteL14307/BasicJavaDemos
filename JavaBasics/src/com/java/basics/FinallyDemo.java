package com.java.basics;

// The finally block is used at the end of a try/catch block and always executes when the try block exits.

// Finally is good for exception handling and also avoiding cleanup code being accidentally bypassed by a "return", "continue", or "break".

// Putting cleanup code in a finally block is always a good practice to follow even when no exception is anticipated.

public class FinallyDemo {
	
	public FinallyDemo() {
		
	}
	
	public void finallyDemo() {
		
		System.out.println("* Finally Demo *");
		
		try {
			
			int[] myNumbers = {4, 5, 6};
			System.out.println(myNumbers[10]);
			
		} catch (Exception e) {
			
			System.out.println("Something went wrong.");
			
		} finally {
			
			System.out.println("Finally to the finale!");
			
		}
		
		System.out.println();
		
	}

}

// Finally block will always be executed no matter what happens inside of the try or/and catch block.

// The finally block will not be executed if the program exits by exit() or if there is a fatal error causing the process to abort.
