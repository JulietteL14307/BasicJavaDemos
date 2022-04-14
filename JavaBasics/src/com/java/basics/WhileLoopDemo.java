package com.java.basics;

// While loops check for a condition to be true, once evaluated then the statement inside will be executed. The loop will terminate when the condition is false.

public class WhileLoopDemo {
	
	public WhileLoopDemo() {
		
	}
	
	public void whileLoop() {
		
		System.out.println("* While Loop Demo *");
		
		int x = 1;
		
// Exit loop when x becomes greater than 5
		
		while (x <= 5) {
			
			System.out.println("Value of x: " + x);
			
// Incrementing the value of x for the next iteration
			
			x++;
			
			System.out.println();
		}
		
	}

}
