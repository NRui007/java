package basics.variable;

public class StaticVariable {
    // 声明静态变量
    public static int num;
    public static String staticVar = "This is a static variable";

    private static char ch = '牛';
}

class Test {
    public static void main(String[] args) {
        System.out.println("=====================");
        StaticVariable var;
        System.out.println("=====================");
        // 类名访问静态变量, num未进行初始化,其值是默认值为0
        System.out.println("static variable is not initialized and its value is " + StaticVariable.num);
        System.out.println(StaticVariable.staticVar);
        // 不能访问private static variable
//        System.out.println(StaticVariable.ch);

        // 所有对象共用静态变量的一个副本
        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        // 对象名访问静态变量
        staticVariable1.num = 20;
        System.out.println(staticVariable2.num);
    }
}
