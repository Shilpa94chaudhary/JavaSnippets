package problems6;

import java.util.*;
import java.util.Scanner;

public class longestSubString {
    // Longest Substring Without Repeating Characters
    // Input: s = "abcabcbb"
    // Output: 3

    public static void longestSubStringNR(String str) {
        int count = 0;
        String subString = "";
        for (int i = 0; i < str.length(); i++) {
            int newCount = 0;
            String subStr = "";
            Set<Character> set = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                if (!set.contains(str.charAt(j))) {
                    set.add(str.charAt(j));
                    subStr += str.charAt(j);
                    newCount++;
                } else {
                    break;
                }
            }
            if (newCount > count) {
                count = newCount;
                subString = subStr;
            }
        }
        System.out.println(subString + " " + count);
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        longestSubStringNR(str);
        sc.close();
    }
}
