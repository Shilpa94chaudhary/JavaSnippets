package part3;

class Calculator {

    public int add(int n1, int n2) {
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
