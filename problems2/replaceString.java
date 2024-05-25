package problems2;

public class replaceString {
    public static void main(String[] args) {
        String str = "Hello, this is Java Program";
        String targetSubStr = "Hello";
        String newSubStr = "Hi";

        String newStr = str.replace(targetSubStr, newSubStr);

        System.out.println(str);
        System.out.println(newStr);
    }
}
