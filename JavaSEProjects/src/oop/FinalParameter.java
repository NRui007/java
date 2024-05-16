package oop;

public class FinalParameter {
    void fun(final int n, final String s) {
        // 编译错误，不等你分配最终参数n
//        n = n * 2;
//        s = new String("test final");
    }
}
