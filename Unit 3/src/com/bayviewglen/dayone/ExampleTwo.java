package com.bayviewglen.dayone;

public class ExampleTwo {

	public static void main(String[] args) {
		//Joining two expressions together is called a COMPOUND EXPRESSION
		// && is and
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true)); // This is dead code, or "short-circuited code" because false and anything is false 
		System.out.println("false && false: " + (false && false));// This is dead code, or "short-circuited code" because false and anything is false 
		
		// || is or 
		System.out.println("true || true: " + (true || true));//Dead code, because it already knows it is going to be true. 
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true)); 
		System.out.println("false || false: " + (false || false));
		
		System.out.println("\n\n!true: " + !true);
		System.out.println("!false: " + !false);
		
		

	}

}
