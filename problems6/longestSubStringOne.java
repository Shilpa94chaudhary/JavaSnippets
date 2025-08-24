package problems6;

import java.util.Scanner;

public class longestSubStringOne {
    // Find the longest substring contains '1'
    // Input = "001110011"
    // Output = 3 (111)

    public static void findSubString(String str) {
        int count = 0;
        int newCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = (str.charAt(i)) - '0';
            if (num == 1) {
                newCount++;
                if (i == str.length() - 1) {
                    if (newCount > count)
                        count = newCount;
                }
            } else {
                if (newCount > count)
                    count = newCount;
                newCount = 0;
            }
        }
        System.out.println("Longest substring is of " + count + " characters");
    }

    public static void findSubStringContain1(String str) {
        int count = 0;
        int newCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                newCount++;
                if (i == str.length() - 1) {
                    if (newCount > count)
                        count = newCount;
                }
            } else {
                if (newCount > count)
                    count = newCount;
                newCount = 0;
            }
        }
        System.out.println("Longest substring is of " + count + " characters");
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findSubString(str);
        findSubStringContain1(str);
        sc.close();
    }
}
