package com.bayviewglen.dayfive;

import java.util.Scanner; 

public class HomeworkFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Calculate the winning percentage of your favourite team!");
		System.out.println("How many games did your team win? :"); 
		int gamesWon = input.nextInt(); 
		System.out.println("How many games did your team lose? :");
		int gamesLost = input.nextInt(); 
		
		double winningPercentage = 100 * (gamesWon / (double)(gamesWon + gamesLost)); 
		
		System.out.print("Your winning percentage is: " + (Math.round(100 * winningPercentage) * 0.01) + "%.");

	}

}
