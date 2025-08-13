package problems6;

public class reverseVowel {
    // Write a programe to reverse the vowels in the string
    // Input: s = "IceCreAm" Output: "AceCreIm"

    public static void revVowel(String str) {
        String revString = "";
        String vowels = "";

        // Get rev
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                vowels = str.charAt(i) + vowels;
            }
        }
        int ind = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                revString += vowels.charAt(ind++);
            } else {
                revString += str.charAt(i);
            }
        }
        System.out.println("String: " + str + "\nReverse String: " + revString);
    }

    public static void main(String[] args) {
        String str = "IceCreAm";
        revVowel(str);
    }

}
