package com.java.basics;

// The switch statement is a multi-way branch that provides a way to execute different parts of code based on the value of the expression.

// The break statement can be used in a switch statement and is optional.

// If the break statement is not used, the execution will continue onto the next case.

public class SwitchDemo {
	
	public SwitchDemo() {
		
	}
	
	public void switchDemo() {
		
		System.out.println("* Switch Demo *");
		
		int s = 3;
		
		switch (s) {
		
		case 0:
			System.out.println("s is zero.");
			break;
		
		case 1:
			System.out.println("s iz one.");
			break;
			
		case 2:
			System.out.println("s is two.");
			break;
			
		case 3:
			System.out.println("s is three");
			break;
		
		default:
			System.out.println("Invalid number.");
		}
		
		System.out.println();
		
	}

}
