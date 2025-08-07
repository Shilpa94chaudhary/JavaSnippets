package problems5;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        // Write a function/method which can return list of duplicate elements present
        // in an array.
        // For example:- if I am passing an Array with values {2,3,2,7,4,3,6,2,4,5,4}
        // as an argument then the function should return list of duplicate elements
        // i.e. {2,3,4}.

        int[] arr = { 2, 3, 2, 7, 4, 3, 6, 2, 4, 5, 4 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], (map.get(arr[i])) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey());
            }
        }
    }
}
