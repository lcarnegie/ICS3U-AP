package com.bayviewglen.dayfour;

import java.util.Scanner; 
public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter how much your test was out of: ");
		
		int testTotalMarks = input.nextInt(); 
		
		System.out.println("Please enter your score on the test: ");
		
		int studentMarks = input.nextInt(); 
		
		double studentScore = 100 * (studentMarks/(double)testTotalMarks);
		
		System.out.println("You earned " + (int)studentScore + "% on your test.");
		
		

	}

}
