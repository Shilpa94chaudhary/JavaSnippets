package nab;

public class arrayPracticePrograms {

    // Find the maximum and minimum element in an array
    public static void maxMinArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int n : arr) {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }
        System.out.println("Minimum in arr is " + min + " and maximum is " + max);
    }

    // Find the second largest element in an array
    public static void secLar(int[] arr) {
        int lar;
        int secL;
        if (arr[0] > arr[1]) {
            lar = arr[0];
            secL = arr[1];
        } else {
            lar = arr[1];
            secL = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > lar) {
                secL = lar;
                lar = arr[i];
            } else if (arr[i] > secL && arr[i] < lar) {
                secL = arr[i];
            }
        }
        System.out.println("Second largest " + secL);
    }

    // Reverse the array without using a second array
    public static void revArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Check if the array is sorted (ascending)
    public static void checkArraySorting(int[] arr) {
        int num = arr[0];
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (num > arr[i]) {
                isSorted = false;
                break;
            }
            num = arr[i];
        }
        if (isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

    // Remove duplicate elements from an array (without Set or List)
    public static void removeDuplicate(int[] arr) {
        int[] newArr = { arr[0] };

    }

    public static void main(String[] args) {
        int[] arr = { 23, 14, 64, 9, 23, 67, 4, 88, -1 };
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        maxMinArray(arr);
        secLar(arr);
        revArr(arr);
        checkArraySorting(arr);
        checkArraySorting(arr1);
    }
}
