package part4;

public class exceptionPractice {
    public static void main(String[] args) {
        int[] marks = { 76, 83, 86 };
        try {
            System.out.println(marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
        int a = 5;
        int div = 0;
        try {
            div = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        System.out.println(div);

        int numerator = 18, denominator = 0;
        int[] arr = new int[5];

        try {
            int result = numerator / denominator;
            System.out.println("Devided, result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot devide by 0");
        }

        try {
            int result = numerator / (denominator + 2);
            System.out.println("Devided, result = " + result);
            System.out.println(arr[2]);

            // System.out.println(arr[5]);
            // As we are catching only ArithmeticException program will terminate here and
            // exception for Index out of bound is not handled to avoid this we should user
            // multiple catch
        } catch (ArithmeticException e) {
            System.out.println("Cannot devide by 0");
        }

        // Multiple Catch
        try {
            int result = numerator / (denominator + 2);
            System.out.println("Devided, result = " + result);
            System.out.println(arr[2]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot devide by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index should be less than array size.");
        } catch (Exception e) {
            System.out.println("Some exception occused");
        }
        System.out.println("The End");

    }
}
