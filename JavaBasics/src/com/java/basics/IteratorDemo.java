package com.java.basics;

// Iterators are used in the Collection framework to retrieve elements one by one. Using Iterator, you can use both read and remove operations.

// Iterator must be used whenever we want to enumerate elements in all Collection framework implemented interfaces like Set, List, Queue, Dequeue, and all implemented classes of Map interface.

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public IteratorDemo() {
		
	}
	
	public void iteratorDemo() {
		
		System.out.println("* Iterator Demo *");
		
		// Create an ArrayList class object of integer type
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Iterating over the List
		
		for (int i = 0; i < 5; i++)
			al.add(i);
		
		// Print the elements
		
		System.out.println(al);
		
		// At the beginning, itr(cursor) points to the index before the first element of the List(al)
		
		@SuppressWarnings("rawtypes")
		Iterator itr = al.iterator();
		
		// Checking the next element where the condition holds true until there is a single element left using the hasNext() method
		
		while (itr.hasNext()) {
			
			// Moving the cursor to the next element
			
			int i = (Integer)itr.next();
			
			// Print elements one by one
			
			System.out.println(i + " ");
			
			// Removing odd elements
			
			if (i % 2 != 0)
				itr.remove();
		}
		
		System.out.println(al);
		
		System.out.println();
		
	}

}
