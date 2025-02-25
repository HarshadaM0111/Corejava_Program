package Package_Java;

//2.Write a program demonstrating multiple catch statements and finally block.

public class MultipleCatchExample {
	public static void main(String[] args) {
		try {
			// Code that may cause different exceptions
			String str = null;
			System.out.println(str.length());  // This will cause NullPointerException

			int[] numbers = new int[2];
			numbers[5] = 20;  // This will cause ArrayIndexOutOfBoundsException

			int result = 20 / 0;  // This will cause ArithmeticException
		} 
		catch (NullPointerException e) {
			// Catch block for NullPointerException
			System.out.println("Error: Null pointer exception occurred.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// Catch block for ArrayIndexOutOfBoundsException
			System.out.println("Error: Array index out of bounds.");
		}
		catch (ArithmeticException e) {
			// Catch block for ArithmeticException
			System.out.println("Error: Arithmetic exception occurred.");
		}
		finally {
			// Finally block that always executes, regardless of exceptions
			System.out.println("This is Finally block. Finally block executed.");
		}
	}
}

/*
 OUTPUT
 
 Error: Null pointer exception occurred.
 This is Finally block. Finally block executed.
 */

