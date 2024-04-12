package basics.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 0b0000;
        int b = 0b1111;
        int c = 0b0101;
        int d = 0b1010;
        System.out.println("a is " + a + ", b is " + b + ", c is " + c + ", d is " + d);

        // bitwise and operator
        System.out.println("a & b is " + (a & b));
        System.out.println("c & d is " + (c & d));
        System.out.println("c & b is " + (c & b));
        System.out.println("d & b is " + (d & b));

        // bitwise or operator
        System.out.println("a | b is " + (a | b));
        System.out.println("c | d is " + (c | d));
        System.out.println("a | c is " + (a | c));
        System.out.println("a | d is " + (a | d));

        // bitwise xor operator
        System.out.println("a ^ b is " + (a ^ b));
        System.out.println("c ^ d is " + (c ^ d));

        // bitwise not operator
        System.out.println("~a is " + (~a));

        // boolean + bitwise operator
        boolean b1 = true, b2 = true;
        System.out.println(b1 & b2);
    }
}
