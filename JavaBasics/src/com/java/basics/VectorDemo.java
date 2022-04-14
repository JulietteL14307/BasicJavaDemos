package com.java.basics;

import java.util.Vector;

// Vector is the synchronized version of ArrayList.

// This means that it is rarely used in a non-thread environment as it has poor performance in adding, searching, deleting, and updating items in the List. ArrayList is better for these purposes.

// The Iterators returned from the Vector class are fail-fast. In the case of concurrent modification, it will fail and throw "ConcurrentModificationException"

public class VectorDemo {
	
	public VectorDemo() {
		
	}
	
	public void vectorDemo() {
		
		System.out.println("* Vector Demo *");
		
		// size of Vector
		
		int n = 5;
		
		// Declaring the Vector with initial size v
		
		Vector<Integer> v = new Vector<Integer>(n);
		
		// Appending new elements at the end of the Vector
		
		for (int i = 1; i <= n; i++)
			v.add(i);
		
		// Printing your elements
		
		System.out.println(v);
		
		// Removing element at index 3
		
		v.remove(3);
		
		// Displaying the Vector again after deletion
		
		System.out.println(v);
		
		// Iterating over Vector elements using for loop
		
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i) + " ");
		
		System.out.println();
		
	}

}
