package oop.polymorphism;

class Animal {
    public void shout() {}
}

class Dog extends Animal {
    public void shout() {
        System.out.println("Dog shout");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("Cat shout");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.shout();
        Animal b = new Cat();
        b.shout();
    }
}
