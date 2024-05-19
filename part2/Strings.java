package part2;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next() will take only first word as input and ignore other words
        String firstName = sc.next();
        String fullName = sc.nextLine();

        System.out.println("First Name: " + firstName);
        System.out.println("Full Name: " + fullName);
        sc.close();
    }
}
