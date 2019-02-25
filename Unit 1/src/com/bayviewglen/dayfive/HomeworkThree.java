package com.bayviewglen.dayfive;

import java.util.Scanner; 
public class HomeworkThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("How many minutes in a minute?: ");
		int minute = input.nextInt(); 
		
		int year = minute * 60 * 24 * 365; 
		
		System.out.println("There are " + year + " minutes in a year!");
		
		
		
	}

}
