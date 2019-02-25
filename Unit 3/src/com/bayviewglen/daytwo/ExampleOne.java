package com.bayviewglen.daytwo;

public class ExampleOne {
	/* Investigating for loops
	 * for loops are counting loops 
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		//4 parts to a for loop
		//
		//1. int i=0; This initializes the counter
		//2. i < 10; This is the condition - if it is true, it will execute what is inside the loop/
		//3. i++; This is how we modify or increment the counter
		//4. System.out.println(i); this is the body and executes when the condition is true.
		
		//The flow is 1...2...4...3...2...4...3...2...4...3
		//Initialize
		//Check condition
		//do body
		//increment 
		//Check condition
		//do body
		//increment 
		
		System.out.println("------------------------------");
		//what we want is to print even numbers
		for (int i = 0; i < 10; i++) {
			if (i%2==0){
				System.out.println(i);
			}
		}

		System.out.println("------------------------------");
		//what we want is to print even numbers
		for (int i = 0; i < 10; i++) {
			if (i%2==0){
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------------");
		
		
		/*
		 * WHILE LOOP
		 * Same as for loop but with the while loop it only checks if the condition is met and 
		 * Basically any time we are counting, we want to use a FOR LOOP 
		 */
		int i = 0; 
		while(i<10) {
			System.out.println(i);
			i+=2; 
		}
	}

}
