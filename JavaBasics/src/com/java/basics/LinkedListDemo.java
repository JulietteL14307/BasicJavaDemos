package com.java.basics;

// A LinkedList is almost identical to an ArrayList, but they are built differently. You can manipulate them in all of the same ways, but a LinkedList has each element stored in a separate "container"

// This makes it better to use LinkedList when manipulating data and using ArrayList when accessing data

import java.util.LinkedList;

public class LinkedListDemo {
	
	public LinkedListDemo() {
		
	}
	
	public void linkedList() {
						
		System.out.println("* LinkedList Demo *");
		
		LinkedList<String> flowers = new LinkedList<String>();
		
// Adding to your LinkedList 
		
		flowers.add("Tulip");
		flowers.add("Daisy");
		flowers.add("Lily");
		
		System.out.println(flowers);
		
		System.out.println();
		
	}

}

// LinkedList manipulation methods :

// addFirst() will add an item to the beginning of the list

// addLast() will add an item to the end of the list

// removeFirst() will remove an item from the beginning of the list

// removeLast() will remove an item from the end of the list

// getFirst() will get the item at the beginning of the list

// getLast() will get the item at the end of the list

// There is also a CircularLinkedList.

// A circular linked list is a variation of a linked list in which the last node points to the first node, completing a full circle of nodes. In other words, this variation of the linked list doesn't have a null element at the end.
