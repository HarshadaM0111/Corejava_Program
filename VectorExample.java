package Package_Java;

//1. Write a program using Vector to store the list of students details and print the details.

import java.util.Vector;

class Studentexa {
    String name;
    int age;
    String course;

    // Constructor to initialize student details
    public Studentexa(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector to store student details
        Vector<Studentexa> studentList = new Vector<>();

        // Adding student details
        studentList.add(new Studentexa("Harshada", 21, "Computer Science"));
        studentList.add(new Studentexa("Abhi", 24, "Mechanical Engineering"));
        studentList.add(new Studentexa("Radha", 22, "Electrical Engineering"));

        // Displaying student details
        System.out.println("Student Details:");
        for (Studentexa s : studentList) {
            s.display();
        }
    }
}

/*
Output:
Student Details:
Name: Harshada, Age: 21, Course: Computer Science
Name: Abhi, Age: 24, Course: Mechanical Engineering
Name: Radha, Age: 22, Course: Electrical Engineering
*/