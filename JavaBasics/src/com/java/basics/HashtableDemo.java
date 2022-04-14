package com.java.basics;

import java.util.*;

// Both HashMap and HashTable stores the data in key value pair and at the time storing data hashing is used to hash the key and the resulting hash code is used as the index at which the value is stored within the table. 

public class HashtableDemo {
	
	
	public HashtableDemo() {
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })
	public void hashTable() {
		
		
	System.out.println("* HashTable Demo *");
	
// Creating a hash map (Hashmap CAN have null values)
	
	Hashtable myHtable = new Hashtable();
	Enumeration numbers;
	String str;
	double bal;
	
	myHtable.put("Number 1", new Double(100));
	myHtable.put("Number 2", new Double(60));
	myHtable.put("Number 3", new Double(40));
	
// Show all balances in Hashtable (Hashtable CANNOT have null values)
	
	numbers = myHtable.keys();
	
	while(numbers.hasMoreElements()) {
		
		str = (String) numbers.nextElement();
		System.out.println(str + " - " + myHtable.get(str));
		
	} 
	
// Adding to your numbers in your table
	
	bal = ((Double)myHtable.get("Number 3")).doubleValue();
	myHtable.put("Number 3", new Double(bal + 10));
	System.out.println("Number 3's new balance: " + myHtable.get("Number 3"));
	
	System.out.println();
}
		
	}


