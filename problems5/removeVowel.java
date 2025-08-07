package problems5;

import java.util.HashSet;
import java.util.Set;

public class removeVowel {

    public static void main(String[] args) {
        String name = "Shilpa Chaudhary";
        String str = "";
        // Reverse the function
        for (int i = 0; i < name.length(); i++) {
            str = name.charAt(i) + str;
        }

        System.out.println(name);
        System.out.println(str);

        String noVowel = "";
        // Remove Vowels

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        for (int i = 0; i < name.length(); i++) {
            if (!vowels.contains(name.charAt(i)))
                noVowel += name.charAt(i);
        }

        System.out.println(noVowel);
    }
}
