package oop.inheritance;

public class OnlySubObject {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.print();
    }
}

class Fruit {
    public Fruit() {
        System.out.println("super class constructor");

        System.out.println("super class hashcode : " + this.hashCode());

        System.out.println(this.getClass().getName());
    }

    void print() {
        System.out.println(this);
    }
}

class Apple extends Fruit {
    public Apple() {
        System.out.println("subclass constructor");

        System.out.println("subclass hashcode : " + this.hashCode());

        System.out.println(this.getClass().getName());
    }

    void print() {
        super.print();
        System.out.println(this);
    }
}
