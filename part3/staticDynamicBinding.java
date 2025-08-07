package part3;

class Animal {
    void sound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Animal make sound");
    }
}

public class staticDynamicBinding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();
    }
}
