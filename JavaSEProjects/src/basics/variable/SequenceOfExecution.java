package basics.variable;

public class SequenceOfExecution {
    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }

    public SequenceOfExecution() {
        System.out.println("Constructor");
    }
}

class SequenceTest {
    public static void main(String[] args) {
        new SequenceOfExecution();
    }
}