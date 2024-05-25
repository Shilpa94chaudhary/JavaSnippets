package part3;

class Mobile {
    String phone;
    int price;
    static String name;
    static {
        name = "Smart Phone";
        System.out.println("Static Block");
    }

    public Mobile() {
        System.out.println("Constructor");
        phone = "";
        price = 50000;
    }

    public void show() {
        System.out.println(phone + " : " + price + " : " + name);
    }
}

public class staticBlock {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.phone = "iPhone";

        Mobile m2 = new Mobile();
        m2.phone = "Samsun";

        m1.show();
        m2.show();
    }
}
