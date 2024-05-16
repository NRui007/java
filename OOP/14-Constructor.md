# Constructor

## Definition

- Java构造器是类似method一样的代码块
- 当创建类的实例时就会调用构造器
- 在调用构造器的同时，会在内存上给对象分配空间
- 构造器可以认为是一种用来初始化对象的特殊方法
- 每一次使用new()来创建对象时，至少有一个构造器被调用

## How Java Constructors are different from Java Methods

- 构造器的名字必须和其类名一致；方法名则没有这种限制
- 构造器没有返回类型，方法则有返回类型或者void
- 构造器尽在队形创建时被调用一次；方法可以被调用多次

## Rules for writing Constructors

- 构造器名和其类名一致
- 构造器不能被abstract, final, static, Synchronized修饰
- 访问修饰符可以修饰构造器，用来控制该类对象创建

## Types of Constructors

### Default Constructor

- 一般来说，无参构造器就是默认构造器
- 如果类中没有显示声明构造器，那么编译器就会创建一个默认构造器
- 默认构造器一般用于给对象提供默认值

### Parameterized Constructor

- 有着确定数量的参数的构造器叫做参数化构造器
- 参数化构造器一般用于给独特的对象提供不同的值

### Copy Constructor

- 复制构造器严格来讲也是参数化构造器
- 复制构造器的参数是另一个对象，它的目的就是创建该对象的另一个副本
- 在Java中，类中是没有的默认的内嵌复制构造器；像C++中，其实是有的

### Constructor Overloading

构造器就像是没有返回类型的方法，他也是可以被重载的。  
编译器通过参数列表来区分不同构造器

Example:
```java
public class ConstructorOverloading {
   public static void main(String[] args) {
      Student student1 = new Student();
      System.out.println(student1);

      Student student2 = new Student(16,"Jack");
      System.out.println(student2);

      Student student3 = new Student(15, "Mary", 46.2);
      System.out.println(student3);
   }
}

class Student {
   int age;
   String name;
   double height;

   public Student() {
   }

   public Student(int age, String name, double height) {
      this.age = age;
      this.name = name;
      this.height = height;
   }

   public Student(int age, String name) {
      this.age = age;
      this.name = name;
   }

   @Override
   public String toString() {
      return "Student{" +
              "age=" + age +
              ", name='" + name + '\'' +
              ", height=" + height +
              '}';
   }
}
```

Output:
> Student{age=0, name='null', height=0.0}  
Student{age=16, name='Jack', height=0.0}  
Student{age=15, name='Mary', height=46.2}

## Others

1. 构造器能否被private修饰呢？
    > 可以的，使用private修饰构造器可以限制对象的创建，用于单例模式
2. 构造器没有返回类型，那有返回值吗？
    > 有的，它返回了当前类的实例，因此是可以在构造器中使用return的
