package problems2;

import java.util.Scanner;

public class compareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.compareTo(s2) > 0) {
            System.out.println(s1 + " is greater than " + s2);
        } else if (s1.compareTo(s2) < 0) {
            System.out.println(s1 + " is smaller than " + s2);
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }
        sc.close();
    }
}
