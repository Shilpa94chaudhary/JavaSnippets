package problems6;

import java.util.Scanner;

public class expandChar {
    // WAP to expand characters based on the number following them.
    // Input: a2b3c1
    // Output: aabbbc

    public static void expandCharacter(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            i++;
            int count = str.charAt(i) - '0';
            for (int j = 0; j < count; j++) {
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        expandCharacter(str);
        sc.close();
    }
}
