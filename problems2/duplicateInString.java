package problems2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class duplicateInString {

    public static Map<String, Integer> countDuplicate(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        return wordCounts;
    }

    public static String capitalizeEvenIndices1(String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < result.length(); i++) {
            if (i % 2 == 0) {
                result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
            }
        }
        return result.toString();
    }

    public static String capitalizeEvenIndices2(String s) {
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (i % 2 == 0) {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // counting name
        Map<String, Integer> wordCount = countDuplicate(s);
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        String result1 = capitalizeEvenIndices1(s);
        String result2 = capitalizeEvenIndices2(s);
        System.out.println(result1);
        System.out.println(result2);
        sc.close();
    }
}
