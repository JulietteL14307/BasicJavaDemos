package com.java.basics;

// StringBuffer is a peer class of String that allows manipulation of the string. String alone is a fixed element. StringBuffer can grow and make more room, often having more characters preallocated than may be needed, allowing room for change.   

public class StringBufferDemo {
	
	public StringBufferDemo() {
		
	}
	
	public void stringBuffer() {
		
		System.out.println("* StringBuffer Demo *");
		
// Creating and storing a string in a StringBuffer object
		
		StringBuffer sb = new StringBuffer("MyString");
		
// Getting the length of the string 
		
		int l = sb.length();
		
// Getting the capacity of the string
		
		int c = sb.capacity();
		
// Print the length and capacity of the string into the console
		
		System.out.println("Length of string MyString = " + l);
		
		System.out.println("Capacity of string MyString = " + c);
		
		System.out.println();
		
	}

}


// Other StringBuffer methods :

// append(String str) appends the specified string at the end of this string

// insert(int offset, String str) inserts specified string at the offset indicated position

// replace(int startIndex, int endIndex, String str) replaces the substring of the StringBuffer from startIndex - endIndex with the specified string

// delete(int startIndex, int endIndex) deletes the substring of the StringBuffer from startIndex - endIndex

// reverse() replaces the stringbuffer's character sequence by reverse character sequence

// ensureCapacity(int minCapacity) ensures the capacity is at least equal to the specified minimum