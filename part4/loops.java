package part4;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for() loop
        // Take input from user and print from 0 to that number
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        // Print elements in array
        String[] fruits = { "Mango", "Banana", "Apple" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // while() loop
        int n = 1;

        while (n <= 5) {
            System.out.println(n);
            n++;
        }

        // do-while() loop
        int age = 10;
        do {
            System.out.println(age);
            age++;
        } while (age <= 5);

        // continue and break statement
        int i = 0;
        while (true) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println("i = " + i);
            if (i > 5) {
                break;
            }
            i++;
        }

        sc.close();
    }
}
