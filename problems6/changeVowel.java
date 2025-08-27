package problems6;

import java.util.Scanner;

public class changeVowel {
    // Alternatively change the case of each vowel

    public static void changeVowelCase(String str) {
        str = str.toLowerCase();
        String newString = "";
        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                if (vowel % 2 == 0 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    newString += (char) (ch - 32);
                    vowel++;
                } else {
                    newString += ch;
                    vowel++;
                }
            } else {
                newString += ch;
            }
        }
        System.out.println(newString);
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        changeVowelCase(str);
        sc.close();
    }

}
