package com.bayviewglen.dayone;

public class ExampleFive {
	
	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 6, 6, 6 };
		
		int max = maxValue(arr);
		int maxIndex = getMaxIndex(arr); 
		
		System.out.println("The max value in the array is " + max + " at index " + maxIndex);
		
	}

	private static int maxValue(int[] arr) {
		int max = arr[0];  // assuming that the largest number is the 1st index 
		
		for (int i = 1; i < arr.length; i++) {
			if(arr [i] > max)
				max = arr[i]; 
		}
		return max; 
		
		
	}
	
	public static int getMaxIndex(int[] arr) { // this will find the index of the max value in the index
		int maxIndex = 0; 
		
		for (int i = 0; i < arr.length; i++){
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i; 
			}
		}
		
		return maxIndex; 
	}
}
