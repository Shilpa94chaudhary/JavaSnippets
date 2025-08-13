package problems6;

public class reverseWord {
    // Write the code to get the following output
    //

    public static void reverseString(String str) {
        String revStr = "";
        String firstWord = "";
        String lastWord = "";
        int index1 = 0;
        int index2 = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                firstWord = str.charAt(i) + firstWord;
                index1++;
            } else
                break;
        }

        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != ' ') {
                lastWord += str.charAt(i);
                index2--;
            } else
                break;
        }
        revStr += firstWord;
        for (int i = index1; i <= index2; i++) {
            revStr += str.charAt(i);
        }
        revStr += lastWord;
        System.out.println(revStr);
    }

    public static void main(String[] args) {
        String str = "My name is Gaurav";
        reverseString(str);
    }
}
