package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		int number = 574853; 
		
		//What is the sum of the digits in the number? 
		
		int digit1 = number / 10000; 		//57485 / 10000 = 5
		int digit5 = number % 10; 			//57485 % 10 = 5
		int digit2 = number / 1000 % 10; 	// 57485/ 1000 = 57 % 10 = 7
		int digit3 = number / 100 % 10; 	//57485 / 100 = 574 % 10 = 4
		int digit4 = number / 10 % 10; //57485 / 10 = 5748 % 1- = 8 
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5; 
		System.out.println("The Sum of the digits in the number " + number + " is: " + sum); 

	}

}
