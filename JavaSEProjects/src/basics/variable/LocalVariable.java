package basics.variable;

public class LocalVariable {
    public LocalVariable() {
        // 构造器内局部变量
        int localVarInConstructor = 10;
    }

    public static void main(String[] args) {
        // 方法体内局部变量
        String localVarInMethod = "local variable in the main()";

        if (true) {
            // 代码块内局部变量
            double localVarInBlock = 3.2;
        }
    }
}
