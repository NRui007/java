package basics.variable;

public class InstanceBlockOrder extends ParentClass{
    {
        System.out.println("This is Current Instance Block");
    }

    public InstanceBlockOrder() {
        System.out.println("This is Current Constructor");
    }

    public static void main(String[] args) {
        new InstanceBlockOrder();
    }
}

class ParentClass {
    {
        System.out.println("This is Parent Instance Block");
    }

    public ParentClass() {
        System.out.println("This is Parent Constructor");
    }
}
