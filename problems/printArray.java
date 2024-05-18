package problems;

public class printArray {
    public static void main(String[] args) {

        try {
            int[] arr = { 2, 4, 5, 6, 7, 8, };
            for (int num : arr) {
                System.out.println(num);
            }
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Exception: Incorrect index number");
        }
        System.out.println("End of program");
    }
}
