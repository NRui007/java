package basics.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // declare boolean variables
        boolean t = true, f = false;
        System.out.println("t is " + t + ", f is " + f);
        
        // logical operation &&
        System.out.println("t && t is " + (t && t));
        System.out.println("t && f is " + (t && f));
        System.out.println("f && t is " + (f && t));
        System.out.println("f && f is " + (f && f));

        // logical operation ||
        System.out.println("t || t is " + (t || t));
        System.out.println("t || f is " + (t || f));
        System.out.println("f || t is " + (f || t));
        System.out.println("f || f is " + (f || f));

        // logical operation !
        System.out.println("!t is " + (!t));
        System.out.println("!f is " + (!f));

        // Logic short circuit
        int i = 10;
        System.out.println("f && (i++ == 10) is " + (f && (i++ == 10)));
        System.out.println("i is " + i);

        System.out.println("t || (i++ == 10) is " + (t || (i++ == 10)));
        System.out.println("i is " + i);
    }
}