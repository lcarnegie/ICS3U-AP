package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkSeven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your degrees in Fahrenheit: ");
		double fahrenheit = input.nextDouble();

		double celsius = (fahrenheit - 32) / 1.8;

		System.out.print(
				fahrenheit + " degrees fahrenheit is about " + (Math.round(celsius * 10) * 0.1) + " degrees celsius.");

	}

}
