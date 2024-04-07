[TOC]

# Java Hello World Program

## Creating Programs in Java

在TEXT Editor中创建源代码,生成HelloWorld.java文件

```java
// This is a simple Java program.
// FileName : "HelloWorld.java".
 
class HelloWorld {
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        System.out.println("Hello, World");
    }
}
```

## Compiling the Program

```shell
javac HelloWorld.java
```

编译后，生成HelloWorld.class字节码文件

## Running the Program

```shell
java HelloWorld

# 输出 Hello, World!
```

# Source Code Analysis

## 1. Class Define

```java
class HelloWorld {
    //
    //Statements
}
```

"HelloWorld"是类名，也是标识符。完整的类定义，他的所有成员应该在大括号内{}

## 2. main()

main方法是java程序的入口，每一个java应用都要有main方法，这时强制的

```java
public static void main(String[] args)
```

> 解释说明: 
> public: JVM可以从任意地方执行该方法
> static: 不需要实例化对象即可调用main方法，public和static可以调换位置
> void: 不需要返回值
> main(): JVM中定义的入口方法名
> String[]: 接受参数为字符串数组

## 3. Inside Statements

```java
System.out.println("Hello, World!");
```

> 解释说明: 
> System: java中一个内置类build-in class
> out: System中的一个属性，类型是输入流output stream
> println: out中的一个行为方法

## 4. 注释Comments

```java
// This is a simple Java program.
// FileName : "HelloWorld.java".
```

以上代码是单行注释，两个反斜杠/组成；而多行注释则由/\*开始，*/结束
