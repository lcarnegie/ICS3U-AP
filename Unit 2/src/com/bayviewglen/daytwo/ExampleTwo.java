package com.bayviewglen.daytwo;

import java.util.Scanner; 
public class ExampleTwo {
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 
			
			System.out.print("Mile One:");
			String temp = in.nextLine(); 
			
			int minutes; 
			double seconds; 
			
			int colon = temp.indexOf(":"); 
			minutes = Integer.parseInt(temp.substring(0, colon)); 
			seconds = Double.parseDouble(temp.substring(colon + 1)); 
			
			System.out.println(minutes);
			System.out.println(seconds);
			
			//Assume minutes = 5
			//assume seconds = 34.221
			
			//total time = 334.221 seconds
			//minutes * 60 + seconds
			
			//goal is to convert 334.221 into 5 minutes and 34.221 
			
			
			
			
			// Make the output look like this 
			
			
			/*
			 
			 Runner Name       Split One       Split Two      Split Three       Finish Time 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 */
			
			
			
		}
}
