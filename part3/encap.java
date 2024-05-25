package part3;

class Human {
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

}

public class encap {
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(15);
        h.setName("Bhavesh");

        System.out.println(h.getName() + " : " + h.getAge());
    }
}
