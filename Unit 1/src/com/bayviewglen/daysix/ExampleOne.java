package com.bayviewglen.daysix;
/* Random Numbers */

public class ExampleOne {

	public static void main(String[] args) {
		double x = Math.random(); // Random Number [0.0, 1.0)
		System.out.println(x);
		
		//Random # between 0 and 9. 
		int y = (int)(Math.random() * 10); 
		System.out.println(y);
		/*
		final int UNIQUE_NUMBERS = 10; 
		
		for (int i=0; i<100; i++ ) {
			System.out.println((int)(Math.random() * UNIQUE_NUMBERS));
		}
		*/ 
		
		/*
		// need a random rumber from 1 to 10 
		final int UNIQUE_NUMBERS = 10; 
		final int LOWER_BOUND = 1; 
		y = (int)(Math.random() * UNIQUE_NUMBERS) + LOWER_BOUND; 
		System.out.println(y);
		
		int[] frequency = new int[UNIQUE_NUMBERS]; 
		for(int i=0; i<200000; i++) {
			y = (int)(Math.random() * UNIQUE_NUMBERS) + LOWER_BOUND; 
				frequency[y-1]++; 
		}
		
		System.out.println(); 
		*/ 
	}

}
