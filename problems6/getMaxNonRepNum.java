package problems6;

import java.util.*;

public class getMaxNonRepNum {

    // Get the maximum non repeating element without sorting the array
    public static void getMaxNum(int arr[]) {
        int maxNonRepeating = Integer.MIN_VALUE;
        Map<Integer, Integer> numRep = new HashMap<>();
        for (int num : arr) {
            if (numRep.containsKey(num)) {
                numRep.put(num, (numRep.get(num) + 1));
            } else
                numRep.put(num, 1);
        }
        for (int num : numRep.keySet()) {
            System.out.println(num + " " + numRep.get(num));
            if (num > maxNonRepeating && numRep.get(num) == 1) {
                maxNonRepeating = num;
            }
        }
        if (maxNonRepeating != Integer.MIN_VALUE) {
            System.out.println("Maximum non repeating element is " + maxNonRepeating);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4, 9, 2, 0, 6, 9, 0 };
        getMaxNum(arr);
    }
}
