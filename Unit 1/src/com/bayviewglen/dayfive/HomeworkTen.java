package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of your rectangle: ");
		double length = input.nextDouble();
		System.out.println("Please enter the width of your rectangle: ");
		double width = input.nextDouble();

		double area = length * width;

		double perimeter = (2 * length) + (2 * width);

		System.out.println("Given your lengths and widths, the area of your rectangle is about " + area
				+ " square metres, and your perimeter is " + perimeter + ".");

	}

}
