package problems6;

import java.util.*;

public class secondRepNum {

    // Find the second most repeated number in an array.
    public static void findSecRep(int[] arr) {
        int[] secRep = { 0, -1 };
        int[] firstRep = new int[2];
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i : arr) {
            if (numFreq.isEmpty()) {
                numFreq.put(i, 1);
            } else if (numFreq.containsKey(i)) {
                numFreq.put(i, numFreq.get(i) + 1);
            } else {
                numFreq.put(i, 1);
            }
        }
        int index = 1;
        for (int num : numFreq.keySet()) {
            System.out.println(num + ": " + numFreq.get(num));
            if (index == 1) {
                firstRep[0] = num;
                firstRep[1] = numFreq.get(num);
                index++;
            } else if (index == 2) {
                if (firstRep[1] > numFreq.get(num)) {
                    secRep[0] = num;
                    secRep[1] = numFreq.get(num);
                } else {
                    secRep[0] = firstRep[0];
                    secRep[1] = firstRep[1];
                    firstRep[0] = num;
                    firstRep[1] = numFreq.get(num);
                }
            } else {
                if (firstRep[1] < numFreq.get(num)) {
                    secRep[0] = firstRep[0];
                    secRep[1] = firstRep[1];
                    firstRep[0] = num;
                    firstRep[1] = numFreq.get(num);
                } else if (secRep[1] < numFreq.get(num)) {
                    secRep[0] = num;
                    secRep[1] = numFreq.get(num);
                }
            }
        }
        if (secRep[1] != -1)
            System.out.println(secRep[0] + " is repeated " + secRep[1] + " times");
        else
            System.out.println("No second non repeating number");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 2, 6, 6, 6, 6, 5, 6 };
        findSecRep(arr);
    }
}
