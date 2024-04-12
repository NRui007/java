package basics.operators;

public class TernaryOperator {
    public static void main(String[] args) {
        // find the maximum in three numbers
        int a = 10, b = 20, c = 30;
        int max = a > b ? (a > c ? a : c ) : (b > c ? b : c);
        System.out.println("the maximum is " + max);
    }
}
