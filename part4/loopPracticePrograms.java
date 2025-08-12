package part4;

public class loopPracticePrograms {

    // Check if a number is prime
    public static void ifPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is Prime number.");
        else
            System.out.println(num + " is not Prime number.");
    }

    // Generate Fibonacci series up to N terms
    public static void generateFibonacci(int N) {
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibonacci Series: " + n1 + ", " + n2);
        for (int i = 3; i <= N; i++) {
            int n = n1 + n2;
            n1 = n2;
            n2 = n;
            System.out.print(", " + n);
        }
        System.out.println();
    }

    // Print all Armstrong numbers between 1 and 999
    public static void printArmstrongNum(int N) {
        System.out.println("Armstrong numbers between 1 and " + N + ": ");
        for (int i = 1; i <= N; i++) {
            int numOfDigit = 0;
            int num = i;
            int sum = 0;
            numOfDigit = countDigit(i);
            if (numOfDigit == 1 && i != 1) {
                continue;
            }
            while (num > 0) {
                int mul = 1;
                for (int j = 0; j < numOfDigit; j++) {
                    mul = mul * (num % 10);
                }
                sum += mul;
                num = num / 10;

            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Check if a number is a palindrome
    public static void isPalindrome(int num) {
        int reverseNum = 0;
        int n = num;
        while (n > 0) {
            int temp = n % 10;
            reverseNum = reverseNum * 10 + temp;
            n = n / 10;
        }
        System.out.println(reverseNum);
        if (num == reverseNum)
            System.out.println(num + " is palindrome number.");
        else
            System.out.println(num + " is not palindrome number.");
    }

    // Check if a number is a perfect number
    public static void isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum)
            System.out.println(num + " is perfect number.");
        else
            System.out.println(num + " is not perfect number.");
    }

    // Count number of digits in a number
    public static int countDigit(int num) {
        int digit = 0;
        while (num > 0) {
            digit++;
            num = num / 10;
        }
        return digit;
    }

    // Print number triangle pattern (loop pattern)
    public static void printPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ifPrime(42);
        generateFibonacci(10);
        printArmstrongNum(999);
        isPalindrome(1211);
        isPerfectNumber(6);
        System.out.println("Number of digit in 12345 is " + countDigit(12345));
        printPattern(5);
    }
}
