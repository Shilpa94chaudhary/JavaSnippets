package problems6;

import java.util.*;

public class highestNonRepeating {

    // Write the code to get the non-repeating highest element in an array
    public static void nonRepeatingNum(int[] arr) {
        int highest = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                if (entry.getKey() > highest)
                    highest = entry.getKey();
            }
        }
        if (highest != Integer.MIN_VALUE)
            System.out.println("Highest non repeating value in given array is " + highest);
        else
            System.out.println("No non repeating highest number in array.");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 9, 2, 0, 6, 9, 0, 2, 3, 11 };
        nonRepeatingNum(arr);
    }
}
