package problems6;

public class findMinNumberOfCabs {

    // Function to find minimum number of cabs for people
    public static int findNumOfCar(int[] p, int[] s) {
        int numOfCars = 0;
        int totalPass = 0;

        for (int n : p)
            totalPass += n;

        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i] < s[j]) {
                    int temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        for (int n : s) {
            if (totalPass > 0) {
                totalPass -= n;
                numOfCars++;
            }
        }
        return numOfCars;
    }

    public static void main(String[] args) {
        int[] passengers = { 4, 4, 2, 4 }; // { 1, 4, 1 };
        int[] cabs = { 5, 5, 2, 5 }; // { 1, 5, 1 };

        int numOfCars = findNumOfCar(passengers, cabs);
        System.out.println("Total number of minimum cabs required will be " + numOfCars);
    }
}
