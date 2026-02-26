class Animal {

    Animal() {
        System.out.println("Animal constructor called");
    }

    void speak() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    Dog() {
        super(); 
        System.out.println("Dog constructor called");
    }
}

public class Mainn {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.speak();

    }
}