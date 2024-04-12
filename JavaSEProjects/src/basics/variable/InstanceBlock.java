package basics.variable;

public class InstanceBlock {
    int num;

    // Instance Block
    {
        num = 10;
        System.out.println("num is " + num);
        System.out.println("Instance Block");
    }

    public InstanceBlock() {
    }

    public InstanceBlock(int num) {
        this.num = num;
        System.out.println("num is " + this.num);
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock(50);
    }
}
