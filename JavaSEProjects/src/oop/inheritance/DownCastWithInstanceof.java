package oop.inheritance;

public class DownCastWithInstanceof {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog.cast(a1);

        Animal a2 = new Animal();
        Dog.cast(a2);
    }
}
