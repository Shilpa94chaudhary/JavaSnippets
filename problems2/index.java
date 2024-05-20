package problems2;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String subStr = sc.next();
        int index = str.indexOf(subStr);
        System.out.println(index);
        sc.close();
    }
}
