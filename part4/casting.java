package nab;

public class casting {
    public static void main(String[] args) {

        // Implicit casting
        double price1 = 100.00;
        double finalPrice1 = price1 + 18.55; // 18 is Integer
        System.out.println(finalPrice1);

        // Explicit casting
        int price2 = 100;
        int finalPrice2 = price2 + (int) 18.55;
        System.out.println(finalPrice2);

    }
}
