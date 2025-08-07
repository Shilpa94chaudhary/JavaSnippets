package problems4;

public class Practice {

    public static void revString(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            // System.out.println(str.charAt(i));
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }

    public static String replaceChar(String str, char oldC, char newC) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == oldC) {
                newStr += newC;
            } else {
                newStr += str.charAt(i);
            }

        }
        return newStr;
    }

    public static String revVowel(String str) {
        String newStr = "";
        String vowelStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                vowelStr += str.charAt(i);
            }
        }

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                newStr += vowelStr.charAt(index);
                index++;
            } else {
                newStr += str.charAt(i);
            }

        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println("Hello Java");
        String name = "Shilpa Chaudhary";
        System.out.println(name);
        int age = 30;
        System.out.println(age);
        revString(name);
        float pi = 3.14F;
        System.out.println(pi);
        String newString = replaceChar(name, 'a', 'z');
        System.out.println(newString);
        System.out.println(revVowel(name));
    }
}
