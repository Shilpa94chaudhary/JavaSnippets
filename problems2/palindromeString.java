package problems2;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String reverse = "";
        for (int i = 0; i < string.length(); i++) {
            reverse = string.charAt(i) + reverse;
        }
        if (string.equals(reverse)) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
        sc.close();
    }
}
