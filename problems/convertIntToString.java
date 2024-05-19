package problems;

import java.util.Scanner;

public class convertIntToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s1 = "" + num;
        String s2 = String.valueOf(num);
        // Check if Int is converted into String
        if (num == Integer.parseInt(s1)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong Ans");
        }
        if (num == Integer.parseInt(s2)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong Ans");
        }
        sc.close();
    }
}
