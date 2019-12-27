package com.test;

import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		String inputString = scan.nextLine();
		double inputdouble = scan.nextDouble();
		int inputint = scan.nextInt();


		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		String stringsum = s.concat(inputString);
		int intsum = i + inputint;
		double doublesum = d + inputdouble;

		/* Print the sum of the double variables on a new line. */
		System.out.println(intsum);
		System.out.println(doublesum);
		System.out.println(stringsum);

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

		scan.close();
	}
}
