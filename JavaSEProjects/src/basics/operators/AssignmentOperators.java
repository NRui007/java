package basics.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i is " + i);
        System.out.println("i += 3 is " + (i += 3));
        System.out.println("i -= 2 is " + (i -= 2));
        System.out.println("i *= 4 is " + (i *= 4));
        System.out.println("i /= 3 is " + (i /= 3));
        System.out.println("i %= 2 is " + (i %= 2));
    }
}