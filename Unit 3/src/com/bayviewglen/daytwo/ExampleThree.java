package com.bayviewglen.daytwo;

import java.util.Scanner; 
public class ExampleThree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int x = 0; 
		int sum = 0; 
		
		//Don't know how many times we need to execute
		//we will use a while loop 
		for(boolean isDone = false; !isDone;) {
			System.out.print("Please enter a number: ");
			x = in.nextInt(); 
			if (x%2==1)
				isDone = true; 
			else 
				sum += x; 
		}
		
		System.out.println("The sum of the numbers is: " + sum);
		
		
		in.close(); 
		
		
		
		int z = 7; 
		
		while(z >= 7) { // infinite loop 
			System.out.println("NO!");
			z++; 
		}
		
		for(int y = 0; y<10; y--) {
			System.out.println("YES!");
		}
		
		/*
		 * So, which loop do I use??
		 * If you know how many times it will execute then use a for loop
		 * 
		 * If you DON'T KNOW how many times it will execute, then use a while loop
		 * 
		 */
		
		
		
	}

}
