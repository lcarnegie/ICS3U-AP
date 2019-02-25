package com.bayviewglen.daytwo;

/*
 * Topics Covered:
 * 1. Declaring Variables
 * 2. Primitive Data Types
 * 3. Assignment Operator
 * 4. String Concatenation
 * 5. CTRL-SHIFT-F is auto indent/format (Select All First CTRL-A)
 */
public class ExampleOne {

	public static void main(String[] args) {
		/*
		 * Primitive Variables
		 * Variables that store primitive data include stuff like
		 * int x; -> default value of an int is Zero or int y = 7;
		 */
		int x;  	// Declared x as a primitive integer
		int y = 10; // Declared as a primitive integer and initialized it as 10
		
		x = 17;		// x is assigned 17 (= is the assignment operator)
		//17 = x;   //the left hand side of an assignment MUST be a variable
		
		int z = x + y; //Operations like addition come before assignments
		
		System.out.println(z);
		
		int numberOne, numberTwo = 9;
		
		numberOne = 8;
		
		//Declare variables when you need them. 
		int sum = numberOne + numberTwo; 
		
		System.out.println(numberOne + " + " + numberTwo + " = "  + sum); //String Concatenation: tying data together (use +)
		
		
		
	}

}
