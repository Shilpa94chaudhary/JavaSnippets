package problems6;

import java.util.Scanner;

public class mergeString {

    // Merge two Strings
    public static void mergeTwoStrings(String s1, String s2) {
        String newString = "";
        int i = 0, j = 0;
        for (int k = 0; k < s1.length() + s2.length(); k++) {
            if (k % 2 == 0) {
                if (i < s1.length()) {
                    newString += s1.charAt(i);
                    i++;
                } else {
                    newString += s2.charAt(j);
                    j++;
                }
            } else {
                if (j < s2.length()) {
                    newString += s2.charAt(j);
                    j++;
                } else {
                    newString += s1.charAt(i);
                    i++;
                }
            }
        }
        System.out.println("String 1: " + s1 + "\nString 2: " + s2);
        System.out.println("New String: " + newString);
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        mergeTwoStrings(str1, str2);
        sc.close();
    }
}
