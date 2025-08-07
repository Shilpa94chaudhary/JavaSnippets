package part4;

public class stringPracticePrograms {

    // Check if a string is a palindrome
    public static void isPalindrome(String str) {
        int strL = str.length();
        for (int i = 0, j = strL - 1; i < strL / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("String " + str + " is not palindrome");
                return;
            }
        }
        System.out.println("String " + str + " is palindrome");
    }

    // Count vowels and consonants in a string
    public static void countVowelCons(String str) {
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vowel++;
                    break;
                default:
                    consonant++;
            }
        }
        System.out.println("In string '" + str + "' Vowel =" + vowel + " and Consonant = " + consonant);
    }

    // Remove all duplicate characters from a string
    public static void removeDuplicateChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            boolean isPresent = false;
            for (int j = 0; j < newStr.length(); j++) {
                if (str.charAt(i) == newStr.charAt(j))
                    isPresent = true;
            }
            if (!isPresent)
                newStr += str.charAt(i);
        }
        System.out.println("Remove all duplicate characters from '" + str + "' and new string is '" + newStr + "'.");
    }

    // Count character in string
    public static int countChart(char ch, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                count++;
        }
        return count;
    }

    // Check if two strings are anagrams of each other
    public static void checkIfAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
            return;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            int countStr1 = countChart(str1.charAt(i), str1);
            int countStr2 = countChart(str1.charAt(i), str2);
            if (countStr1 != countStr2) {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
                return;
            }
        }
        System.out.println(str1 + " and " + str2 + " are anagrams.");
    }

    // Reverse each word in a sentence
    public static void revWord(String str) {
        String newStr = "";
        String revWord = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                revWord = str.charAt(i) + revWord;
            } else {
                newStr = newStr + " " + revWord;
                revWord = "";
            }
            // Last word
            if (i == str.length() - 1) {
                newStr = newStr + " " + revWord;
                revWord = "";
            }
        }
        System.out.println("Reverse each word in\nSentance: " + str + "\nNew Sentance: " + newStr);
    }

    // Capitalize the first letter of each word in a sentence
    public static void camelCaseFormat(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                newString += (char) (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ? str.charAt(i) - 32 : str.charAt(i));
            } else if (str.charAt(i) == ' ') {
                newString += ' ';
                if (i < str.length() - 1) {
                    i++;
                    newString += (char) (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ? str.charAt(i) - 32
                            : str.charAt(i));
                }
            } else {
                newString += (char) (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ? str.charAt(i) - 32
                        : str.charAt(i));
            }
        }
        System.out.println(
                "Capitalize the first letter of each word in a sentence\nInput: " + str + "\nOutput: " + newString);
    }

    // Count frequency of each character without using Map
    public static void countFrequency(String str) {
        char[] isItt = new char[str.length()];
        int[] countItt = new int[str.length()];
        int size = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            boolean alreadyPresent = false;
            for (char chh : isItt) {
                if (ch == chh) {
                    alreadyPresent = true;
                }
            }
            if (!alreadyPresent) {
                count = countChart(ch, str);
                isItt[size] = ch;
                countItt[size] = count;
                size++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(isItt[i] + " : " + countItt[i]);
        }
    }

    public static void main(String[] args) {
        String str = "Helle";
        String str1 = "liisten";
        String str2 = "sillent";
        String sentence = "Life is fun";
        isPalindrome(str);
        countVowelCons(str);
        removeDuplicateChar(str);
        checkIfAnagrams(str1, str2);
        revWord(sentence);
        camelCaseFormat("my name is shilpa  .");
        countFrequency("aabbccad");
    }
}
