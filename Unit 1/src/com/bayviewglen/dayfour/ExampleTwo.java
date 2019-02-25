package com.bayviewglen.dayfour;
import java.util.Scanner;

/*
 Calculate the surface area of a box
 
 Prompt the user of the dimensions 
 
 Assume the box has a lid
 */

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Please enter the length and width of the base of the box: ");
		double length = input.nextDouble(); 
		double width = input.nextDouble(); 
		
		System.out.println("Please enter the height of the box: ");
		double height = input.nextDouble();
		
		double surfaceArea = 2 * (length * height + length * width + width * height); 
		
		System.out.println("The surface area of the box is: " + surfaceArea);
		
		input.close();
	}

}
