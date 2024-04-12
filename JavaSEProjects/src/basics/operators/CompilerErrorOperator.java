package basics.operators;

public class CompilerErrorOperator {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 0;

        // 编译成功，解析为 a, =, b, ++, +, c;
        a = b+++c;
        System.out.println(a);

        // 编译失败，解析为a, =, b, ++, ++, +, c;
        // ++是右结合，第二个++没有操作数
        // a = b+++++c;
    }
}
