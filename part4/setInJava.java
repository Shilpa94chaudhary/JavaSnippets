package nab;

import java.util.*;

public class setInJava {
    public static void main(String[] args) {
        // HashSet
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(55);
        nums.add(15);
        nums.add(5);
        nums.add(45);
        nums.add(2);
        System.out.println(nums);
        // Try to add duplicate entry in Set
        nums.add(45);
        System.out.println(nums);

        // TreeSet
        // If we want sorted values instead of HashSet we should use TreeSet
        Set<Integer> numbers = new TreeSet<Integer>();
        numbers.add(55);
        numbers.add(15);
        numbers.add(5);
        numbers.add(45);
        numbers.add(2);
        System.out.println(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println(numbers.contains(45));
        System.out.println(numbers.contains(50));
    }
}
