package com.bayviewglen.review;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {2, 3, 7, 5, 6, 4, 8, 1}; 
		
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%4d", arr[i]); 
		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i; 
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j; 
			}
			int temp = arr[i]; 
			arr[i] = arr[minIndex]; 
			arr[minIndex] = temp;
		}
		System.out.println();
		
		
		
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%4d", arr[i]); 
		}
		
	}

}

	