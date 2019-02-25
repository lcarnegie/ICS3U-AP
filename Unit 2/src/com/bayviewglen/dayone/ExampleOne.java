package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		int x = 317; 
		
		System.out.println("This is the number" + x);
		System.out.printf("This is the number: %d", x);
		
		int a = 10; 
		int b = 17; 
		int sum = a + b; 
		
		System.out.println(a + "+" + b + "=" + sum);
		System.out.printf("%d + %d = %d\n", a, b, sum); 
		
		double c = 10.25; 
		double d = 17.452467; 
		double sum2 = c + d; 
		System.out.printf("%10.1f\n", sum2); //Placeholder is for a floating-point number 
		//It will get a width of ten and 1 decimal place\
		System.out.printf("%-10.1f\n", sum2);//Same as above, though the - makes it left-aligned. 
		
		
		//Right align an integer with a width of 15 
		
		int z = 64; 					//Remember, d means you have to put an int and f means to put a double. 
		System.out.printf("%15d", z);
		
		int minutes = 5; 
		double seconds = 6.351; 
		
		System.out.printf("%d:%06.3f\n", minutes, seconds); 
		
		int f = 3423423;  
		System.out.printf("%,d", f);// Puts commas in between the numbers 

	}

}
