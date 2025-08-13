package problems6;

public class removeZero {

    // Remove leading and trailing zero’s from a string "00000000001203405000"
    // o/p: "1203405"
    public static void removeZeroes(String str) {
        String newStr = "";
        String subStr = "";
        boolean preNum = false;
        boolean postNum = false;
        for (char ch : str.toCharArray()) {
            if (!preNum) {
                if (ch != '0') {
                    preNum = true;
                    newStr += ch;
                }
            } else if (!postNum) {
                if (ch == '0') {
                    postNum = true;
                    subStr += ch;
                } else
                    newStr += ch;
            } else {
                subStr += ch;
                if (ch != '0') {
                    newStr += subStr;
                    subStr = "";
                    postNum = false;
                }
            }
        }
        System.out.println(newStr);
    }

    public static void main(String[] arg) {
        removeZeroes("000000000012034005000");
    }
}
