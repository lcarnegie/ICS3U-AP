package com.bayviewglen.dayone;

/*Recursive Programming*/ 
public class ExampleOne {

	
	static int n = 50; 
	static long[] solutions = new long[n+1]; 
	public static void main(String[] args) {
		
		//System.out.println(factorial(n));
		System.out.println(fibonacci(n));

	}

	private static long fibonacci(int n) {
		if(n < 3)
			return 1;
		else if(solutions[n] != 0) { // the answer is stored
			return solutions[n]; 
		}
		else {
				solutions [n] = fibonacci(n-2) + fibonacci(n-1); 
				return solutions[n]; 
		}
	}

	private static long factorial(int n) {
		if(n < 2)
			return 1; 
		else 
			return n * factorial(n-1); 
		
	}

}
