package nab;

import java.util.Arrays;

public class arrayConcepts {
    public static void main(String[] args) {

        // Integer Array
        int[] marks = new int[3];
        marks[0] = 67;
        marks[1] = 84;
        marks[2] = 77;

        System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);

        // Length of array, length is property of array. So we will not give () with
        // length keyword
        System.out.println(marks.length);

        // Print all elements in array
        for (int num : marks) {
            System.out.println(num);
        }

        // Sorting of array
        Arrays.sort(marks);

        // Print all elements in array after sorting
        for (int num : marks) {
            System.out.println(num);
        }

        // initialise array
        int[] numbers = { 1, 3, 5, 7, 9 };
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
