package com.bayviewglen.daytwo;
	/*
 * 1. Primitive Data -> Double
 * 2. Casting
 */
public class ExampleTwo {
	/*
	 * Get the average of 3 marks - do it twice
	 */
	public static void main(String[] args) {
		double markOne = 70, markTwo = 75, markThree = 70;
		
		double averageMark = (markOne + markTwo + markThree)/3;
		
		System.out.println("The average of the marks is: " + averageMark);
			// The average of the marks is: 71.66666666666667
		
		int testOne = 70, testTwo = 75, testThree = 70; 
		
		averageMark = (testOne + testTwo + testThree)/3; // Java divides integers like we do, with long division so there is remainders, but it gets rid of them. 
		// The average is 71.0
		// A little unexpected as we lost the 0.66666667
		// Why? Because when you have two ints as your operands you do int math
		// Divide two ints you will get an int.
		
		averageMark = (testOne + testTwo + testThree)/3.0; 
		//The average of the marks is: 71.66666666666667, so just make it a 3.0 and you make it a double. 
		
		int numTests = 3; 
		averageMark = (double)(testOne + testTwo + testThree) / numTests; 
		//double  / int = double, we casted here by telling java to treat these ints as doubles for this equation only
		
		System.out.println("The average of the marks is: " + averageMark);
		
		averageMark  = (testOne + testTwo + testThree) / (double)averageMark;
		
		System.out.println("The average of the marks is: " + averageMark);
		
	}

}
