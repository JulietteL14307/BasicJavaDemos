package com.java.basics;

// Break is used to terminate from a loop immediately. When a break statement is encountered inside a loop, the loop iteration stops there, and control returns from the loop immediately to the first statement after the loop.

// Break statements are used when we are unsure of the actual number of iterations for the loop or we want to terminate it based on a condition.

public class BreakDemo {
	
	public BreakDemo() {
		
	}
	
	public void breakEx() {
		
		System.out.println("* Break Demo *");
		
		// Initially the loop is set from 0-5
		
		for (int i = 0; i < 5; i++) {
			
			// Terminate the loop when i is 3
			
			if (i == 3)
				break;
			
			System.out.println("i: " + i);
			
		}
		
		System.out.println("Break on loop");
		
		System.out.println();
		
	}

}
