package com.bayviewglen.dayfive;

import java.util.Scanner;
public class HomeworkFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("What is the speed of light, in metres per second?: ");
		int speedOfLight = input.nextInt(); 
		if(speedOfLight != 300000000) {
			speedOfLight = 300000000; 
			System.out.println("Rounded, it's actually 300000000 metres per second, and that is with eight (8) zeroes. Try again: ");
			input.nextInt(); 
		}
		int lightYear = speedOfLight * 3600 * 24 * 365; 
		
		System.out.println("The distance that a light beam would travel in one year (a light year) is " + lightYear + " metres.");

	}

}
