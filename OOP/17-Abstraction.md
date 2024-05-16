# Abstraction

在Java中，抽象指对用于隐藏实现细节，只展示实现功能。

Example:
> 电视遥控器就是一个十分突出的抽象例子。它通过隐藏按钮后的复杂实现来简化与人交互，使得更易于理解电视功能

实现抽象有两种方式：
- Abstract class(0 to 100% Abstraction)
- Interface(100% Abstraction)

## Abstract class

- 一个class被abstract关键字声明，其就是抽象类
- 抽象类既可以有抽象方法，也可以有具体方法。（抽象方法即被abstract修饰没有具体实现的方法）
- 抽象类不能被实例化
- 抽象类可以有构造器和静态方法
- 抽象类中可以使用final修饰方法，使得子类不允许修改该方法
- 抽象方法在子类必须重定义，要么重写该方法，要么子类也被abstract修饰
- 任何包含一个或多个抽象方法的类都是抽象类

Example:
```java
// 抽象类
abstract class Bike {
    // 抽象方法
    abstract void run();
}
```

### Abstract Method

abstract修饰符用于修饰方法时，不可以与以下修饰符连用：
1. final
2. native
3. synchronized
4. static
5. private
6. strict

## Interface

- interface是类的蓝本。它只有静态常量和抽象方法
- 当interface中没有member时，它叫做marker or tagged interface
- 接口中所有的方法都自动被public修饰，因此声明方法时，无需提供public关键字，都是public abstract的
- 接口中的成员都自动的设为public static final
- 从Java 8后，我们可以使用default和static修饰方法
- 从Java 9后，可以使用private修饰方法

### Why use Java Interface

1. 用于实现Abstraction
2. 通过接口，在功能上实现Multiple Inheritance
3. 实现松耦合

### Relationship between classes and interfaces

- class extend class
- class implements interface
- interface extend interface

### Default Method

从Java8后，接口中可以有default method.默认方法**可以override**

Example:
```java
interface Drawable {
    void draw();
    default void msg() {
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("rectangle overriding draw()");
    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
        r.msg();
    }
}
```

Output:
> rectangle overriding draw()  
default method

### Static Method

static Method在接口中同在类中，是不可以被overriding的.  
接口的静态方法只能通过接口名+方法名调用，不能通过类似于类的对象名+方法名调用

Example:
```java
interface Singable {
    default String getSong() {
        return "Hello World";
    }
    static void print() {
        System.out.println("This is a static method");
    }
    void sing();
}

class Walkman implements Singable {
    @Override
    public void sing() {
        System.out.println("Hello World");
    }

    // 重写print()
    static void print() {
        System.out.println("In subclass");
    }

    @Override
    public String getSong() {
        return "New Jeans";
    }
}


public class InterfaceStaticMethod {
    public static void main(String[] args) {
        Singable s = new Walkman();
        Walkman w = new Walkman();

        // static method override failure
        Singable.print();
        w.print();

        // default method override success;
        System.out.println(s.getSong());
        System.out.println(w.getSong());
    }
}
```

Output:
> This is a static method  
In subclass  
New Jeans  
New Jeans

### Nested Interface

一个Interface上中含有另一个Interface

## Differences between abstract class and interface

|    **Abstract class**    |             **Interface**             |
|:------------------------:|:-------------------------------------:|
|     既可以有抽象方法也可以有具体方法     | 只能有抽象方法<br>Java8后，可以有default和static方法 |
|          不支持多继承          |                 支持多继承                 | 
|   变量可以用final和static修饰    |    变量自动被public static final修饰作为常量     |
|          可以实现接口          |                不能实现抽象类                |
|    声明需要使用abstract关键字     |              使用interface              |
|     可以继承其他类并实现多继承接口      |               只能继承其他接口                |
| 成员变量可以是private，protected |             成员变量默认是public             |

## Advantages and Disadvantages of Abstraction

Advantages:
1. 减少可视复杂度
2. 减轻代码重复，提升复用率
3. 通过仅展现主要功能提升程序安全
4. 提高程序可维护性
5. 提高程序模块化
6. 隐藏实现细节仅暴露相关信息
7. 可以提供干净简单的接口给用户
8. 提升代码易读性
9. 在不影响用户交互接口灵活实现功能

Disadvantages:
1. 难以理解系统如果工作
2. 使用不当会增加复杂性
3. 限制实现的灵活性
4. 不恰当地使用会带来额外的开销
5. debug更加苦难
6. 过度使用抽象将会降低程序效率

