# Class and Object

在Java中，class和object都是OOP的基本概念，它们分别用来表示现实世界的概念体和实体。  
class代表着一组对象的集合，而对象则是拥有行为和属性的实体。  
以Dog为例，Dog代表着class，但是一只名叫“大黄”的狗就是一个Dog的object

## Class

Definition:
> 在Java中，class是一组有着共同特性/行为和共同属性的对象的集合  
> 它是对象被创建的蓝本blueprint或原型prototype

### Properties of Java Classes

1. class不是现实实体，它只是一个模板template或蓝本blueprint或原型prototype
2. class不会占用内存
3. class由一组变量和一组方法构成
4. 从语法上，class可以有以下部分构成：
    - Data member
    - Method
    - Constructor
    - Nested class
    - Interface

### Components of Java Class Declarations

通常来说，class Declaration由以下部分构成：
1. Modifier: 类只可以用public和default修饰，nested class还可以用private和protected
2. Class keyword: 指出class关键字声明创建类
3. Class name: 类名遵循标识符命名规则，且一般首字母大写，不使用$和数字（一般用于nested class和anonymous class）
4. Superclass(如果有):
   - 使用extend关键字声明继承的父类superclass
   - 一个class仅能有一个superclass
5. Interface(如果有): 
   - 使用implements关键字声明实现的接口名interface
   - 一个class可以实现多个接口，它们之间使用“,”分隔
6. Body: 
   - class body使用{}围绕
   - Constructor被用来初始化对象
   - Fields是变量，代表类或对象的状态
   - Methods用来表示类或对象的行为

***Syntax***:
```java
[public] class className [extends superclass] [implements interface1, interface2]{
    // constructor
    public className() {}
    
    // data member
    private int num;
    
    // methods
    public void test() {}
} 
```

## Object

### Definition

- object是OOP的基本单元，代表着现实实体
- object是class的一个实例，一个class可以拥有多个实例
- object之间的交互通过调用方法实现invoking methods
- object的构成：
  1. State: 通过对象的属性来表示
  2. Behavior: 通过对象的方法来实现，也代表着对象对其他对象的响应
  3. Identity: 对象独特的名字，使得能够与其他对象进行交互

### Declaring Objects(Instantiating a class)

当一个对象被创建时，可以叫做类被实例化了  
所有的instances共享class的属性和方法，但是属性的值对于每一个对象都是独特的，因为不同对象有着不同状态

Syntax:
> classType objectName;

Explanation:
> 当我们像上面这样声明一个对象，就会告诉编译器:我们会使用这个名字去关联这个类型的数据  
> 一般来说，我们不能创建抽象类abstract class和接口interface的对象  
> 当我们这样声明对象后，它的值是未定义的，为null直到对象被实际创建并赋值给它。简而言之，声明对象并不会创建对象

### Initializing Object

使用new操作符可以实例化class，它会在内存中分配一块空间给新对象，并且返回该空间的地址引用。  
并且，new还会调用类的构造器。

Example:
```java
public class Dog {
    // Instance variables
    private String name;
    private int age;
    private String color;
    private String breed;

    // Constructor
    public Dog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    // Methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // declare object and initialize it
        Dog dog = new Dog("大黄", 2, "red", "blue");
        System.out.println(dog.toString());
    }
}
```

Output:
> Dog{name='大黄', age=2, color='red', breed='blue'}

在Java中，构造器的命名和必须和类名一致，没有返回值；  
构造器可以有多个，Java编译器通过构造器参数的数量和类型来区分不同构造器  

Note:
> 所有的class都至少有一个构造器。  
> 如果一个类并没有显示的声明任何构造器，那么Java编译器会自动生成一个无参构造器，也叫做默认构造器。  
> 默认构造将会调用父类的无参构造器（如果有的话）  
> 没有父类的话，则会调用Object的构造器，因为Object是所有类的父类，无论是直接或者间接

## Ways to Create a Object of a Class

### 1. 使用use关键字

这是最常见且最通用的方法

```java
   Test t = new Test();
```

### 2. 使用Class.forName()

- Class是Java中在java.lang package中预设的一个类，  
- forName(String className)方法将会返回一个关联目标class的Class类
- 再次调用newInstance()则会返回目标class的一个实例

Example:
```java
   // 以Dog为例，它位于com.oop package
    Dog dog = (Dog) Class.forName("com.oop.Dog").newInstance();
```

### 3. 使用clone()

clone()方法位于Object类中，它能够创建并返回对象的一份部分

Example:
```java
   // 同样以Dog为例
    Dog dahuang = new Dog("大黄", 2, "red", "blue");
    Dog dahuang2 = dahuang.clone();
```

### 4. 反序列化DeSerialization

DeSerialization指的是从已保存数据的文件中读取数据恢复为object

Example:

```java
   FileInputStream file = new FileInputStream(fileName);
   ObjectInputStream in = new ObjectInputStream(file);
   Object obj = in.readObject();
```

### Create multiple Objects by one Type only

实际中，在不同方法内我们会需要一个class的不同对象。这种情况下，创建一系列的引用来保存它们通常不是很好的选择  
因此，这种情况我们声明一个静态引用来保存它，然后无论什么地方都可以访问它。 
这样，内存的开销会更小。并且那些没有被引用的对象将会被GC回收

Example:
```java
   Test t = new Test();
    t = new Test();
```

另外，在继承中，我们会用父类引用去保存子类对象。  
这种情况下，我们可以使用相同的引用变量去切换保存不同的子类对象

Example:
```java
    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}
    public class Test {
       public static void main(String[] args) {
          Animal animal = new Dog();
          animal = new Cat();
       }
    }
```

### 匿名对象Anonymous Objects

匿名对象Anonymous Objects是已经被实例化但没有保存在引用变量的对象

- 匿名对象通常用于即时方法调用
- 在方法调用结束后，它们就被销毁
- 它们广泛用于不同库

## Difference between Java Class and Object

|  **Class**   |  **Object**   |
|:------------:|:-------------:|
|   类是对象的蓝本    |    对象是类的实例    |
|  类被声明时不使用内存  |  创建对象需要分配内存   | 
| 一个类可以实例化多个对象 | 一个对象对应一个真实实体  | 
|    类是逻辑实体    |    对象是物理实体    |
|   类只能被声明一次   | 对象根据需要可以被创建多次 |
