package oop;

public class ProveThis {
    void printThisAddress() {
        System.out.println(this);
    }
    public static void main(String[] args) {
        ProveThis proveThis = new ProveThis();
        System.out.println(proveThis);
        proveThis.printThisAddress();
    }
}
