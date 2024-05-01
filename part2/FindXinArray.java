package part2;

import java.util.Scanner;

public class FindXinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean xFound = false;
        for (int i = 0; i < size; i++) {
            if (x == numbers[i]) {
                System.out.println("X is found at index " + i);
                xFound = true;
                break;
            }
        }
        if (!xFound) {
            System.out.println("X not found");
        }
        sc.close();
    }
}
