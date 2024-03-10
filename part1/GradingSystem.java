package part1;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        // Grading System
        // Create a Scanner
        Scanner sc = new Scanner(System.in);

        int math = sc.nextInt();
        int science = sc.nextInt();
        int hindi = sc.nextInt();
        int english = sc.nextInt();

        int score = math + science + hindi + english;
        int percent = (score * 100)/400;
        if(percent > 80){
            System.out.println("Grade A");
        }else if(percent > 60){
            System.out.println("Grade B");
        }else{
            System.out.println("Grade C");
        }
        // Close the Scanner
        sc.close();
    }
}
