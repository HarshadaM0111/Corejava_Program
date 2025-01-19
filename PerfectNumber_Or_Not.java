package Package_Java;

/* Write a java program to check given number is perfect number or not */

import java.util.Scanner;
public class PerfectNumber_Or_Not {

	public static boolean isPerfectNumber(int num) {
		if (num == 1) {
			return false; //  1 are not perfect numbers
		}

		int sum = 1;  

		// Check divisors up to the square root of num
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				sum += i;
				if (i != num / i) {
					sum += num / i;
				}
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //  take input from the user

		System.out.print("Enter a number: "); // User Enter the number 
		int number = scanner.nextInt();

		// Check if the number is perfect Or Not-Perfect and print the result
		if (isPerfectNumber(number)) {
			System.out.println(number + " is a perfect number.");
		} else {
			System.out.println(number + " is not a perfect number.");
		}

	}

}

//OUTPUT

/*
 * Enter a number: 6
   6 is a perfect number.

 * Enter a number: 3
   3 is not a perfect number.
 */


