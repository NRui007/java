package flow.jump;

public class ReturnWithValue {
    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new ReturnWithValue().sum(1, 2));
    }
}
