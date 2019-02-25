package com.bayviewglen.daythree;

public class ExampleThree {
	/* Types of Errors */
	public static void main(String[] args) {
		//ints x, y; // Syntax Error. There is an issue with the code -- it doesn't make any sense. 
		
		
		
		/*
		int x = 7; 
		int y = x / 0;  // Run-time exception - occurs when at runtime Java throws an exception 
		
		System.out.println(y);
		*/ 
		
		int radius = 3; 						//Logic Errors - code compiles and runs but sometimes goes unnoticed for a long time. 
		double areaOfCircle = Math.PI * 2 * radius; // they are hard to find!!! - should be PI*r^2  
		
		System.out.println("Area of the circle is: " + areaOfCircle);
	}

}
