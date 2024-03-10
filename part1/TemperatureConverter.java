package part1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose converion");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        int c = 0, f = 0;
        switch (choice) {
            case 1:
                System.out.print("Celsius: ");
                c = sc.nextInt();
                f = (c * 9 / 5) + 32;
                System.out.println("Fahrenheit: " + f);
                break;
            case 2:
                System.out.print("Fahrenheit: ");
                f = sc.nextInt();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius: " + c);
                break;
            default:
                System.out.println("Wrong Choice !!");
                break;
        }
        sc.close();
    }
}
