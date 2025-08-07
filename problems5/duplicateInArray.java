package problems5;

import java.util.HashSet;
import java.util.Set;

public class duplicateInArray {

    public static Set<Integer> findDuplicate(int[] arr) {
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
        int[] array = { 3, 44, 1, 24, 2, 45, 6, 7, 1, 4, 44, 23, 2 };
        Set<Integer> duplicate = findDuplicate(array);
        System.out.println(duplicate);
    }
}
