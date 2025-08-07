package javaTest;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class duplicateWords {
    public static Set<String> findDuplicateWord(String str) {
        String[] words = str.replaceAll("[^a-zA-z\\s]", "").split("\\s");
        Set<String> seen = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for (String word : words) {
            if (seen.contains(word)) {
                duplicate.add(word);
            } else {
                seen.add(word);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Set<String> duplicates = findDuplicateWord(str);

        for (String word : duplicates) {
            System.out.println(word);
        }
        sc.close();
    }
}
