package Package_Java;

/*Write a java program for  Unboxing.(all types).*/

public class UnboxingExample {
	public static void main(String[] args) {
		// Create wrapper objects
		Integer intObj = 12;       // Integer to int
		Byte byteObj = 24;         // Byte to byte
		Short shortObj = 36;       // Short to short
		Long longObj = 21L;        // Long to long
		Float floatObj = 30.0f;    // Float to float
		Double doubleObj =10.0d;  // Double to double
		Character charObj ='H';   // Character to char
		Boolean boolObj = true;    // Boolean to boolean

		// Unboxing of wrapper objects
		int intVal = intObj;
		byte byteVal = byteObj;
		short shortVal = shortObj;
		long longVal = longObj;
		float floatVal = floatObj;
		double doubleVal = doubleObj;
		char charVal = charObj;
		boolean boolVal = boolObj;

		// Print the primitive values
		System.out.println("int value: " + intVal);
		System.out.println("byte value: " + byteVal);
		System.out.println("short value: " + shortVal);
		System.out.println("long value: " + longVal);
		System.out.println("float value: " + floatVal);
		System.out.println("double value: " + doubleVal);
		System.out.println("char value: " + charVal);
		System.out.println("boolean value: " + boolVal);
	}
}


//output:
/*
int value: 12
byte value: 24
short value: 36
long value: 21
float value: 30.0
double value: 10.0
char value: H
boolean value: true


 */

