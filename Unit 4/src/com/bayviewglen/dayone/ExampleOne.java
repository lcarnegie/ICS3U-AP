package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		int[] arr = new int [5]; 
		//declared a reference to an int array
		//constructs a new int array of size 5 
		//assigns the variable arr to the new int array 
		
		// to access the individual elements we use []
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		
		System.out.println();
		
		System.out.println("The array, edited");
		arr[0] = 5; 
		arr[1] = 2; 
		arr[2] = 4; 
		arr[4] = 10; 
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}
}
