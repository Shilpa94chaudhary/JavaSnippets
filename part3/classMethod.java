package part3;

class Calculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    // Function overloading
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class classMethod {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int result = obj.add(4, 5);
        System.out.println(result);
    }
}
