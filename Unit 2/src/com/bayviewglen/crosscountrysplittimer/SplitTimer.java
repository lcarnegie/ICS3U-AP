package com.bayviewglen.crosscountrysplittimer;

import java.util.Scanner;

public class SplitTimer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Bayview Glen Cross-Country Team Split Time Summary\n***********************************************************");

		// -----------------------------Runner #1
		// ----------------------------------------\\
		System.out.println("\nPlease enter the first and last name of the first runner: ");
		String r1FullName = input.nextLine();

		String r1FirstName = r1FullName.substring(0, r1FullName.indexOf(" "));

		String r1LastName = r1FullName.substring(r1FullName.indexOf(" ") + 1);

		// -----------------------------Runner 1 Split #1
		// ----------------------------------\\
		System.out.println(
				"Please enter the time at the first mile for " + r1FullName + " in minutes:seconds.milliseconds: ");
		String r1Mile1 = input.nextLine();

		int r1Mile1Minutes;
		double r1Mile1Seconds;

		// Extracts int values for minutes and seconds
		int colon = r1Mile1.indexOf(":");
		r1Mile1Minutes = Integer.parseInt(r1Mile1.substring(0, colon));
		r1Mile1Seconds = Double.parseDouble(r1Mile1.substring(colon + 1));

		// Total Seconds for Mile1, no split1 since split1 = mile1
		double r1Mile1TotalSeconds = (r1Mile1Minutes * 60) + r1Mile1Seconds;

		// Mile 1 in Minutes and Seconds
		int r1Split1Minutes = (int) r1Mile1TotalSeconds / 60;
		double r1Split1Seconds = r1Mile1TotalSeconds - (r1Split1Minutes * 60);

		// ----------------------------Runner 1 Split #2
		// ------------------------------------\\
		System.out.println(
				"Please enter the time at the second mile for " + r1FullName + " in minutes:seconds.milliseconds: ");
		String r1Mile2 = input.nextLine();

		int r1Mile2Minutes;
		double r1Mile2Seconds;

		// Extracts int values for minutes and seconds
		colon = r1Mile2.indexOf(":");
		r1Mile2Minutes = Integer.parseInt(r1Mile2.substring(0, colon));
		r1Mile2Seconds = Double.parseDouble(r1Mile2.substring(colon + 1));

		// Total Seconds for Mile 2
		double r1Mile2TotalSeconds = (r1Mile2Minutes * 60) + r1Mile2Seconds;

		double r1Split2TotalSeconds = r1Mile2TotalSeconds - r1Mile1TotalSeconds;

		// Mile 2 in Minutes and Seconds
		int r1Split2Minutes = (int) r1Split2TotalSeconds / 60;
		double r1Split2Seconds = r1Split2TotalSeconds - (r1Split2Minutes * 60);

		// ----------------------------Runner 1 Split #3
		// -------------------------------------\\
		System.out.println(
				"Please enter the time for the entire 5K for " + r1FullName + " in minutes:second.milliseconds: ");
		String r1FiveK = input.nextLine();

		int r1FiveKminutes;
		double r1FiveKseconds;

		// Extracts minute and seconds values for the entire race
		colon = r1FiveK.indexOf(":");
		r1FiveKminutes = Integer.parseInt(r1FiveK.substring(0, colon));
		r1FiveKseconds = Double.parseDouble(r1FiveK.substring(colon + 1));

		// 5K total seconds
		double r1FiveKtotalSeconds = (r1FiveKminutes * 60) + r1FiveKseconds;

		double r1Split3TotalSeconds = r1FiveKtotalSeconds - r1Mile2TotalSeconds;

		int r1Split3Minutes = (int) r1Split3TotalSeconds / 60;
		double r1Split3Seconds = r1Split3TotalSeconds - (r1Split3Minutes * 60);

		// -----------------------------Runner 1 Summary Table
		// -----------------------------------------\\
		System.out.println("\nSplit Summary for " + r1FullName + " \n************************************");
		System.out.printf(
				"Split #1: %2d:%06.3f\nSplit #2: %2d:%06.3f\nSplit #3: %2d:%06.3f\nTime to Complete 5K: %2d:%06.3f\n************************************\n",
				r1Split1Minutes, r1Split1Seconds, r1Split2Minutes, r1Split2Seconds, r1Split3Minutes, r1Split3Seconds,
				r1FiveKminutes, r1FiveKseconds);

		// -----------------------------Runner #2
		// ----------------------------------------\\
		System.out.println("\nPlease enter the first and last name of the next runner: ");
		String r2FullName = input.nextLine();

		String r2FirstName = r2FullName.substring(0, r2FullName.indexOf(" "));

		String r2LastName = r2FullName.substring(r2FullName.indexOf(" ") + 1);

		// -----------------------------Runner 2 Split #1
		// ----------------------------------\\
		System.out.println(
				"Please enter the time at the first mile for " + r2FullName + " in minutes:seconds.milliseconds: ");
		String r2Mile1 = input.nextLine();

		int r2Mile1Minutes;
		double r2Mile1Seconds;

		// Extracts minute and second values for Mile 1
		colon = r2Mile1.indexOf(":");
		r2Mile1Minutes = Integer.parseInt(r2Mile1.substring(0, colon));
		r2Mile1Seconds = Double.parseDouble(r2Mile1.substring(colon + 1));

		// No Split1 because Mile1 = Split1
		double r2Mile1TotalSeconds = (r2Mile1Minutes * 60) + r2Mile1Seconds;

		// Split 1 Minutes and Seconds
		int r2Split1Minutes = (int) r2Mile1TotalSeconds / 60;
		double r2Split1Seconds = r2Mile1TotalSeconds - (r2Split1Minutes * 60);

		// ----------------------------Runner 2 Split #2
		// ------------------------------------\\
		System.out.println(
				"Please enter the time at the second mile for " + r2FullName + " in minutes:seconds.milliseconds: ");
		String r2Mile2 = input.nextLine();

		int r2Mile2Minutes;
		double r2Mile2Seconds;

		// Extracts minute and second values for Mile 2
		colon = r2Mile2.indexOf(":");
		r2Mile2Minutes = Integer.parseInt(r2Mile2.substring(0, colon));
		r2Mile2Seconds = Double.parseDouble(r2Mile2.substring(colon + 1));

		// Mile 2 Total Seconds
		double r2Mile2TotalSeconds = (r2Mile2Minutes * 60) + r2Mile2Seconds;

		double r2Split2TotalSeconds = r2Mile2TotalSeconds - r2Mile1TotalSeconds;

		// Split 2 minutes and seconds
		int r2Split2Minutes = (int) r2Split2TotalSeconds / 60;
		double r2Split2Seconds = r2Split2TotalSeconds - (r2Split2Minutes * 60);

		// ----------------------------Runner 2 Split #3
		// -------------------------------------\\
		System.out.println(
				"Please enter the time for the entire 5K for " + r2FullName + " in minutes:second.milliseconds: ");
		String r2FiveK = input.nextLine();

		int r2FiveKminutes;
		double r2FiveKseconds;

		// Extracts minute and second values for 5K
		colon = r2FiveK.indexOf(":");
		r2FiveKminutes = Integer.parseInt(r2FiveK.substring(0, colon));
		r2FiveKseconds = Double.parseDouble(r2FiveK.substring(colon + 1));

		// 5K Total seconds
		double r2FiveKtotalSeconds = (r2FiveKminutes * 60) + r2FiveKseconds;

		double r2Split3TotalSeconds = r2FiveKtotalSeconds - r2Mile2TotalSeconds;

		// Split 3 Minutes and Seconds
		int r2Split3Minutes = (int) r2Split3TotalSeconds / 60;
		double r2Split3Seconds = r2Split3TotalSeconds - (r2Split3Minutes * 60);

		// -----------------------------Runner 2 Summary Table
		// -----------------------------------------\\
		System.out.println("\nSplit Summary for " + r2FullName + " \n************************************");
		System.out.printf(
				"Split #1: %2d:%06.3f\nSplit #2: %2d:%06.3f\nSplit #3: %2d:%06.3f\nTime to Complete 5K: %2d:%06.3f\n************************************\n",
				r2Split1Minutes, r2Split1Seconds, r2Split2Minutes, r2Split2Seconds, r2Split3Minutes, r2Split3Seconds,
				r2FiveKminutes, r2FiveKseconds);

		// -----------------------------Runner #3
		// ----------------------------------------\\
		System.out.println("\nPlease enter the first and last name of the next runner: ");
		String r3FullName = input.nextLine();

		String r3FirstName = r3FullName.substring(0, r3FullName.indexOf(" "));

		String r3LastName = r3FullName.substring(r3FullName.indexOf(" ") + 1);

		// -----------------------------Runner 3 Split #1
		// ----------------------------------\\
		System.out.println(
				"Please enter the time at the first mile for " + r3FullName + " in minutes:seconds.milliseconds: ");
		String r3Mile1 = input.nextLine();

		int r3Mile1Minutes;
		double r3Mile1Seconds;

		// Extracts minute and second values for Mile 1
		colon = r3Mile1.indexOf(":");
		r3Mile1Minutes = Integer.parseInt(r3Mile1.substring(0, colon));
		r3Mile1Seconds = Double.parseDouble(r3Mile1.substring(colon + 1));

		// No Split1 because Mile1 = Split1
		double r3Mile1TotalSeconds = (r3Mile1Minutes * 60) + r3Mile1Seconds;

		int r3Split1Minutes = (int) r3Mile1TotalSeconds / 60;
		double r3Split1Seconds = r3Mile1TotalSeconds - (r3Split1Minutes * 60);

		// ----------------------------Runner 3 Split #2
		// ------------------------------------\\
		System.out.println(
				"Please enter the time at the second mile for " + r3FullName + " in minutes:seconds.milliseconds: ");
		String r3Mile2 = input.nextLine();

		int r3Mile2Minutes;
		double r3Mile2Seconds;

		// Extracts minute and second values for Mile 2
		colon = r3Mile2.indexOf(":");
		r3Mile2Minutes = Integer.parseInt(r3Mile2.substring(0, colon));
		r3Mile2Seconds = Double.parseDouble(r3Mile2.substring(colon + 1));

		// Mile 2 Total Seconds
		double r3Mile2TotalSeconds = (r3Mile2Minutes * 60) + r3Mile2Seconds;

		double r3Split2TotalSeconds = r3Mile2TotalSeconds - r3Mile1TotalSeconds;

		// Split 2 in Minutes and Seconds
		int r3Split2Minutes = (int) r3Split2TotalSeconds / 60;
		double r3Split2Seconds = r3Split2TotalSeconds - (r3Split2Minutes * 60);

		// ----------------------------Runner 3 Split #3
		// -------------------------------------\\
		System.out.println(
				"Please enter the time for the entire 5K for " + r3FullName + " in minutes:second.milliseconds: ");
		String r3FiveK = input.nextLine();

		int r3FiveKminutes;
		double r3FiveKseconds;

		// Extracts minute and second values for entire race
		colon = r3FiveK.indexOf(":");
		r3FiveKminutes = Integer.parseInt(r3FiveK.substring(0, colon));
		r3FiveKseconds = Double.parseDouble(r3FiveK.substring(colon + 1));

		// Total seconds for entire 5K
		double r3FiveKtotalSeconds = (r3FiveKminutes * 60) + r3FiveKseconds;

		double r3Split3TotalSeconds = r3FiveKtotalSeconds - r3Mile2TotalSeconds;

		// 5K in Minutes and Seconds
		int r3Split3Minutes = (int) r3Split3TotalSeconds / 60;
		double r3Split3Seconds = r3Split3TotalSeconds - (r3Split3Minutes * 60);

		// -----------------------------Runner 3 Summary Table
		// -----------------------------------------\\
		System.out.println("\nSplit Summary for " + r3FullName + " \n************************************");
		System.out.printf(
				"Split #1: %2d:%06.3f\nSplit #2: %2d:%06.3f\nSplit #3: %2d:%06.3f\nTime to Complete 5K: %2d:%06.3f\n************************************\n",
				r3Split1Minutes, r3Split1Seconds, r3Split2Minutes, r3Split2Seconds, r3Split3Minutes, r3Split3Seconds,
				r3FiveKminutes, r3FiveKseconds);

		// -----------------------------Runner #4
		// ----------------------------------------\\
		System.out.println("\nPlease enter the first and last name of the next runner: ");
		String r4FullName = input.nextLine();

		String r4FirstName = r4FullName.substring(0, r4FullName.indexOf(" "));

		String r4LastName = r4FullName.substring(r4FullName.indexOf(" ") + 1);

		// -----------------------------Runner 4 Split #1
		// ----------------------------------\\
		System.out.println(
				"Please enter the time at the first mile for " + r4FullName + " in minutes:seconds.milliseconds: ");
		String r4Mile1 = input.nextLine();

		int r4Mile1Minutes;
		double r4Mile1Seconds;

		// Extracts minute and second values for Mile 1
		colon = r4Mile1.indexOf(":");
		r4Mile1Minutes = Integer.parseInt(r4Mile1.substring(0, colon));
		r4Mile1Seconds = Double.parseDouble(r4Mile1.substring(colon + 1));

		// No Split1 since Mile1 = Split1
		double r4Mile1TotalSeconds = (r4Mile1Minutes * 60) + r4Mile1Seconds;

		// Mile 1 in Minutes and Seconds
		int r4Split1Minutes = (int) r4Mile1TotalSeconds / 60;
		double r4Split1Seconds = r4Mile1TotalSeconds - (r4Split1Minutes * 60);

		// ----------------------------Runner 4 Split #2
		// ------------------------------------\\
		System.out.println(
				"Please enter the time at the second mile for " + r4FullName + " in minutes:seconds.milliseconds: ");
		String r4Mile2 = input.nextLine();

		int r4Mile2Minutes;
		double r4Mile2Seconds;

		// Extracts minute and second values for Mile 2
		colon = r4Mile2.indexOf(":");
		r4Mile2Minutes = Integer.parseInt(r4Mile2.substring(0, colon));
		r4Mile2Seconds = Double.parseDouble(r4Mile2.substring(colon + 1));

		// Mile 2 Total Seconds
		double r4Mile2TotalSeconds = (r4Mile2Minutes * 60) + r4Mile2Seconds;

		double r4Split2TotalSeconds = r4Mile2TotalSeconds - r4Mile1TotalSeconds;

		// Split 2 in Minutes and Seconds
		int r4Split2Minutes = (int) r4Split2TotalSeconds / 60;
		double r4Split2Seconds = r4Split2TotalSeconds - (r4Split2Minutes * 60);

		// ----------------------------Runner 4 Split #3
		// -------------------------------------\\
		System.out.println(
				"Please enter the time for the entire 5K for " + r4FullName + " in minutes:second.milliseconds: ");
		String r4FiveK = input.nextLine();

		int r4FiveKminutes;
		double r4FiveKseconds;

		// Extracts values for minutes and seconds for entire race
		colon = r4FiveK.indexOf(":");
		r4FiveKminutes = Integer.parseInt(r4FiveK.substring(0, colon));
		r4FiveKseconds = Double.parseDouble(r4FiveK.substring(colon + 1));

		// Total seconds for entire race
		double r4FiveKtotalSeconds = (r4FiveKminutes * 60) + r4FiveKseconds;

		double r4Split3TotalSeconds = r4FiveKtotalSeconds - r4Mile2TotalSeconds;

		// Split 3 in Minutes and Seconds
		int r4Split3Minutes = (int) r4Split3TotalSeconds / 60;
		double r4Split3Seconds = r4Split3TotalSeconds - (r4Split3Minutes * 60);

		// -----------------------------Runner 4 Summary Table
		// -----------------------------------------\\
		System.out.println("\nSplit Summary for " + r4FullName + " \n************************************");
		System.out.printf(
				"Split #1: %2d:%06.3f\nSplit #2: %2d:%06.3f\nSplit #3: %2d:%06.3f\nTime to Complete 5K: %2d:%06.3f\n************************************\n",
				r4Split1Minutes, r4Split1Seconds, r4Split2Minutes, r4Split2Seconds, r4Split3Minutes, r4Split3Seconds,
				r4FiveKminutes, r4FiveKseconds);

		// -----------------------------Runner #5
		// ----------------------------------------\\
		System.out.println("\nPlease enter the first and last name of the last runner: ");
		String r5FullName = input.nextLine();

		String r5FirstName = r5FullName.substring(0, r5FullName.indexOf(" "));

		String r5LastName = r5FullName.substring(r5FullName.indexOf(" ") + 1);

		// -----------------------------Runner 5 Split #1
		// ----------------------------------\\
		System.out.println(
				"Please enter the time at the first mile for " + r5FullName + " in minutes:seconds.milliseconds: ");
		String r5Mile1 = input.nextLine();

		int r5Mile1Minutes;
		double r5Mile1Seconds;

		// Extracts minute and second values for Mile 1
		colon = r5Mile1.indexOf(":");
		r5Mile1Minutes = Integer.parseInt(r5Mile1.substring(0, colon));
		r5Mile1Seconds = Double.parseDouble(r5Mile1.substring(colon + 1));

		// No Split1 since Mile1 = Split1
		double r5Mile1TotalSeconds = (r5Mile1Minutes * 60) + r5Mile1Seconds;

		// Mile 1 in Minutes and seconds
		int r5Split1Minutes = (int) r5Mile1TotalSeconds / 60;
		double r5Split1Seconds = r5Mile1TotalSeconds - (r5Split1Minutes * 60);

		// ----------------------------Runner 5 Split #2
		// ------------------------------------\\
		System.out.println(
				"Please enter the time at the second mile for " + r5FullName + " in minutes:seconds.milliseconds: ");
		String r5Mile2 = input.nextLine();

		int r5Mile2Minutes;
		double r5Mile2Seconds;

		// Extracts minute and second values for Mile 2
		colon = r5Mile2.indexOf(":");
		r5Mile2Minutes = Integer.parseInt(r5Mile2.substring(0, colon));
		r5Mile2Seconds = Double.parseDouble(r5Mile2.substring(colon + 1));

		// Mile 2 Total seconds
		double r5Mile2TotalSeconds = (r5Mile2Minutes * 60) + r5Mile2Seconds;

		double r5Split2TotalSeconds = r5Mile2TotalSeconds - r5Mile1TotalSeconds;// Total Seconds for Split #2

		// Split 2 minutes and seconds
		int r5Split2Minutes = (int) r5Split2TotalSeconds / 60;
		double r5Split2Seconds = r5Split2TotalSeconds - (r5Split2Minutes * 60);

		// ----------------------------Runner 5 Split #3
		// -------------------------------------\\
		System.out.println(
				"Please enter the time for the entire 5K for " + r5FullName + " in minutes:second.milliseconds: ");
		String r5FiveK = input.nextLine();

		int r5FiveKminutes;
		double r5FiveKseconds;

		// Extracts minute and second values for entire 5K race
		colon = r5FiveK.indexOf(":");
		r5FiveKminutes = Integer.parseInt(r5FiveK.substring(0, colon));
		r5FiveKseconds = Double.parseDouble(r5FiveK.substring(colon + 1));

		// 5K total seconds
		double r5FiveKtotalSeconds = (r5FiveKminutes * 60) + r5FiveKseconds;

		double r5Split3TotalSeconds = r5FiveKtotalSeconds - r5Mile2TotalSeconds;

		// Entire 5K in minutes and seconds
		int r5Split3Minutes = (int) r5Split3TotalSeconds / 60;
		double r5Split3Seconds = r5Split3TotalSeconds - (r5Split3Minutes * 60);

		// -----------------------------Runner 5 Summary Table
		// -----------------------------------------\\
		System.out.println("\nSplit Summary for " + r5FullName + " \n************************************");
		System.out.printf(
				"Split #1: %2d:%06.3f\nSplit #2: %2d:%06.3f\nSplit #3: %2d:%06.3f\nTime to Complete 5K: %2d:%06.3f\n************************************\n",
				r5Split1Minutes, r5Split1Seconds, r5Split2Minutes, r5Split2Seconds, r5Split3Minutes, r5Split3Seconds,
				r5FiveKminutes, r5FiveKseconds);

		// ----------------------------Creates table--------------------------------\\
		System.out.println(
				"\n\nSplit Time Summary for Cross Country Team\n********************************************\n");
		System.out.printf("%-30s%-25s%-25s%-25s%-35s\n%-30s%-25s%-25s%-25s%-1s", "Runner Name", "Split #1", "Split #2",
				"Split #3", "Time to complete 5K", "-----------", "--------", "--------", "--------",
				"-------------------");
		System.out.printf("\n%-30s%2d:%06.3f%18d:%06.3f%18d:%06.3f%22d:%06.3f", r1LastName + ", " + r1FirstName,
				r1Split1Minutes, r1Split1Seconds, r1Split2Minutes, r1Split2Seconds, r1Split3Minutes, r1Split3Seconds,
				r1FiveKminutes, r1FiveKseconds);
		System.out.printf("\n%-30s%2d:%06.3f%18d:%06.3f%18d:%06.3f%22d:%06.3f", r2LastName + ", " + r2FirstName,
				r2Split1Minutes, r2Split1Seconds, r2Split2Minutes, r2Split2Seconds, r2Split3Minutes, r2Split3Seconds,
				r2FiveKminutes, r2FiveKseconds);
		System.out.printf("\n%-30s%2d:%06.3f%18d:%06.3f%18d:%06.3f%22d:%06.3f", r3LastName + ", " + r3FirstName,
				r3Split1Minutes, r3Split1Seconds, r3Split2Minutes, r3Split2Seconds, r3Split3Minutes, r3Split3Seconds,
				r3FiveKminutes, r3FiveKseconds);
		System.out.printf("\n%-30s%2d:%06.3f%18d:%06.3f%18d:%06.3f%22d:%06.3f", r4LastName + ", " + r4FirstName,
				r4Split1Minutes, r4Split1Seconds, r4Split2Minutes, r4Split2Seconds, r4Split3Minutes, r4Split3Seconds,
				r4FiveKminutes, r4FiveKseconds);
		System.out.printf("\n%-30s%2d:%06.3f%18d:%06.3f%18d:%06.3f%22d:%06.3f", r5LastName + ", " + r5FirstName,
				r5Split1Minutes, r5Split1Seconds, r5Split2Minutes, r5Split2Seconds, r5Split3Minutes, r5Split3Seconds,
				r5FiveKminutes, r5FiveKseconds);

		System.out.println("\n\n\nPress any key to close the program");// Prevents console from closing before the user
																		// wants to
		String close = input.nextLine();
	}
}
