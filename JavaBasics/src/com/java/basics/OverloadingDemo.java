package com.java.basics;

// An overloaded constructor is needed when an object needs to be initialized in different ways. 

public class OverloadingDemo {
	
	double width, height, depth;
	
	// constructor used when all dimensions specified
	
	OverloadingDemo(double w, double h, double d){
		
		System.out.println("* Overloaded Constructor Demo *");
		
		width = w;
		height = h;
		depth = d;
		
	}
	
	// Constructor used when no dimensions specified 
	
	OverloadingDemo(){
		
		width = height = depth = 0;
	}
	
	// constructor used when cube is created
	
	OverloadingDemo(double len){
		
		width = height = depth = len;
		
	}
	
	// compute and return volume
	
	double volume() {
		
		return width * height * depth;
		
	}

}
