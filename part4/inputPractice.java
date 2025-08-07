package part4;

import java.util.Scanner;

public class inputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input integer
        System.out.println("Input your age ");
        int age = sc.nextInt();
        System.out.println("Age: " + age);

        // Input float
        System.out.println("Enter you marks ");
        float marks = sc.nextFloat();
        System.out.println("Marks: " + marks);

        // Input string
        System.out.println("Enter name: ");
        // If user enter multiple words, next() will take only first word as input
        // If user enters multiple words, the for next next() function it will not ask
        // to enter any input it will directly take second word as input
        String name = sc.next(); // Enter: Anam Kumar
        String lastname = sc.next(); // Will take Kumar as input, and will not ask to enter
        System.out.println("First Name: " + name); // Output: Aman
        System.out.println("Last Name: " + lastname); // Output: Kumar

        System.out.println("Enter School Name: ");
        String firstName = sc.next();
        System.out.println("School Name: " + firstName);
        System.out.println("Enter City Name: ");
        String lastName = sc.next();
        System.out.println("City Name: " + lastName);

        // It will consume leftovers otherwise line number 41 will not take any input
        // and return null or leftovers from previous next() input given by user
        sc.nextLine();

        System.out.println("Enter Full Address: ");
        String fullName = sc.nextLine(); // Input: Aman Kumar Singh
        System.out.println("Full Address: " + fullName); // Output: Aman Kumar Singh

        sc.close();

    }
}
