package part1;

public class Functions {
    // Print given String
    public static void printName(String name) {
        System.out.println(name);
    }

    // Return maximum number in Array
    public static int maxNum(int[] num) {

        if (num.length == 0) {
            return 0;
        }
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        printName("Shilpa Chaudhary");
        int arr[] = { 10, 2, 3, 11, 31, 9 };
        int max = maxNum(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMaximum number in array is " + max);
    }
}
