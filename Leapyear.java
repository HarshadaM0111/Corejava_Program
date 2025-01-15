package Package_Java;

/* 1.Write a program to check leap year using if else. How to check whether a given year is a leap year or not */

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year: "); // input for the Enter the year
		int year = scanner.nextInt();

		// Check if the year is a leap year
		if (isLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

		// Close the scanner
		scanner.close();
	}

	// Method to check if the year is a leap year
	public static boolean isLeapYear(int year) {
		// A year is a leap year if it is divisible by 4, but not divisible by 100,
		// unless it is also divisible by 400.
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;  // Divisible by 400
				} else {
					return false; // Divisible by 100 but not 400
				}
			} else {
				return true;  // Divisible by 4 but not 100
			}
		} else {
			return false;  // Not divisible by 4
		}
	}
}

//OUTPUT
/*
 * Enter a year: 2024
   2024 is a leap year.
   
   Enter a year: 2019
   2019 is not a leap year.

 */
