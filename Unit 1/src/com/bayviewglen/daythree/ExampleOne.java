package com.bayviewglen.daythree;

public class ExampleOne {

	public static void main(String[] args) {

		/*Integer Division*/
		public static void main(String[] args) {
			System.out.println(365/23);
			System.out.println(365%23); //The % is the modulus operator
										// it yields the remainder of a division. 
			
			
			System.out.println(1/2);
			System.out.println(1%2);
			
			int number = 365; 
			
			if (number % 2 == 0) {			//Don't stress about the if
				System.out.println("Even");// If we divide by two and get the remaider, 
			}else {						   //it is even if the remainder is 0
				System.out.println("Odd");// Else/ otherwise the number is odd. 
			}
			
			System.out.println("The number " + number + " is divisible by 5: " + (number % 5 == 0));
			
			int counter = 1; 
			
			while(counter <= 1000) {					// Keeps repeating WHILE counter <= 1000
				if(counter % 10 == 10) {				//Checks if counter is divisible  by 10
					System.out.println(counter);		
				}
				counter++; 								// adds one to the variable counter
			}
			

	}

}
