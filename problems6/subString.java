package problems6;

import java.util.*;

public class subString {
    // Given a string str, find the length of the longest substring without
    // duplicate characters.
    // str = “abcasdbcabcjskeorufjslcvd”
    // longest string = "abcjskeoruf" length =11

    public static void findSubString(String str) {
        String subString = "";
        Set<String> subStrings = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            Set<Character> subStringChar = new HashSet<>();
            String subStr = "";
            for (int j = i; j < str.length(); j++) {
                if (!subStringChar.contains(str.charAt(j))) {
                    subStr += str.charAt(j);
                    subStringChar.add(str.charAt(j));
                } else
                    break;
            }
            subStrings.add(subStr);
            System.out.println(subStr);
        }
        for (String s : subStrings) {
            if (subString.length() < s.length()) {
                subString = s;
            }
        }
        System.out.println("Sub String: " + subString + "\nLength: " + subString.length());
    }

    public static void main(String[] args) {
        String str = "abcasdbcabcjskeorufjslcvd";
        findSubString(str);
    }
}
