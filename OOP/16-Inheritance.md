# Inheritance

继承是OOP的重要支柱之一。它是指这样一种机制：允许一个类通过继承的方式使用另外一个类的方法和属性  

## Why need Java Inheritance

- Code Reusability: 子类可以使用父类中的方法
- Method Overriding: 方法重载只能通过继承实现，而正好重载是实现Runtime Polymorphism的一种方式
- Abstraction: 通过继承我们可以不需要提供方法细节，只提供其实现功能给用户

## Using Inheritance in Java

在Java中，extend关键字可以用来实现继承，但需要注意：  
> 在继承中，当子类对象被创建时，不会有对应的独立的父类对象被创建，只有子类对象被创建  
> 虽然子类对象被创建时调用了父类构造器，这有别于“构造器调用便意味着一个对象被创建”的一般假定。  
> 因此我们不能忙目地说，每当构造器执行时，就会创建一个对象

Example:
```java
public class OnlySubObject {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.print();
    }
}

class Fruit {
    public Fruit() {
        System.out.println("super class constructor");

        System.out.println("super class hashcode : " + this.hashCode());

        System.out.println(this.getClass().getName());
    }

    void print() {
        System.out.println(this);
    }
}

class Apple extends Fruit {
    public Apple() {
        System.out.println("subclass constructor");

        System.out.println("subclass hashcode : " + this.hashCode());

        System.out.println(this.getClass().getName());
    }

    void print() {
        super.print();
        System.out.println(this);
    }
}
```

Output:  
> super class constructor  
super class hashcode : 460141958  
Apple  
subclass constructor  
subclass hashcode : 460141958  
Apple  
Apple@1b6d3586  
Apple@1b6d3586

Explanation:
> 从父类和子类的hashcode可以看出，它们是一样的值，因此只有一个对象被创建  
> 并且通过print()方法，打印出两个引用指向的同一个内存地址

## Inheritance Types

### 1. Single Inheritance

- Single Inheritance指的是子类只继承一个父类。
- 类A通过extend关键字继承类B

### 2. Multilevel Inheritance

Multilevel Inheritance指的是：
> 类A继承类B，而类B又是类C的子类  
> 类C是base class，类B是intermediatory class，类C是derived class

### 3. Hierarchical Inheritance

Hierarchical Inheritance指的是：
> 一个超类有着多个子类

### 4. Multiple Inheritance(Through Interfaces)

- Multiple Inheritance指的是一个类可以拥有多个父类。
- 但是在Java中，是不允许只在classes之间实现多继承的，只能通过interfaces来实现多继承
- Java中不允许使用class来实现多继承，因为当在不同父类中有相同的方法，那么在调用时就会产生歧义

当涉及到多接口时，如果其中有同名方法，在实现中也会产生其他问题？

1. 同名方法返回类型也相同，可以认为是一个方法
2. 同名方法返回类型不同，这被看作两个方法，子类需要分别实现

Example:
```java
interface A {
    void fun();
}

interface B {
    void fun();
}

interface C extends A, B {

}

public class MultipleInheritance implements C {
    @Override
    public void fun() {
        System.out.println("success!");
    }

    public static void main(String[] args) {
        new MultipleInheritance().fun();
    }
}
```

Output:
> success!

Explanation:
> 因为A1和B1的方法签名相同，返回类型相同，可以认为是一个方法

### 5. Hybrid Inheritance

- Hybrid Inheritance指的是两种或多种继承类型的混合
- 因为Java不支持Multiple Inheritance，因此涉及到该种类型的Hybrid Inheritance也是不支持的
- 想要实现带Multiple Inheritance的Hybrid Inheritance也只能通过interface实现

## IS-A Relationship

Inheritance就代表着IS-A关系：
- 对于类A extend 类B，我们就可以说A是一种B
- 对于类A implements 接口C，可以说A是C的（C是形容词）

## What Can we do in a Subclass

- 被继承的属性可以直接使用
- 可以在子类中声明新的属性，补充继承与父类的属性
- 被继承的方法也可以直接使用
- 可以在子类中重写父类的方法，方法签名需一致
- 可以在子类中创建一个与父类相同签名的静态方法，可以隐藏掉父类的静态方法
- 可以在子类中创建新的方法
- 可以在子类构造其中调用父类构造器，无论是隐式或者通过super()显示调用

## Disadvantages of Inheritance

1. Complexity: Inheritance使得代码更加复杂难以理解，尤其是在继承层级深的情况
2. Tight Coupling: 很难在不影响子类的情况下对父类进行修改，子类和父类之间是强耦合的

## Other Conclusion

- Default superclass: 除了Object类外，所有的类都有父类。对于大多数没有显示声明父类的情况下，它都是Object的子类
- Superclass can only be one: 一个子类只能有一个父类
- Inheriting constructor: 子类能够继承父类的属性、方法、nested classes,但不能继承构造器，不过可以调用父类构造器
- Private member inheritance: 子类不能继承父类的private成员

    