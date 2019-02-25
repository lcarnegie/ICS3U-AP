package com.bayviewglen.dayone;

import java.util.ArrayList; 

public class ExampleOne {

	public static void main(String[] args) {
		// The ArrayList must store objects using <E>
		ArrayList<Integer> ints = new ArrayList<Integer>(); 
		
		System.out.println("Size: " + ints.size());
		
		ints.add(9); 
		ints.add(10); 
		ints.add(-6); 
		
		System.out.println(ints);
		
		//This does not mean the size of the array is 3
		//it probably isn't actually 3
		System.out.println("Size: " + ints.size());

	}

}
