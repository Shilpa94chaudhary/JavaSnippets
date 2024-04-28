package part2;

import java.util.Scanner;

public class TimeComplexity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Time Complexity is n
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }

        // Time Complexity is n*n, O(n*m)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Hello");
            }
        }

        // Time Complexity is n*m, O(n*m)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Hello");
            }
        }

        // Time Complexity is n+m, O(n+m)
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
        for (int j = 0; j < m; j++) {
            System.out.println("Hello");
        }

        sc.close();
    }
}