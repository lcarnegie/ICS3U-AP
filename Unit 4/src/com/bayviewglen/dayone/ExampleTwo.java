package com.bayviewglen.dayone;

public class ExampleTwo {

	public static void main(String[] args) {
		int[] arr = {3, 5, 6, 10, -2, 11}; 
		//fast way of creating an array -> but not very common 
		
		//arr = {2,3} 
		//only time you can use curly braces is when you declare the reference to an array and initialize the array at the same time
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		} 
		
		System.out.println();
		
		arr = new int[3]; 
		
		System.out.println("arr referencing a new array");
		for (int i=0; i<arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}  
		

	}

}
