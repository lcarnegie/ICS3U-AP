package com.bayviewglen.dayfour;

import java.util.Scanner; 

/*
 Use the scanner to read the input from the use/keyboard
 
 Prompt the user for a three digit integer
 
 Display the sum of the three digits 
 */

public class ExampleThree {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		
		System.out.print("Please enter three digits, and I will return the sum: ");
		int number = input.nextInt();
		/*
		if(number < 100 || number > 999 ) {
			throw new IllegalArgumentException("Number must be three (3) digits.");
		}
		*/
		while (number < 100 || number > 999) {
			System.out.println("Please enter a three (3) digit number: ");
			number = input.nextInt(); 
		}
		
		int digit1 = number / 100; 
		int digit2 = number / 10 % 10; 
		int digit3 = number % 10; 
		
		int sum = digit1 + digit2 + digit3; 
		
		System.out.println("The sum of the digits is: " + sum);
		

	}

}
