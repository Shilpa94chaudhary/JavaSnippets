package part2;

import java.util.Scanner;

public class FunctionCall {
    public static void printMyName(String name) {
        String nameFormat = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(nameFormat);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
        sc.close();
    }
}
