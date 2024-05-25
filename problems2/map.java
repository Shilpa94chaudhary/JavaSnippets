package problems2;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        String str = "Hello, World! Welcome to the World of Java.";
        // remove all special cases
        String newStr = str.replaceAll("[^a-zA-Z\\s]", "");

        // Split string
        // String[] wordArray = newStr.split("\\s");
        String[] wordArray = newStr.toLowerCase().split("\\s");

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : wordArray) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println(wordCounts);

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
