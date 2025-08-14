package problems6;

public class reverseString {

    // Reverse the string while maintaining special character positions
    // input - "abcd#kdo%r*" output - rodk#dcb%a*

    public static void revString(String str) {
        String newString = "";
        String revString = "";
        for (char ch : str.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                revString = ch + revString;
        }
        for (int i = 0, j = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                newString += revString.charAt(j);
                j++;
            } else {
                newString += ch;
            }
        }
        System.out.println("Reverse string of " + str + " is " + newString);
    }

    public static void main(String[] args) {
        String str = "abcd#kdo%r*";
        revString(str);
    }
}
