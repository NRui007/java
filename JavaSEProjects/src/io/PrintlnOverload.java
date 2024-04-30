package io;

public class PrintlnOverload {
    public static void main(String[] args) {
        // println null
        System.out.println();
        // println char
        System.out.println('a');
        // println int
        System.out.println(1);
        // println long
        System.out.println(100L);
        // println float
        System.out.println(1.0f);
        // println double
        System.out.println(3.14159265358979);
        // println char[]
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(chs);
        // println String
        String str = "abc";
        System.out.println(str);
        // println Object
        Test test = new Test();
        System.out.println(test);
    }
}

class Test {
    @Override
    public String toString() {
        return "Test";
    }
}
