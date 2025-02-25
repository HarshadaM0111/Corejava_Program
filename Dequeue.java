package Package_Java;

import java.util.ArrayDeque;

//2.Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.

public class Dequeue {

	public static void main(String[] args) {
		// Creating an ArrayDeque to store book names
		ArrayDeque<String> books = new ArrayDeque<>();

		// Adding book names to the deque
		books.add("Raja Shivchatrapati");
		books.add("Chhava");
		books.add("Swarajya");
		books.add("The Diary of a Young Girl");
		books.add("The Lord of the Rings");

		// Printing the deque after adding books
		System.out.println("Books in the deque: " + books);

		// Adding a book to the front (left) of the deque
		books.offerFirst("Brave New World ");

		// Adding a book to the back (right) of the deque
		books.offerLast("War and Peace");

		// Printing the deque after adding books to both ends
		System.out.println("Books after adding to both ends: " + books);

		// Removing a book from the front (left) of the deque
		String removedBookFront = books.pollFirst();
		System.out.println("Removed from front: " + removedBookFront);

		// Removing a book from the back (right) of the deque
		String removedBookBack = books.pollLast();
		System.out.println("Removed from back: " + removedBookBack);

		// Printing the final state of the deque
		System.out.println("Books after removal: " + books);
	}
}

//OUTPUT
/*
	Books in the deque: [Raja Shivchatrapati, Chhava, Swarajya, The Diary of a Young Girl, The Lord of the Rings]
	Books after adding to both ends: [Brave New World , Raja Shivchatrapati, Chhava, Swarajya, The Diary of a Young Girl, 
	   The Lord of the Rings, War and Peace]
	Removed from front: Brave New World 
	Removed from back: War and Peace
	Books after removal: [Raja Shivchatrapati, Chhava, Swarajya, The Diary of a Young Girl, The Lord of the Rings]
 */


