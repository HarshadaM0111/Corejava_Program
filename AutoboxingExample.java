package Package_Java;

/*Write  a java program for Autoboxing.(All Primitive Types)*/

public class AutoboxingExample {


	public static void main(String[] args) {
		// Autoboxing of primitive types
		
		Integer intObj = 12;       // int to Integer
		Byte byteObj = 24;         // byte to Byte
		Short shortObj = 36;       // short to Short
		Long longObj = 21L;        // long to Long
		Float floatObj = 30.0f;    // float to Float
		Double doubleObj = 10.0d;  // double to Double
		Character charObj = 'H';   // char to Character
		Boolean boolObj = true;    // boolean to Boolean

		// Print the objects
		System.out.println("Integer object: " + intObj);
		System.out.println("Byte object: " + byteObj);
		System.out.println("Short object: " + shortObj);
		System.out.println("Long object: " + longObj);
		System.out.println("Float object: " + floatObj);
		System.out.println("Double object: " + doubleObj);
		System.out.println("Character object: " + charObj);
		System.out.println("Boolean object: " + boolObj);
	}
}

// Output:
/*
 * Integer object: 12
Byte object: 24
Short object: 36
Long object: 21
Float object: 30.0
Double object: 10.0
Character object: H
Boolean object: true
 */


