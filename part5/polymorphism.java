package part5;

class Students {
    int rollNo;
    String name;
    int classs;

    public void printInfo(int rollNo) {
        System.out.println("Roll No: " + rollNo);
    }

    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public void printInfo(Students s) {
        System.out.println("Student info\nRoll No: " + s.rollNo + "\nName: " + s.name + "\nClass: " + s.classs);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        Students s = new Students();
        s.rollNo = 45;
        s.name = "Anmol";
        s.classs = 6;
        s.printInfo(s.rollNo);
        s.printInfo(s.name);
        s.printInfo(s);
    }
}
