package problems6;

import java.util.*;

public class removeDuplicate {

    // Given string: "automation" WAP to get the output as string not containing the
    // duplicate characters: "automin"
    public static void removeDuplicateChar(String str) {
        String newString = "";
        Set<Character> charSet = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!charSet.contains(ch)) {
                newString += ch;
                charSet.add(ch);
            }
        }
        System.out.println("String: " + str + "\nNewString: " + newString);
    }

    public static void main(String[] args) {
        String str = "automation";
        removeDuplicateChar(str);
    }
}
