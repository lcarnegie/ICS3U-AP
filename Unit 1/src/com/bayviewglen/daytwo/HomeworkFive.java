package com.bayviewglen.daytwo;

public class HomeworkFive {

	public static void main(String[] args) {
		double valueOfPenny = 0.01, valueOfNickel = 0.05, valueOfDime = 0.1, valueOfQuarter = 0.25, valueOfLoonie = 1, valueOfToonie = 2, totalMoney; 
		int numberOfPennies, numberOfNickels, numberOfDimes, numberOfQuarters, numberOfLoonies, numberOfToonies; 
		
		numberOfPennies = 7; 
		numberOfNickels = 9;
		numberOfDimes = 16; 
		numberOfQuarters = 8; 
		numberOfLoonies = 20; 
		numberOfToonies = 15; 
		
		totalMoney = (numberOfPennies * valueOfPenny) + (numberOfNickels * valueOfNickel) + (numberOfDimes * valueOfDime) + (numberOfQuarters * valueOfQuarter) + (numberOfLoonies * valueOfLoonie) + (numberOfToonies * valueOfToonie); 
		System.out.println("You have a total of $" + totalMoney + ".");
	}

}
