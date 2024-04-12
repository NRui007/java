package basics.variable;

public class StaticBlock {
    static {
        System.out.println("This is Static Block");
    }

    public static void main(String[] args) {
        new StaticBlock();
        new StaticBlock();
    }
}
