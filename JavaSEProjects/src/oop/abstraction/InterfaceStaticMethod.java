package oop.abstraction;

interface Singable {
    default String getSong() {
        return "Hello World";
    }
    static void print() {
        System.out.println("This is a static method");
    }
    void sing();
}

class Walkman implements Singable {
    @Override
    public void sing() {
        System.out.println("Hello World");
    }

    // 重写print()
    static void print() {
        System.out.println("In subclass");
    }

    @Override
    public String getSong() {
        return "New Jeans";
    }
}


public class InterfaceStaticMethod {
    public static void main(String[] args) {
        Singable s = new Walkman();
        Walkman w = new Walkman();

        // static method override failure
        Singable.print();
        w.print();

        // default method override success;
        System.out.println(s.getSong());
        System.out.println(w.getSong());
    }
}
