package com.bayviewglen.daytwo;

public class HomeworkFour {

	public static void main(String[] args) {
		double xOne, xTwo, yOne, yTwo, slope; 
		
		xOne = 1;
		yOne = 2;
		xTwo = 78;
		yTwo = 100; 
		
		slope = (yTwo - yOne)/(xTwo - xOne); 
		
		System.out.println("Given two points, (" + (int)xOne + ", " + (int)yOne + ") and (" + (int)xTwo + ", " + (int)yTwo + "), the slope of a line that goes through these two points is " + slope + ".");

	}

}
