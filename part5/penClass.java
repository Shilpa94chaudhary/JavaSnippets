package part5;

class Pens {
    String color;
    String company;
    String type;

    public void printInfo() {
        System.out.println("Pen\nCompany: " + this.company);
        System.out.println("Color: " + this.color);
        System.out.println("Type" + this.type);
    }

    Pens() {
        System.out.println("Default constructor called.");
    }

    Pens(String color, String company, String type) {
        this.color = color;
        this.company = company;
        this.type = type;
        System.out.println("This is parameterized constructor");
    }

    Pens(Pens p) {
        this.color = p.color;
        this.company = p.company;
        this.type = p.type;
        System.out.println("This is copy constructor");
    }
}

public class penClass {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.color = "Blue";
        p1.company = "Cello";
        p1.type = "Ball";
        Pens p2 = new Pens("Black", "Schneider", "Ball");
        Pens p3 = new Pens(p1);
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
    }
}
