[TOC]
# Java Variables

## 变量定义 What are Variables

- 在Java中，变量Variable是内存地址的一个名称
- 在程序执行过程中，变量即某个内存地址中储存的值是会改变的
- 变量仅仅只是赋予某个内存地址的名字；所有在变量上的操作影响的都是内存地址
- 在Java中，所有变量都需要先声明后使用

## 变量声明 Declare Variables

**Syntax**:
```java
    dataType dataName;
```

1. **dataType**: 存储在变量中的数据类型
2. **dataName**: 变量名称

## 变量赋值 Variable Assignment

### 1. Variable Initialization

- 支持**先声明后初始化**和**声明并初始化**两种方式
- 变量名属于标识符，且命名规则应该遵循**小驼峰**规则

**Syntax**:
```java
    /*
      dataType: 数据类型
      varName: 变量名称
      value： 初始化值
    */

    // 声明并初始化
    dataType varName1 = value;

    // 先声明并初始化
    dataType varName2;
    varName2 = value;
```

### 2. Assigning Value by taking input

例如函数方法参数传递获取初始值，后续在Methods章节说明

## 变量类型 Types of Variables

### 1. 局部变量 Local Variables

1. 声明位置：代码块内、方法内、构造器内
2. 生命周期：进入代码块或调用方法，局部变量被创建；退出代码块或者方法返回，局部变量被销毁
3. 访问限制：只能在变量声明后的代码块内
4. 初始化：局部变量**强制性**要求**使用前须初始化**

Examples:
```java
public class LocalVariable {
    public LocalVariable() {
        // 构造器内局部变量
        int localVarInConstructor = 10;
    }

    public static void main(String[] args) {
        // 方法体内局部变量
        String localVarInMethod = "local variable in the main()";

        if (true) {
            // 代码块内局部变量
            double localVarInBlock = 3.2;
        }
    }
}
```

### 2. 实例变量 Instance Variables

1. 声明位置：类内但是在方法、构造器、代码块外
2. 生命周期：随着对象被创建而创建，随着对象被销毁而销毁
3. 访问限制：不像local variables, 实例变量通过访问修饰符进行控制。如果不使用访问修饰符，为default级别
4. 初始化：实例变量的初始化**不是强制**的。如果没有初始化，那么实例变量随着对象创建后给予默认值，它的默认值由其数据类型决定
5. 实例变量只能通过创建对象的方式去访问
6. 初始化方式：
    - 构造器Constructor初始化
    - **匿名块Instance Block**初始化


Examples:
```java
public class InstanceVariable {
    // 不同数据类型的实例变量
    int age;
    String name;

    // 构造器初始化
    public  InstanceVariable() {
        this.age = 18;
        this.name = "Bob";
    }
}

```

### 3. 静态变量或类变量或全局变量 Static Variables or Class Variables

1. 声明位置：同实例变量，在类内但是在方法、构造器、代码块外，但需要static关键字修饰
2. 生命周期：随着程序开始加载被创建，程序终止自动销毁
3. 访问限制：一样受修饰符控制
4. 初始化：不强制，默认值由其数据类型决定
5. **无论创建多少个对象，类中的静态变量只有一个副本，所有对象共同使用这一个副本的静态变量**
6. 静态变量可以通过类名访问，也可以通过对象名访问（不推荐，编译器警告），且编译器会自动将对象名替换为类名
7. 静态变量不能在实例方法中**重复声明**，区别与可以在实例方法中声明一个与实例变量相同类型和名称的局部变量
8. 初始化方式： **静态块Static Block**初始化

Examples：
```java
public class StaticVariable {
    // 声明静态变量
    public static int num;
    public static String staticVar = "This is a static variable";

    private static char ch = '牛';
}

class Test {
    public static void main(String[] args) {
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

```

Test类编译后的字节码如下，可以看到通过对象名访问的num已经被替换为静态变量
```java
class Test {
    Test() {
    }

    public static void main(String[] args) {
        System.out.println("static variable is not initialized and its value is " + StaticVariable.num);
        System.out.println(StaticVariable.staticVar);
        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        StaticVariable.num = 20;
        System.out.println(StaticVariable.num);
    }
}
```

### 静态变量 VS 实例变量

1. 每个对象都有自己的实例变量副本；但每种类都只有一份静态变量的副本，无论创建多少对象。因此说明静态变量更易于**内存管理**
2. 一个对象的实例变量改变不会影响其他对象的实例变量副本；但是静态变量的改变会影响到同一类的所有对象
3. 实例变量只能通过对象名访问，静态变量还能通过类名访问
4. 实例变量随着对象被创建而创建，随着对象被销毁而销毁；静态变量随着程序运行而创建，随着程序停止而销毁

### Instance Block VS Static Block

#### Instance Block

Instance block在Java中被定义为匿名方法，可以在其中创建逻辑。

- 声明位置：定义在类内但是在方法体和构造器外
- 执行时机：只在对象被创建时**执行一次**
- 优劣：
    - 优点：可以抽出多个构造器的公共代码
    - 缺点：无法接收参数
- 在一个class中如果有多个Instance Block，会从上往下依次执行

Examples：
```java
package basics.variable;

public class InstanceBlock {
    int num;

    // Instance Block
    {
        num = 10;
        System.out.println("num is " + num);
        System.out.println("Instance Block");
    }

    public InstanceBlock() {
    }

    public InstanceBlock(int num) {
        this.num = num;
        System.out.println("num is " + this.num);
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock(50);
    }
}
```

Output:
> num is 10  
Instance Block  
num is 10  
Instance Block  
num is 50  

**Instance Block与构造器执行顺序:**
> 以具有父类的子类为例：
> 1. 父类Instance Block
> 2. 父类构造器Constructor
> 3. 当前类Instance Block
> 4. 当前构造器Constructor

Examples：
```java
public class InstanceBlockOrder extends ParentClass{
    {
        System.out.println("This is Current Instance Block");
    }

    public InstanceBlockOrder() {
        System.out.println("This is Current Constructor");
    }

    public static void main(String[] args) {
        new InstanceBlockOrder();
    }
}

class ParentClass {
    {
        System.out.println("This is Parent Instance Block");
    }

    public ParentClass() {
        System.out.println("This is Parent Constructor");
    }
}
```

Output:
> This is Parent Instance Block  
This is Parent Constructor  
This is Current Instance Block  
This is Current Constructor

> 注：当调用构造器时，编译器会将Instance Block部分拷贝到构造器的super()语句之后，super()是默认是构造器的第一行语句，然后继续执行。因此Instance Block的执行顺序一定在构造器之前；而在进行子类构造之前须调用父类构造器，而父类Instance Block又在父类构造器前执行。

#### Static Block

Static Block的结构是用static关键字修饰的Instance Block，叫做Static Block,也叫做static clause

- 声明位置：定义在类内但是在方法体和构造器外, 且用static关键字修饰
- 执行时机：只在**类**被第一次加载到内存中时执行一次

Examples:
```java
public class StaticBlock {
    static {
        System.out.println("This is Static Block");
    }

    public static void main(String[] args) {
        new StaticBlock();
        new StaticBlock();
    }
}

```

Output:
> This is Static Block

#### Sequence of Execution

1. Static Block
2. Instance Block
3. Constructor

Examples:
```java
package basics.variable;

public class SequenceOfExecution {
    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static Block");
    }

    public SequenceOfExecution() {
        System.out.println("Constructor");
    }
}

class SequenceTest {
    public static void main(String[] args) {
        new SequenceOfExecution();
    }
}
```

**执行添加-XX:+TraceClassLoading参数输出类加载信息**

Output:
> [Loaded basics.variable.SequenceOfExecution from file:/E:/JavaSEProjects/out/]  
Static Block  
Instance Block  
Constructor

# Instance Variable Hiding

存在以下两种情况，只需**变量名相同**即可，变量类型不需要相同：
1. subclass Instance Variable hides superclass Instance Variable
2. local variable hides instance variable

Examples:
```java
package basics.variable;

public class InstanceVariableHide extends ParentInstanceVariableHide{
    char value = 'c';

    void printValue() {
        double value = 0.0;
        System.out.println("Value of local variable is " + value);
        System.out.println("Value of instance variable is " + this.value);
        System.out.println("Value of superclass instance variable is " + super.value);
    }

    public static void main(String[] args) {
        InstanceVariableHide hideVar = new InstanceVariableHide();
        hideVar.printValue();
    }
}

class ParentInstanceVariableHide {
    int value = 10;
}
```

Output:
> Value of local variable is 0.0  
Value of instance variable is c  
Value of superclass instance variable is 10