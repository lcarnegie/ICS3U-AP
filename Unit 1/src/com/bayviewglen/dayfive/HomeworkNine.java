package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many items did you sell? : ");
		int itemsSold = input.nextInt();

		double pay = itemsSold * 0.27;

		System.out.println("You will receive $" + (Math.round(pay * 100) * 0.01) + ".");

	}

}
