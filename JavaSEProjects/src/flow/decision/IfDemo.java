package flow.decision;

public class IfDemo {
    public static void main(String[] args) {
        int i = 10;

        // use {}
        if (i < 15) {
            System.out.println("Inside if block");
            System.out.println("10 is less than 15");
        }

        // not use {}
        if (i > 12)
            System.out.println("Inside if block");
            System.out.println("10 is greater than 12?");
    }
}
