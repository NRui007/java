package flow.jump;

public class ReturnWithoutValue {
    void sum(double a, double b) {
        System.out.println(a + b);
    }

    void lessThan9(int x) {
        if (x < 9) {
            System.out.println(x + " is less than 9");
            return;
        } else {
            System.out.println(x + " is greater than or equal to 9");
            ++x;
        }
        System.out.println("x is " + x);
    }

//    void notReachable(double x) {
//        return;
//        // ++x不可达，会引起编译报错
//        ++x;
//    }

    public static void main(String[] args) {
        ReturnWithoutValue r = new ReturnWithoutValue();
        r.sum(9, 9);
        r.lessThan9(8);
    }
}
