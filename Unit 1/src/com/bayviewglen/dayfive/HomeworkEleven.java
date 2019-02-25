package com.bayviewglen.dayfive;

import java.util.Scanner; 

public class HomeworkEleven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter the mass of the object in kg: ");
		
		double mass = input.nextDouble(); 
		
		System.out.println("Please enter the speed of your object in m/s: ");
		
		double velocity = input.nextDouble(); 
		
		double kineticEnergy = 0.5 * mass * Math.pow(velocity, 2); 
		
		System.out.println("There are/is " + kineticEnergy + " joules of kinetic energy in the object. ");

	}

}
