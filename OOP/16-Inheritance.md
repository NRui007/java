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

在多级继承中主要注意的是：
> 在Java中，子类不允许直接访问Grandparent的成员和方法，只能访问父类的成员和方法。  
> 对比C++中，可以通过(::)运算符访问在继承中任意层级的类成员方法

Example:
```java
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
```

Output:
> This is grandparent  
This is parent  
This is child

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

# Instanceof Operator

- instanceof运算符简单来讲就是判断某一对象是不是某种特定类型(class、subclass、interface)
- 在继承中，子类类型的对象也是父类类型
- 如果对象是null，那么instanceof的运算结果是false

Example:
```java
class Animal {}

class Dog extends Animal {}

public class InstanceofInheritance {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);

        Dog b = new Dog();
        System.out.println(b instanceof Animal);
        System.out.println(b instanceof Dog);

        Animal c = new Animal();
        System.out.println(c instanceof Animal);
        System.out.println(c instanceof Dog);

        Dog d = null;
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Dog);
    }
}
```

Output:  
> true  
true  
true  
true  
true  
false  
false  
false

Explanation:
> 1. 对象a虽然是Animal类型的引用，但是它实际指向的对象是Dog实例，因此其既符合Animal类型又符合Dog类型
> 2. 对象b直接是Dog类型的引用，因此其是Dog类型，自然也是Animal类型
> 3. 对象c是Animal类型的引用，其实际指向的对象也是Animal，因此其是Animal类型，但是并不一定是Dog类型，也有可能是Cat、Monkey之类的
> 4. 对象d虽然是Dog类型的引用，但是其值是null，并没有指向任何对象，因此其任何类型都不是

从上述例子我们可以看到可以用Animal类型的引用指向Dog类型，那么我们可不可以将其还原为Dog类型的引用呢？

## DownCasting

当子类类型指向父类对象时就叫做DownCasting:
- 如果直接这么使用，那么就会产生编译器报错
  > Dog e = new Animal();
- 需要通过强制类型转换，才能做到DownCasting，但是这种情况下可能在运行时抛出ClassCastException
  > Dog f = (Dog) new Animal();
- 也可以通过提前使用instanceof，规避这种情况

Example:
```java
class Animal {}

class Dog extends Animal {
    static void cast(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("The animal is a dog");
        } else {
            System.out.println("The animal is probably not a dog");
        }
    }
}

public class DownCastWithInstanceof {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog.cast(a1);

        Animal a2 = new Animal();
        Dog.cast(a2);
    }
}
```

Output:
> The animal is a dog  
The animal is probably not a dog

Example:
```java
class Animal {}

class Dog extends Animal {
    static void convert(Animal animal) {
        try {
            Dog dog = (Dog) animal;
            System.out.println("The animal is a dog");
        } catch (ClassCastException e) {
            System.out.println("The animal is probably not a dog");
        }
    }
}

public class DownCastWithoutInstanceof {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog.convert(a1);
        Animal a2 = new Dog();
        Dog.convert(a2);
    }
}
```

Output:
> The animal is probably not a dog  
The animal is a dog

