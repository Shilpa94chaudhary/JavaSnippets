package problems2;

public class stringOp {
    public static void main(String[] args) {
        // Length, concaticate, replace

        String str = "Java Programming";
        System.out.println(str.length());

        String rStr = str.replace("Java", "JavaScript");
        System.out.println(rStr);

        String concatStr = str.concat(" is fun.");
        System.out.println(concatStr);
    }
}
