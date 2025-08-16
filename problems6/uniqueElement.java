package problems6;

import java.util.*;

public class uniqueElement {

    // Find elements unique to each array
    // Input:nums1=[1,3,3],nums2=[1,1,4,5]Output:[[3],[4,5]]

    public static void findUniqueInArray(int[] arr1, int[] arr2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : arr1)
            set1.add(n);
        for (int n : arr2)
            set2.add(n);

        for (int n : set1) {
            if (!set2.contains(n))
                list1.add(n);
        }

        for (int n : set2) {
            if (!set1.contains(n))
                list2.add(n);
        }
        result.add(list1);
        result.add(list2);

        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 3 };
        int[] arr2 = { 1, 1, 4, 5 };
        findUniqueInArray(arr1, arr2);
    }

}
