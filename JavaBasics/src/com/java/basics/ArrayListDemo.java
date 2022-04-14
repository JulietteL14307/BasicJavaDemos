package com.java.basics;

import java.util.ArrayList;

// An ArrayList is a changeable array (an array on it's own cannot be changed) 

public class ArrayListDemo {
	
	ArrayList<String> cats = new ArrayList<String>();
	
	public ArrayListDemo() {
		
	}
	
	public void arrayList() {
	
	System.out.println("* Array List Demo *");
	
// Adding to your ArrayList
			
		cats.add("American-Short-Hair");
		cats.add("Siamese");
		cats.add("Ragdoll");
			
// Access an element in the ArrayList referring to it's index number
			
		cats.get(0); // 0 is the first index number, "American-Short-Hair" would be returned 
			
// Changing an element by referring to it's index number
		
		cats.set(0, "Persian");
			
// Removing an element by referring to it's index number
			
		cats.remove(2); // "Ragdoll" would be removed
			
// To remove all elements in an ArrayList the "clear()" method would be used
			
// Finding how many elements are in the ArrayList
			
		cats.size(); // this method could be used to loop through the ArrayList
	
	}
	
	public void arrayListMethod()
	{
		
		for (int i = 0; i < cats.size(); i++) {
			
			System.out.println(cats);
		}
		
		System.out.println();
	}

}
