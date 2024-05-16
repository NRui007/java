package oop;

public class FinalVariable {
    final int num;

    public FinalVariable() {
        this.num = 0;
    }

    public static void main(String[] args) {
        FinalVariable variable = new FinalVariable();
        System.out.println(variable.num);
    }
}
