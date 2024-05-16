package oop.inheritance;

public class DownCastWithoutInstanceof {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog.convert(a1);
        Animal a2 = new Dog();
        Dog.convert(a2);
    }
}
