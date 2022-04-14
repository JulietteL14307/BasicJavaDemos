package com.java.basics;

import java.util.*;

// Set is a distinct list of elements which is unordered.

// This is different from List which is an ordered sequence of elements.

// Set is an interface that contains methods inherited from the Collection interface and adds a feature that restricts the insertion of duplicate elements.

// There are two interfaces that extend Set - SortedSet & NavigableSet

public class SetDemo {
	
	public SetDemo() {
		
	}
	
	public void setDemo() {
		
		System.out.println("* Set Demo *");
		
		// Demonstrating Set using HashSet
		// Declaring object of type String
		
		Set<String> hashSet = new HashSet<String>();
		
		// Adding elements using add() method
		
		hashSet.add("Set");
		hashSet.add("Demo");
		hashSet.add("Examples");
		
		// Print elements of HashSet object
		
		System.out.println(hashSet);
		
		System.out.println();
		
	}

}
