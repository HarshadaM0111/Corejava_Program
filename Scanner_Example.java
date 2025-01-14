package Package_Java;

/* 
 Write a Java program to take Employee id,name,address & salary from user and display on to screen.
 */

import java.util.Scanner;


public class Scanner_Example {

	private static Scanner scanner;

	public static void main(String[] args) {
		// Create a Scanner object to take input
		Scanner sc = new Scanner(System.in);

		// Declare variables to store employee details
		int EmpID;
		String EmpName ;
		String EmpAddress;
		double EmpSalary;

		//  User for input 
		System.out.println("Enter Employee ID :" ); // Enter Employee ID form User
		EmpID = sc.nextInt(); 
		sc.nextLine();		 

		System.out.println("Enter Employee Name : "); // Enter Employee Name form User
		EmpName = sc.nextLine();

		System.out.println("Enter Employee Address : "); // Enter Employee Address form User
		EmpAddress = sc.nextLine();		 

		System.out.println("Enter Employee Salary : "); // Enter Employee Salary form User
		EmpSalary = sc.nextDouble();

		// Display the entered details
		System.out.println("Employee Details ...");
		System.out.println("Employee ID : " + EmpID);
		System.out.println("Employee Name : " +EmpName);
		System.out.println("Employee Address : " +EmpAddress);
		System.out.println("Employee Salary : " +EmpSalary);

		//OUTPUT 

		/*
		 * Enter Employee ID :
			101
			Enter Employee Name : 
			Riya
			Enter Employee Address : 
			pune 4023 bhavani Street
			Enter Employee Salary : 
			50000


			Employee Details ...
			Employee ID : 101
			Employee Name : Riya
			Employee Address : Pune
			Employee Salary : 50000.0
		 */
	}

}
