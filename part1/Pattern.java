package part1;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        for (int i = 1; i <= 8; i++) {
            if (i <= 4) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= 8 - 2 * i; k++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                int j = i - 4;
                for (int k = 4; k >= j; k--) {
                    System.out.print("*");
                }
                for (int k = 1; k <= (j - 1) * 2; k++) {
                    System.out.print(" ");
                }
                for (int k = 4; k >= j; k--) {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        System.out.println("Pattern 2");
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 10 - (i + 2); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pattern 3");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Pattern 4");
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            int printVal = i;

            while (printVal >= 1) {
                System.out.print(printVal--);
            }
            printVal = 2;
            while (printVal <= i) {
                System.out.print(printVal++);
            }

            System.out.println();
        }

    }
}
