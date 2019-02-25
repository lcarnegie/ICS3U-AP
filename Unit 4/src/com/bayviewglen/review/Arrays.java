package com.bayviewglen.review;

public class Arrays {

	public static void main(String[] args) {
		int[][] arr = new int[3][2]; 
		populate(arr); 
		display(arr); 
		

	}

	private static int[][] populate(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)((Math.random() * 10) + 1); 
			}
		}
		return arr; 
		
	}
	private static void display(int[][] arr) {
		for (int i=0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
