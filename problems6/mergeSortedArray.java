package problems6;

public class mergeSortedArray {

    // Write code to merge two sorted array into one sorted array
    public static void mergeArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int ind1 = 0;
        int ind2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ind1 < arr1.length && ind2 < arr2.length) {
                if (arr1[ind1] == arr2[ind2]) {
                    arr[i] = arr1[ind1];
                    ind1++;
                    i++;
                    arr[i] = arr2[ind2];
                    ind2++;
                } else if (arr1[ind1] < arr2[ind2]) {
                    arr[i] = arr1[ind1];
                    ind1++;
                } else {
                    arr[i] = arr2[ind2];
                    ind2++;
                }
            } else if (ind1 < arr1.length) {
                arr[i] = arr1[ind1];
                ind1++;
            } else {
                arr[i] = arr2[ind2];
                ind2++;
            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 7, 9, 11, 13 };
        int[] arr2 = { 4, 6, 8, 10, 12, 13 };
        mergeArray(arr1, arr2);
    }
}
