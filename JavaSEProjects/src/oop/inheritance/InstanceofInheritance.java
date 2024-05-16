package oop.inheritance;

class Animal {}

class Dog extends Animal {
    static void cast(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("The animal is a dog");
        } else {
            System.out.println("The animal is probably not a dog");
        }
    }

    static void convert(Animal animal) {
        try {
            Dog dog = (Dog) animal;
            System.out.println("The animal is a dog");
        } catch (ClassCastException e) {
            System.out.println("The animal is probably not a dog");
        }
    }
}

public class InstanceofInheritance {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);

        Dog b = new Dog();
        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Dog);

        Animal c = new Animal();
        System.out.println(c instanceof Animal);
        System.out.println(c instanceof Dog);

        Dog d = null;
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Dog);
    }
}
