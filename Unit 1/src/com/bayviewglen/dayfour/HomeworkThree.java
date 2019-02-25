package com.bayviewglen.dayfour;

import java.util.Scanner; 

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a five (5) digit number, and press enter: ");
		
		int number = input.nextInt(); 
		
		while(number > 99999 || number < 10000) {
			System.out.println("Please enter a five (5) digit number, and press enter: ");
			number = input.nextInt(); 
		}
		
		int digit2 = number / 1000 % 10; 
		
		int digit4 = number / 10 % 10; 
		
		int product = digit2 * digit4; 
		
		System.out.println("The number your entered was " + number + ", so the product of the numbers 2nd and 4th digits is " + product + ".");

	}

}
