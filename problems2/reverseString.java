package problems2;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String reverse = "";

        for (int i = 0; i < string.length(); i++) {
            reverse = string.charAt(i) + reverse;
        }

        System.out.println("Original String: " + string);
        System.out.println("Reverse String: " + reverse);
        sc.close();
    }
}
