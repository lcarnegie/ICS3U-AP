package com.bayviewglen.dayone;

import java.util.Scanner; 
public class ExampleThree {
	
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.print("Please enter a mark out of 100: ");
		int testMark = Integer.parseInt(in.nextLine()); 
		
		if(testMark >= 80) {
			System.out.println("You got an A");
		}else if(testMark >= 70) {
			System.out.println("You got a B");
		}else if(testMark >= 60) {
			System.out.println("You got a C"); 
		}else if(testMark >= 50) {
			System.out.println("You got a D"); 
		}else{
			System.out.println("You got an F"); 
		}
		
		// Shoe example
		
		String colour = "red"; 
		int maxShoeSize = 10; 
		
		System.out.print("Please enter your shoe size:");
		String shoeSizeAsString = in.nextLine(); 
		int shoeSize = Integer.parseInt(shoeSizeAsString); 
		
		System.out.print("Please enter your shoe colour:");
		String shoeColour = in.nextLine();
		
		if((colour.equals(shoeColour)) && (shoeSize <= maxShoeSize)) {
			System.out.println("You have small red shoes!!!!!");
		}else {
			if(!shoeColour.equals(colour)) {
				System.out.println("You don't have small red shoes!!!!!");
			}
			
			if(!(shoeSize <= maxShoeSize)) { //Same thing as saying >= 
				System.out.println("You have big feet!!!!!");
			}
		}
		

	}

}
