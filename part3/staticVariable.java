package part3;

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        // This is instance method
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void showData(Mobile m) {
        System.out.println("This is static method");
        // We can use static variable inside static method but
        // we cannot use non static variable in static method
        // This statement will give an error
        // System.out.println(brand + " : " + price + " : " + name);

        System.out.println(m.brand + " : " + m.price + " : " + name);

    }
}

public class staticVariable {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 67000;
        Mobile.name = "SmartPhone";
        m1.show();

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 120000;
        m2.show();

        Mobile m3 = new Mobile();
        m3.brand = "OnePlus";
        m3.price = 40000;

        Mobile.showData(m3);
    }
}
