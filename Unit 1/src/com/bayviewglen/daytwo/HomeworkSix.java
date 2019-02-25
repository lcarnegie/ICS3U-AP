package com.bayviewglen.daytwo;

public class HomeworkSix {

	public static void main(String[] args) {
		double a, b, c, xOne, xTwo;

		a = 2;
		b = 4;
		c = -6;

		/*
		 * double z = Double.NaN;
		 */

		// Root 1
		xOne = (-1 * b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a;
		// Root 2
		xTwo = (-1 * b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a;
		System.out.println("Given the quadratic equation f(x) = " + (int) a + "x^2 + " + (int) b + "x + " + (int) c
				+ ", \nthe resulting parabola's roots would be (" + xOne + ", 0) and (" + xTwo + ", 0).");

		/*
		 * if(xOne == z && xTwo == z) {
		 * System.out.print("Given the quadratic equation f(x) = " + a + "x^2 + " + b +
		 * "x + " + c + ", \n the resulting parabola does not have any roots"); }
		 */
	}

}
