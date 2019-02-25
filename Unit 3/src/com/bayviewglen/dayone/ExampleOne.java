package com.bayviewglen.dayone;

/*
 * Boolean Expressions
 * 
 * 1. Simple Expressions
 * 2. Compound Expressions 
 */
import java.util.Scanner; 
public class ExampleOne {

	public static void main(String[] args) {
		int x = 7; 
		
		//x > 7 is a simple boolean expression
		// boolean expressions evaluate to either true or false
		
		boolean result1 = x>7; // result1 = false (7>7 is false)
		System.out.println(result1); 
		
		String colour = "red"; 
		int maxShoeSize = 10; 
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your shoe size:");
		String shoeSizeAsString = in.nextLine(); 
		int shoeSize = Integer.parseInt(shoeSizeAsString); 
		
		System.out.print("Please enter your shoe colour:");
		String shoeColour = in.nextLine();
		
		boolean isSmallRedShoes = (colour.equals(shoeColour)) && (shoeSize <= maxShoeSize); 
		System.out.print(isSmallRedShoes);
		
		

	}

}
