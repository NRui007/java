package basics.dataType;

public class RoundErrors {
    public static void main(String... args) {
        double a = 0.7;
        double b = 0.9;
        double x = a + 0.1;
        double y = b - 0.1;

        // 输出 x is 0.7999999999999999
        System.out.println("x is " + x);
        // 输出 y is 0.8
        System.out.println("y is " + y);
    }
}