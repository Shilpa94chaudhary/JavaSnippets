package part1;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
boolean isLeapYr = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeapYr == true)
            System.out.println("Year is leap year");
        else   
            System.out.println("Year is not leap year");

        sc.close();
    }
}
