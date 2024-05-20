package problems2;

public class staticMethod {
    public static void main(String[] args) {
        System.out.println("This is Main method.");
    }

    static {
        // Static method is called befor main method
        System.out.println("This is a Static Method.");
    }
}
