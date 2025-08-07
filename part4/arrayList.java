package part4;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Add lement to ArrayList
        numbers.add(3);
        numbers.add(5);
        numbers.add(15);
        numbers.add(30);

        // Print ArrayList
        System.out.println(numbers);

        // Print size of list
        System.out.println("Size: " + numbers.size());

        // Fine element at any index, find element with index is not possible in
        // Collection but in List we can
        System.out.println(numbers.get(1));

        // Find index of any element in List, it will return index of 15, i.e. 2
        System.out.println(numbers.indexOf(15));

        // If element is not present in List it will return -1
        System.out.println(numbers.indexOf(50));

        // Lets add 30 which is already present in List
        numbers.add(30);
        System.out.println(numbers);

        // Remove element at given index from List
        numbers.remove(0);
        System.out.println(numbers);

        // Add values in List
        List<Integer> marks = Arrays.asList(78, 82, 84, 96, 76);
        System.out.println(marks);

        // Use forEach() frunction
        marks.forEach(n -> System.out.println("n = " + n));

        // Use of normal for() loop
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }
    }
}
