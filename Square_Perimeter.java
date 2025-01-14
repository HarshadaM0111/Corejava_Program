package Package_Java;

/* write a program to find the perimeter of the square  */


import java.util.Scanner;
public class Square_Perimeter {

	public static void main(String[] args) {
		


		        // Create a Scanner object to take input
		        Scanner scanner = new Scanner(System.in);
		        
		        // Declare a variable for the side length of the square
		        double sideLength;

		        // the user to enter the length of the side
		        System.out.print("Enter the length of the side of the square: ");
		        sideLength = scanner.nextDouble();

		        // Calculate the perimeter of the square
		        double perimeter = 4 * sideLength;

		        // Display the result
		        System.out.println("The perimeter of the square is: " + perimeter);

		        
		       // OUTPUT
		        /*
		         * Enter the length of the side of the square: 4
				   The perimeter of the square is: 16.0
		         */
		        
	}

}
