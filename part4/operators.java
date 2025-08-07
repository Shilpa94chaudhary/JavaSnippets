package nab;

public class operators {
    public static void main(String[] args) {

        // Arithmetic Operator
        int num1 = 3;
        int num2 = 4;
        int diff = num1 - num2;
        int mul = num1 * num2;
        double div = (double) num1 / (double) num2;
        int mod = num2 % num1;

        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // Assignment operator
        int num = 10;
        System.out.println(num);

        // Uni operator
        int numb = 5;
        numb++;
        System.out.println(numb);

        System.out.println("numb-- = " + numb--);
        System.out.println("numb = " + numb);
        System.out.println("--numb = " + --numb);
        System.out.println("numb = " + numb);

        // math
        System.out.println(Math.max(45, 97));
        System.out.println(Math.min(73, 30));
        System.out.println((int) (Math.random() * 100));

        // Logic Operators: and -> && , or -> || , not -> !

        int a = 50, b = 30;

        if (a < 60 && b > 40)
            System.out.println(a + " < 60 && " + b + " > 40 : true");
        else
            System.out.println(a + " < 60 && " + b + " > 40 : false");

        if (a < 60 || b > 40)
            System.out.println(a + " < 60 || " + b + " > 40 : true");
        else
            System.out.println(a + " < 60 || " + b + " > 40 : false");

        boolean isAdult = false;

        if (!isAdult)
            System.out.println("Not adult");

    }
}
