package basics.variable;

public class InstanceVariableHide extends ParentInstanceVariableHide{
    char value = 'c';

    void printValue() {
        double value = 0.0;
        System.out.println("Value of local variable is " + value);
        System.out.println("Value of instance variable is " + this.value);
        System.out.println("Value of superclass instance variable is " + super.value);
    }

    public static void main(String[] args) {
        InstanceVariableHide hideVar = new InstanceVariableHide();
        hideVar.printValue();
    }
}

class ParentInstanceVariableHide {
    int value = 10;
}
