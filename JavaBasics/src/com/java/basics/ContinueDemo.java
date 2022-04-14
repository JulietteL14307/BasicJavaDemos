package com.java.basics;

// The continue statement in Java is used to skip the current iteration in a loop.

// Continue statements can be used when we want to continue a loop, but do not want the remaining statements after the continue.

public class ContinueDemo {
	
	public ContinueDemo() {
		
	}
	
	public void continuation() {
		
		System.out.println("* Continue Demo *");
		
		for (int i = 0; i < 5; i++) {
			
			// if the number is 3, skip & continue
			
			if (i == 3)
				continue;
			
			System.out.println("i: " + i);
			
		}
		
		System.out.println();
		
	}

}
