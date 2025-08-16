package problems6;

import java.util.*;

public class duplicateCharacter {

    // Write the code to return the array containing the duplicate characters in
    // string ignoring case sensitivity

    public static void duplicateChar(String str) {
        str = str.toLowerCase();
        System.out.println(str);
        Set<Character> set = new HashSet<>();
        Set<Character> setArray = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch) && ch != ' ') {
                setArray.add(ch);
            }
            set.add(ch);
        }
        char[] arr = new char[setArray.size()];
        int index = 0;
        for (char ch : setArray) {
            arr[index++] = ch;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        String str = "My Name is GAurav TAnEjA";
        duplicateChar(str);
    }
}
