package problems6;

import java.util.*;

public class wordMaxFrequency {
    // Find the word with maximum frequency in string
    // “This is a test This test is simple test”.
    // o/p: “test”

    public static void findFrequency(String str) {
        String subString = "";
        int frequency = 0;
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                subString += str.charAt(i);
                if (i == str.length() - 1) {
                    if (!words.containsKey(subString)) {
                        words.put(subString, 1);
                    } else {
                        words.put(subString, words.get(subString) + 1);
                    }
                }
            } else {
                if (!words.containsKey(subString)) {
                    words.put(subString, 1);
                } else {
                    words.put(subString, words.get(subString) + 1);
                }
                subString = "";
            }
        }

        for (String subStr : words.keySet()) {
            if (subString == "") {
                subString = subStr;
                frequency = words.get(subStr);
            } else {
                if (frequency < words.get(subStr)) {
                    subString = subStr;
                    frequency = words.get(subStr);
                }
            }
        }
        System.out.println("Maximum frequency word in string is " + subString + " and frequency is " + frequency);
    }

    public static void main(String[] args) {
        String str = "This is a test This test is simple test";
        findFrequency(str);
    }
}
