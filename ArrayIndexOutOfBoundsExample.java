package Package_Java;

//3.Write a program using exception handling to handle array index out of bounds.

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Define an array of size 3
        int[] numbers = {10, 20, 30};
        
        try {
            // Attempt to access an invalid index (index 5, which is out of bounds)
            System.out.println("Element at index 5: " + numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("Error: Array index out of bounds!");
            e.printStackTrace();  // Prints the exception details
        }
        
        // A statement after exception handling to show the program continues
        System.out.println("Program continues after exception handling.");
    }
}

/*
  OUTPUT
  Error: Array index out of bounds!
  java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	  at Java_Assignment/Package_Java.ArrayIndexOutOfBoundsExample.main(ArrayIndexOutOfBoundsExample.java:12)
  Program continues after exception handling.
  */
