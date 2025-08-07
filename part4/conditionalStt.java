package part4;

public class conditionalStt {
    public static void main(String[] args) {
        // Conditional Statements
        boolean isSunUp = false;
        if (isSunUp)
            System.out.println("Day");
        else
            System.out.println("Night");

        int age = 18;

        if (age >= 18)
            System.out.println("Can Vote");
        else
            System.out.println("Cann't Vote");

        // short statement for if condition ? value_if_true : value_if_false;
        int a = 10;
        String result = (a > 5) ? "Greater" : "Smaller";
        System.out.println(result);
    }
}
