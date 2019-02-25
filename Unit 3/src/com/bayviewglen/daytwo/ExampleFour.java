package com.bayviewglen.daytwo;

public class ExampleFour {
		// Display a 3 x 5 grid of dots
	public static void main(String[] args) {
		final int NUM_ROWS = 34; 
		final int NUM_COLS = 32; 
		
		for(int j = 0; j<NUM_ROWS; j++) {
			//build a row of dots
			for(int i = 0; i<NUM_COLS; i++) {
				System.out.print(".");
			}
			System.out.println();
		}

	}

}
