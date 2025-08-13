package problems6;

import java.util.*;

public class findFrequency {

    // Find the frequency of each repeating word in a given string
    public static void findFreq(String str) {
        Map<String, Integer> wordMap = new HashMap<>();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (wordMap.containsKey(word))
                    wordMap.put(word, wordMap.get(word) + 1);
                else
                    wordMap.put(word, 1);
                word = "";
            } else {
                word += str.charAt(i);
                if (i == str.length() - 1) {
                    if (wordMap.containsKey(word))
                        wordMap.put(word, wordMap.get(word) + 1);
                    else
                        wordMap.put(word, 1);
                }
            }
        }

        for (String string : wordMap.keySet()) {
            if (wordMap.get(string) > 1)
                System.out.println(string + " comes " + wordMap.get(string) + " times.");
        }
    }

    public static void main(String[] args) {
        String str = "This is a test This test is simple test";
        findFreq(str);
    }

}
