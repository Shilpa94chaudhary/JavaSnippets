package problems2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class splitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        // Remove all special characters from string
        String newSt = st.replaceAll("[^a-zA-Z\\s]", "");
        System.out.println(st);
        System.out.println(newSt);

        // Save individual word in String Array
        String[] splitString = newSt.split("\\s");

        Map<String, Integer> count = new HashMap<>();

        // Map String and Count
        for (String word : splitString) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        sc.close();
    }
}
