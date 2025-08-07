package practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter the number of times you want to print your name");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }

        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println(x * y);

        sc.close();

        double d = 5.6;
        System.out.println(d);
    }
}
