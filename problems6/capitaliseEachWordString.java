package problems6;

public class capitaliseEachWordString {

    public static void capitaliseEachWord(String str) {
        String newString = "";
        newString += Character.toUpperCase(str.charAt(0));
        System.out.println(str.toUpperCase());
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                newString += str.charAt(i);
            } else {
                i++;
                newString = newString + " " + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        String str = "welcome to sapient the finest digital company";
        capitaliseEachWord(str);
    }

}
