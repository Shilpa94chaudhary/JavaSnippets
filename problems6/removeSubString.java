package problems6;

public class removeSubString {
    // Remove all str2 from str1
    // Str1 = ababaabcbccgght
    // Str2 = abc

    public static void removeSubStr(String str, String subStr) {
        String newString = "";
        int subStrLength = subStr.length();
        for (int i = 0; i < str.length(); i++) {
            if (i + subStrLength <= str.length()) {
                String subS = str.substring(i, i + subStrLength);
                if (subS.equals(subStr)) {
                    i = i + subStrLength - 1;
                } else {
                    newString += str.charAt(i);
                }
            } else {
                newString += str.charAt(i);
            }

        }
        System.out.println(newString);
    }

    public static void main(String[] arg) {
        removeSubStr("helloShilpa", "llo");
        removeSubStr("ababaabcbccgght", "abc");
    }

}
