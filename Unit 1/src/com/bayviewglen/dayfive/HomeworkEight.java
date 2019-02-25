package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: ");
		double number = input.nextDouble(); 
		
		while(number < 0) {
			System.out.print("Sorry, that isn't a positive number. Please enter a positive number: ");
			number = input.nextDouble(); 
		}
		
		double square = Math.pow(number, 2); 
		
		double sqrt = Math.sqrt(number); 
		
		System.out.print("Given " + number + ", its square is about " + (Math.round(square * 100) * 0.01) + ", and its square root is about " + (Math.round(sqrt * 100) * 0.01) + ".");
		
	}
}
