package basics.dataType;

public class IntType {
    static public void main(String[] args) {
        // int赋值
        int intVar = 2147483647;
        System.out.println("intVar is " + intVar);
    

        // 整数超出int范围的值，编译报错，
        // 不能直接表示，需要将其转化为long
        // System.out.println(2147483648);
        System.out.println(2147483648l);
    }
}