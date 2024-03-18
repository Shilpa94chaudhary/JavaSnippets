package part1;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // For Loop
        for (int i = 0; i < 11; i++) {
            System.out.println("i = " + i);
        }
        // For Loop for print table
        // Create a Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print table for ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        // while() Loop
        int count = 1;
        while (count < 11) {
            System.out.println(count);
            count++;
        }

        // do-while
        count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count < 11);

        int check = 12;
        while (check < 12) {
            System.out.println("Less than 12");
        }

        do {
            System.out.println("Less than 12");
        } while (check < 12);
        System.out.println("Enter number for which you want print sum from 1 ");
        int numb = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < numb; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to " + numb + " = " + sum);
        sc.close();
    }
}
