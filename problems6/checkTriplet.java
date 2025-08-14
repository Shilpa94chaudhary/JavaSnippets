package problems6;

public class checkTriplet {

    // Given an integer array nums, return true if there exists indices i < j < k
    // such that nums[i] < nums[j] < nums[k]. Otherwise, return false.

    public static void checkTripletArray(int[] arr) {
        int first, second, third;
        int[] index = new int[3];

        for (int i = 0; i < arr.length; i++) {
            first = arr[i];
            index[0] = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > first) {
                    second = arr[j];
                    index[1] = j;
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] > second) {
                            third = arr[k];
                            index[2] = k;
                            System.out.println("True\nTriplet {" + first + ", " + second + ", " + third
                                    + "} at indexes " + index[0]
                                    + ", " + index[1] + ", " + index[2]);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("False, no increasing triplet");
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 }; // true
        int[] arr2 = { 5, 4, 3, 2, 1 }; // false, No increasing triplet
        int[] arr3 = { 2, 1, 5, 0, 4, 6 }; // true
        int[] arr4 = { 5, 1, 5, 2, 5, 3 }; // true

        checkTripletArray(arr1);
        checkTripletArray(arr2);
        checkTripletArray(arr3);
        checkTripletArray(arr4);
    }
}
