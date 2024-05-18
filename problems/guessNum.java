package problems;

import java.util.Random;
import java.util.Scanner;

public class guessNum {

    public static void main(String[] args) {
        Random random = new Random();
        int myNum = random.nextInt(101);
        // System.out.println(myNum);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number between 0 to 100 to guess the number, enter -1 to quit: ");
        int num = sc.nextInt();
        while (num != -1) {
            if (num == myNum) {
                System.out.println("Your guess is correct number is " + num);
                break;
            }
            if (num > myNum) {
                System.out.println("Your number is greater than actual number");
            } else {
                System.out.println("Your number is smaller than actual number");
            }
            System.out.println("Guess again ");
            num = sc.nextInt();
        }
        sc.close();
    }
}
