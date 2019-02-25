package com.bayviewglen.dayfour;

import java.util.Scanner; 

public class HomeworkFour {

	public static void main(String[] args) {
		double velocityFinal, velocityInitial, acceleration, elapsedTime; 
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter your initial velocity, in metres per second: ");
		velocityInitial = input.nextInt(); 
		System.out.println("Please enter your acceleration, in metres per second^2: ");
		acceleration = input.nextInt();
		System.out.println("Please enter the elapsed time between your initial and final velocities, in seconds: ");
		elapsedTime = input.nextInt(); 
		
		velocityFinal = velocityInitial + acceleration * elapsedTime; 
		
		System.out.println("\nYour final velocity will be " + velocityFinal + " metres per second.");
		

	}

}
