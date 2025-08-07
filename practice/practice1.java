package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class practice1 {

    // custom function to find duplicate in int array
    public static Set<Integer> fundDuplicate(int arr[]) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicate.add(num);
            } else {
                seen.add(num);
            }
        }

        return duplicate;
    }

    public static void main(String[] args) {

        System.out.println("Hellow Java");

        String name = "Aman Kumar";
        String name2 = name.replace('a', '0');
        System.out.println(name2);
        System.out.println(name);
        // Print length of String
        System.out.println((name.length()));
        // Print Sub String
        System.out.println(name.substring(2, 8));
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        int age = 31;
        System.out.println(age);

        float pi = 3.14F;
        System.out.println(pi);

        int[] arr = { 1, 2, 3, 4, 2, 6, 2, 7, 9, 10, 11, 7, 11 };
        Set<Integer> duplicate = fundDuplicate(arr);
        System.out.println(duplicate);

        // Take manual input
        Scanner sc = new Scanner(System.in);

        String myName = sc.nextLine();
        int myAge = sc.nextInt();

        System.out.println(myAge);
        System.out.println(myName);

        sc.close();
    }
}
