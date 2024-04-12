package basics.operators;

public class AutoCrementOperators {
    public static void main(String[] args) {
        // 变量声明
        int a = 10, b = 10;
        
        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}