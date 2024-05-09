[TOC]

# 基本术语 Basic terminologies

> - Class: 蓝本；拥有共同方法的变量的逻辑模板
> - Object：类的一个实例；拥有行为和状态的实体
> - Method：对象的行为方法
> - Instance Variables: 每个对象独一无二的状态，通过给属性赋值来实现

**Example:**
```java
public class GFG {
    public static void main(String[] args) {
        System.out.println("GeekForGeeks");
    }
}
```

# 语法 Syntax

## 1. 注释 Comments

### 单行注释 Single Line Comment

```java
// System.out.println("This is an comment.");
```

### 多行注释 Multi-line Comment

```java
/*
    System.out.println("This is the first line comment.");
    System.out.println("This is the second line comment.");
*/
```

### 文档注释 Documentation Comment 简称 Doc Comment

```java
/** documentation */
```

## 2. 源码名称 Source File Name

> 源文件名称必须精确地匹配上.java文件中的public class的类名；
> 如果没有.java中没有public class，那么文件名可以与其他类名不同.

## 3. 大小写敏感 Case Sensitivity

## 4. 类名 Class Names

> i. 类名首字母应该大写（小写是可以的，但不推荐）

> ii. 对于多个单词组成的类名，内部的每个单词的首字母应该大写。其中可以使用下划线，但是不推荐
>  
> iii. 数字和美元符$也是可以使用的，但是也不推荐，因为这两种一般用于内部类和匿名类

## 5. public static void main(String[] args)

> main()方法是java程序的主要入口；也可以被写作public static void main(String... args),可变参数的写法

## 6. 方法名 Method Names

> i. 方法名首字母应该小写（大写是可以的，但不推荐）
>
> ii. 多个单词遵循小驼峰命名规则
>
> iii. 下划线允许使用，但不推荐；数字和$也可以使用

## 7. 标识符 Identifiers in Java

> 在java中，标识符不仅包括局部变量local variables, 实例变量和静态变量instance and class variables, 以及标签labels；还包括类名，包名，模块名(如label)和方法名。
>
> 它们都遵循如下规则：
> 1. 所有的标识符都必须以字母、美元符$或者下划线_开头。根据惯例约定，变量名小写字母开头
> 2. 首字母后，可以跟着由字母、数字、下划线和美元符的组合，但不推荐使用下划线。其中常量Constant(由static final修饰的变量和Enum)应该所有字母大写，单词间用下划线连接
> 3. 标识符大小写敏感
> 4. 关键字不能用做标识符

## 8. 空白 White Space in Java

> 空白行编译器会自动忽略

## 9. 修饰符 Modifiers

- **访问修饰符Access Modifiers**: private，protected，public，default（没有使用就是default）
- **非访问修饰符Non-Access Modifiers**：final, abstract, static, transient, synchronized, volatile, native.

### 访问修饰符 Access Modifiers

| Access Modifier | 	Within Class | 	Within Package | Outside Package by subclass only | 	Outside Package |
|:---------------:|:-------------:|:---------------:|:--------------------------------:|:----------------:|
|     Private     |      yes      |       no        |                no                |        no        |
|     Default     |      yes      |       yes       |                no                |        no        |
|    Protected    |      yes      |       yes       |               yes                |        no        |
|     Public      |      yes      |       yes       |               yes                |       yes        | 

## 10. 关键字 Keywords

1. 数据类型data type(8)：
    - numeric type(6): 
        * Integer: byte, short, int, long
        * Decimal: float, double
    - non-numeric type(2)
        * boolean
        * char
2. special value(4):
    - boolean values: true, false
    - null
    - void
3. 修饰符modifiers(10):
    - access modifiers(3): public, protected, private
    - non-access modifiers(7): final, abstract, static, transient, synchronized, volatile, native
4. 程序控制语句flow control in Java(12):
    - Decision-Making(6):
        * if-else: if, else, instanceof
        * switch: switch, case, default
    - Loop(3): for, do, while
    - break, continue, return
5. 类(7)：
    - types: class, enum, interface, abstract
    - relationships: extend, implements
    - new
6. 异常处理exception handling(5):
    - try, catch, final
    - throw, throws
7. 包相关package(2):
    - import, package
8. 变量引用(2):
    - this, super
9. 保留字(2):
    - goto, const
10. 其他(1):
    - assert




