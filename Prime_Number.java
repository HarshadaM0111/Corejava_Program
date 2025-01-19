package Package_Java;

/* Write a java program to check given number is prime number or not  */

import java.util.Scanner;
public class Prime_Number {

	public static boolean isPrime(int num) { 
		if (num == 1) {     
			return false;
		}

		for (int i = 2; i <=  Math.sqrt(num); i++) {
			// If num is divisible by any number, it is not prime
			if (num % i == 0) {
				return false;
			}
		}
		// If no divisors are found, the number is prime
		return true;
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //  take input from the user

		System.out.print("Enter a number: "); // User Enter a number
		int number = scanner.nextInt();

		// Check if the number is prime OR not
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}    

}


// OUTPUT

/*
 * Enter a number: 2
   2 is a prime number.

 * Enter a number: 4
   4 is not a prime number.   
 */


