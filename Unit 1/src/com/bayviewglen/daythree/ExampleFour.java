package com.bayviewglen.daythree;

public class ExampleFour {

	 

	public static void main(String[] args) {
		int numberOfSides = 6; 			// just like a variable - change me anytime you like! 
		
		final int NUMBER_OF_SIDES = 6; //Final modifies a variable to a constant meaning it cannot change -- it is final!! 
		
		// NUMBER_OF_SIDES = 23; you cannot do that! 
		
		// You have 23 student and you want to get the average of their test scores. 
		
		final int NUM_OF_STUDENTS = 23;
		
		int sumOfTestScores = 1978;
		
		double averageTestScore = sumOfTestScores / NUM_OF_STUDENTS;
		
		// Use Constant to improve readability, makes the code easier to understand! 
		//Use constants to improve maintainability -> maybe the constant is used in many different places
														// we can easily update it with one edit. 
		

	}

}
