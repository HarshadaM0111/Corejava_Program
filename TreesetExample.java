package Package_Java;

import java.util.TreeSet;

//3.Write a program using TreeSet insert Integer values and print them.

public class TreesetExample {


	public static void main(String[] args) {
		// Creating a TreeSet to store Integer values
		TreeSet<Integer> numbers = new TreeSet<>();

		// Adding integer values to the TreeSet
		numbers.add(21);
		numbers.add(34);
		numbers.add(67);
		numbers.add(30);
		numbers.add(49);
		numbers.add(49); // Duplicate value, TreeSet won't add it
		numbers.add(89); 

		// Printing the values in the TreeSet
		System.out.println("TreeSet of Integer values: " + numbers);
	}
}


/* output
 TreeSet of Integer values: [21, 30, 34, 49, 67, 89]
 */


