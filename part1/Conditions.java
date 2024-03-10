package part1;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner sc = new Scanner(System.in);

        // if-else condition

        // Check if number if ODD or EVEN
        System.out.print("Enter number to check its EVEN or ODD: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Given number is EVEN");
        } else {
            System.out.println("Given number is ODD");
        }

        // switch case
        System.out.print("Enter Day (Between 1 and 7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong Choice !!");
        }

        // Close the Scanner
        sc.close();
    }
}
