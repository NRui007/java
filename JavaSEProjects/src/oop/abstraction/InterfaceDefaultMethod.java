package oop.abstraction;

interface Drawable {
    void draw();
    default void msg() {
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("rectangle overriding draw()");
    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        r.msg();
    }
}
