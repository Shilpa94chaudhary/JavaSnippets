package problems6;

public class maxSumArray {
    // Write the code to get the maximum sum of subarray from an array
    // arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4}
    // max subarray sum = 6

    // Kadane’s Algorithm
    public static void maxSumSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int sum = arr[i] + currentSum;
            if (arr[i] > sum)
                currentSum = arr[i];
            else
                currentSum = sum;

            if (currentSum > maxSum)
                maxSum = currentSum;
        }
        System.out.println("Maximum sum of subarray is " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 2, -5, 4 };
        maxSumSubArray(arr);
    }
}
