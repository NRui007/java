package oop.polymorphism;

class AddCalculator {
    static int add(int a, int b) {
        return a + b;
    }

    // 参数数量重载
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 参数类型重载
    static double add(double a, double b) {
        return a + b;
    }

    // 参数类型重载
    static double add(int a, double b) {
        return a + b;
    }

    // 参数类型重载
    static double add(double b, int a) {
        return a + b;
    }
}

public class MethodOverload {
    public static void main(String[] args) {
        int a = 10, b = 20;
        double c = 10.0, d = 20.0;
        System.out.println(AddCalculator.add(a, b));
        System.out.println(AddCalculator.add(a, d));
        System.out.println(AddCalculator.add(c, b));
        System.out.println(AddCalculator.add(c, d));
    }
}
