package com.bayviewglen.dayfive;

import java.util.Scanner; 

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the price of the thing you purchased, in dollars: ");
		double purchase = input.nextDouble(); 
		
		System.out.println("Please enter your local sales tax, in percent"); 
		double tax = input.nextDouble();
		
		tax *= 0.01;
		
		double priceWithTax = purchase + (purchase * tax); 
		
		System.out.println("Given your purchase with sales tax, your purchase should cost " + priceWithTax + ".");
		
	}

}
