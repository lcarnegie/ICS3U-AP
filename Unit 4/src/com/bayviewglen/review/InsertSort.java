package com.bayviewglen.review;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {2, 3, 7, 5, 6, 4, 8, 1}; 
		
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%4d", arr[i]); 
		}
		
		for (int i=1; i<arr.length; i++){
			int temp = arr[i];
			int j;
			
			for (j = i-1; j>=0 && temp < arr[j]; j--){
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
		}
		System.out.println();
		
		
		
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%4d", arr[i]); 
		}
		
	}

}

	