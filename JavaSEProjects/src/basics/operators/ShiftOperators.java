package basics.operators;

public class ShiftOperators {
    public static void main(String[] args) {
        // left shift operator
        System.out.println("16 << 1 is " + (16 << 1));
        System.out.println("-16 << 1 is " + (-16 << 1));

        // signed right shift operators
        System.out.println("16 >> 2 is " + (16 >> 2));
        System.out.println("-16 >> 2 is " + (-16 >> 2));

        // unsigned right shift operator
        System.out.println("16 >>> 2 is " + (16 >>> 2));
        System.out.println("-16 >>> 2 is " + (-16 >>> 2));

        byte b = -16;
        Object o = b >>> 1;
        long c = 0x8000000000000000L;
        o = c >>> 1;
        System.out.println(c);
        System.out.println(c >> 1);
        System.out.println(o);
        System.out.println(o.getClass().getName());
    }
}
