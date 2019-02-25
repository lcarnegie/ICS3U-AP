package com.bayviewglen.dayfour;

import java.util.Scanner;

/*
 Declaring a Scanner to read input from the keyboard
 
 Reading Integer Data
 
 Prompt the use for three different integers and display the average of the three number 
 */

public class ExampleOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int x, y, z; 
		
		System.out.print("Please enter three (3) numbers and press enter: ");
		
		x = input.nextInt(); 
		y = input.nextInt();
		z = input.nextInt(); 
		
		
		
		double average = (x + y + z) / 3.0; 
		
		System.out.println("The average is: " + average);
		
		input.close(); // Closes the "connection" 
		
		
		
		
		
	}

}
