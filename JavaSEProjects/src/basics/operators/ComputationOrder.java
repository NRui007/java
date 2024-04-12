package basics.operators;

public class ComputationOrder {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        System.out.println("a+b/d = " + (a + b / d));

        // if same precedence then associative
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = "
                + (a + b * d - e / f));
    }
}
