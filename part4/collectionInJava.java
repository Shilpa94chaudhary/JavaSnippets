package nab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class collectionInJava {
    public static void main(String[] args) {

        Collection nums = new ArrayList<>();
        nums.add(61);
        nums.add(94);
        nums.add("Nine");
        System.out.println("Number ArrayList: " + nums);
        System.out.println("Size of number ArrayList: " + nums.size());

        System.out.println("When object is used and direclty printed");
        for (Object n : nums) {
            System.out.println(n);
        }

        System.out.println("When type caseted");
        for (Object n : nums) {
            try {
                // will give compile time error
                // System.out.println(n * 2);
                int num = (Integer) n; // Through an exception
                System.out.println(num);

            } catch (Exception e) {
                System.out.println("Can not perform arithmetic operation");
            }
        }

        // As we can not perform arithmetic operations on Object we should specify the
        // type i.e. Integer
        Collection<Integer> marks = new ArrayList<Integer>();
        marks.add(75);
        marks.add(69);
        marks.add(86);
        marks.add(79);
        marks.add(96);
        System.out.println("Marks ArrayList: " + marks);

        // List
        List<Integer> numbers = new ArrayList<>();

        numbers.add(21);
        numbers.add(65);
        numbers.add(33);
        System.out.println(numbers);
        numbers.add(1, 51);
        System.out.println(numbers);

        // Can we create list of objects
        List<Object> twoDArr = new ArrayList<>();
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5 };
        int[] arr3 = { 6, 7, 8 };
        twoDArr.add(arr1);
        twoDArr.add(arr2);
        twoDArr.add(arr3);
        System.out.println(twoDArr); // Will return something like [[I@18b4aac2, [I@764c12b6, [I@c387f44]

        for (Object row : twoDArr) {
            System.out.println((Arrays.toString((int[]) row)));
        }

        // Two D Array
        List<int[]> twoDimArray = new ArrayList<>();
        int[] ar1 = { 11, 22, 33 };
        int[] ar2 = { 44, 55 };
        twoDimArray.add(ar1);
        twoDimArray.add(ar2);

        for (int[] row : twoDimArray) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row : twoDimArray) {
            System.out.print("[ ");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println("]");
        }

        // Another way to save two dimentional array in Array list
        List<List<Integer>> two_D_Array = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(101);
        row1.add(521);
        row1.add(213);
        List<Integer> row2 = new ArrayList<>();
        row2.add(712);
        List<Integer> row3 = new ArrayList<>();
        row3.add(612);
        row3.add(121);

        two_D_Array.add(row1);
        two_D_Array.add(row2);
        two_D_Array.add(row3);

        for (List<Integer> row : two_D_Array) {
            System.out.println(row);
        }
    }
}
