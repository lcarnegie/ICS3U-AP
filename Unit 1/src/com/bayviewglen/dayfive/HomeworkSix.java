package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the mass of your object in kilograms?: ");
		double mass = input.nextInt();
		
		System.out.print("What is the velocity of your object in metres per second?: ");
		double velocity = input.nextInt();
		
		double momentum = mass * velocity; 
		
		System.out.println("The momentum of your object is: " + momentum); 

	}

}
