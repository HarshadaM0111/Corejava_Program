package Package_Java;

//1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		try {
			// Try block containing code that may cause an exception
			
			int result = 20/0;
			System.out.println("Result: " +result);
			
		} catch (ArithmeticException e) {
			
			// Catch block that handles the exception
			
			System.out.println("Error: Cannot divide by zero!");
			
			e.printStackTrace(); // Prints the stack trace of the exception
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}

/* OUTPUT
 
Error: Cannot divide by zero!
java.lang.ArithmeticException: / by zero
	at Java_Assignment/Package_Java.ArithmeticExceptionExample.main(ArithmeticExceptionExample.java:10)
This is finally block

*/
