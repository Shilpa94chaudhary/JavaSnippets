package part4;

public class stringConcepts {
    public static void main(String[] arg) {
        String name = "Aman";
        System.out.println(name);
        String neighbour = "Aakriti";
        System.out.println(neighbour);

        // String Litral
        String str1 = "New string";
        String str2 = "New string";
        // Using new keyword
        String str3 = new String("New string");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false

        str1 = "hello";
        System.out.println(str1 + " " + str2);

        // Cannot menupulate string, error: The left-hand side of an assignment must be
        // a variable
        // str1.charAt(0) = 'A';

        // Concatinate strings
        String newString = str1 + " " + str2;
        System.out.println(newString);

        // Character at 0th index
        System.out.println(newString.charAt(0));

        // Replace function
        String newStringReplaced = newString.replace("hello", "Hello, ");
        System.out.println(newStringReplaced);

        // Sub string
        String fullName = "Aman Kumar";
        String firstName = fullName.substring(0, 4);
        System.out.println(firstName);

        // Length, because length is function we should give '()' after length keyword.
        // (un-like arrays, length is property of array)
        String sentance = "Hello, my name is Aman";
        System.out.println(sentance.length());
    }
}
