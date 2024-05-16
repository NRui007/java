package oop.inheritance;

class GrandParent {
    void fun() {
        System.out.println("This is grandparent");
    }
}

class Parent extends GrandParent {
    void fun() {
        super.fun();
        System.out.println("This is parent");
    }
}

class subClass extends Parent {
    void fun() {
        // 编译报错
        // super.super.fun();

        // 只能调用直接父类的方法和成员，不能直接访问间接父类的成员和方法
        super.fun();
        System.out.println("This is child");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        new subClass().fun();
    }
}
