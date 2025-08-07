package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class practive2 {

    public static Set<String> findDuplicate(String str) {

        // String[] words = str.replaceAll("[^a-zA-Z\\s]", "").split("\\s");
        String[] wordss = str.split("\\s");
        Set<String> seen = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String word : wordss) {
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

        String line = sc.nextLine();

        Set<String> duplicate = findDuplicate(line);

        for (String word : duplicate) {
            System.out.println(word);
        }
        sc.close();
    }
}
