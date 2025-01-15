package Package_Java;

/* Write java program to check  candidate eligible for voting or not */

import java.util.Scanner;

public class Voting_Eligible {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your age: ");//Enter their age
		int age = scanner.nextInt();

		// Check if the age is 18 or greater
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}


	}
}

//OUTPUT
/*
 * Enter your age: 22
You are eligible to vote.

Enter your age: 15
You are not eligible to vote.
 */
