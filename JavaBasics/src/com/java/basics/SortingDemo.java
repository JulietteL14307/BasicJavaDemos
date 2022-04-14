package com.java.basics;

import java.util.Arrays;

// The sort() method can either be used as a method of the Array class or of the Collections class.

// Arrays.sort() works for arrays which can be of primitive data type also which in turn by default sorts in ascending order.

// Collections.sort() works for objects Collections like ArrayList and LinkedList.

public class SortingDemo {
	
	public SortingDemo() {
		
	}
	
	public void arraySort() {
		
		System.out.println("* Sorting Array Demo *");
		
		// Custom input array
		
		int[] arr = {4, 30, 19, 5, 14, 21};
		
		System.out.println(Arrays.toString(arr));
		
		// Calling the sort() method
		
		Arrays.sort(arr);
		
		// Printing the sorted array
		
		System.out.printf("Array after sort(): %s", Arrays.toString(arr));
		
	}

}
