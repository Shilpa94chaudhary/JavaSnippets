package part2;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // Initialize an array
        int[] numbers1 = new int[3];
        numbers1[0] = 3;
        numbers1[1] = 5;
        numbers1[2] = 8;
        System.out.println(numbers1[0]);
        System.out.println(numbers1[1]);
        System.out.println(numbers1[2]);
        int[] numbers2 = { 1, 2, 3 };
        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);

        // Take input from user and print using for loop
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] num = { 8, 9, 5, 5, 5, 6, 5, 4, 2, 8 };
        int sum = 0;
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            sum += num[i];
        }
        System.out.println("\nSum = " + sum);
        sc.close();
    }
}
