package com.bayviewglen.daytwo;

public class ExampleOne {

	public static void main(String[] args) {
		String[] arr = new String[5];
		
		for (int i=0; i<arr.length; i++){
			System.out.println(i + ": " + arr[i]);
		}
		
		System.out.println();
		
		// System.out.println(arr.length);
		// System.out.println(arr[2].length());	// null pointer exception
		
		arr[0] = "Apple";	// String Literal
		arr[1] = "Apple";	// String Literal
		arr[2] = "Grapes";	// String Literal
		arr[4] = new String("Apple");	// String Object - not a String Literal - stored differently
		
		
		System.out.println(arr[0] == arr[1]);	// true
		System.out.println(arr[0] == arr[4]);	// false
		System.out.println(arr[0].equals(arr[4]));	// true
		
		System.out.println();
		
		System.out.println(arr); // prints the address of the array 
		System.out.println(arr.length); // property of array 
		System.out.println(arr[2].length()); // "grapes" has 6 characters // has () since it is a method
		
		System.out.println();
		
		
		for (int i=0; i<arr.length; i++){
			System.out.println(i + ": " + arr[i]);
		}
	}
}

