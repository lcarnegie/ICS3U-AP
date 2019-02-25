package com.bayviewglen.daytwo;

public class ExampleThree {

	public static void main(String[] args) {
		String[] arr = {"Apple", "Pear", "Grape", "Almond"};
		
		
		for (int i=0; i<arr.length; i++){
			System.out.println(i + ": " + arr[i]);
		}
		
		System.out.println();
		
		
		int i = 0;
		// for-each loop. purpose - to iterate through the array or collection, beginning to end
		// no index!!!!!
		// if you need index, use for loop 
		for (String el : arr){ // thing you want to iterate through is the array,        
			System.out.println(el);
		}
		
		// added 
		int[] pixels = {1,1,1,1,0,0,1,1,0,1,0,1,1,1,0,0,0};
				
				int numOnes = 0;
				for (int pixel /*This is just a COPY of the value in the element the loop it's iterating */ : pixels){
					if (pixel == 1)
						numOnes++;
				}
				
				System.out.println(numOnes);
				
		
		
	}
}

