package oop.inheritance;

interface A {
    void fun();
}

interface B {
    void fun();
}

interface C extends A, B {

}

public class MultipleInheritance implements C {
    @Override
    public void fun() {
        System.out.println("success!");
    }

    public static void main(String[] args) {
        new MultipleInheritance().fun();
    }
}
