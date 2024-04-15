[TOC]

# 包装类 Wrapper Classes in Java

包装类Wrapper Class的实例化对象包装或者包含了原始数据类型；当我们创建实例化包装类时，它有着一个可以存储原始数据类型的属性，换句话说，包装类可以存储原始数据类型的值在它的对象中。

## 为什么需要使用包装类 Need of Wrapper Classes

1. 当我们需要在方法Method中去修改参数类型的值时，就需要将原始数据类型转换为对象。因为原始数据类型是**值传递**，而引用数据类型是**引用传递**。
2. java.util 包中的类只能处理对象
3. Collection框架中的数据结构，如ArrayList和Vector仅仅能存储对象，不能存储原始数据类型
4. 在**多线程**中对象支持异步

## 封装类的优点 Advangtages of Wrapper Classes

1. 可以使用Collection框架
2. 可以使用对象中的多个方法，例如compareTo(), equals(), toString()
3. 克隆只支持对象
4. 对象允许null值
5. 只有对象能够**序列化和反序列化Seriablization**

## 原始数据类型及其包装类

| **Primitive Data Type** | **Wrapper Class** |
| :----: | :----: |
| char | Character |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| boolean | Boolean |

Examples:
```java
package basics.variable;

import java.sql.SQLOutput;

public class WrapperClass {
    public static void main(String[] args) {
        // print primitive data types
        char ch1 = 'a';
        boolean bo1 = true;
        byte b1 = 2;
        short s1 = 155;
        int i1 = 123;
        long l1 = 456L;
        float f1 = 3.14f;
        double d1 = 5.65;

        System.out.println("print primitive data types:  ");
        System.out.println("char values: " + ch1);
        System.out.println("boolean values: " + bo1);
        System.out.println("byte values: " + b1);
        System.out.println("short values: " + s1);
        System.out.println("int i values: " + i1);
        System.out.println("long values: " + l1);
        System.out.println("float values: " + f1);
        System.out.println("double values: " + d1);

        // print wrapper class object
        Character ch2 = new Character(ch1);
        Boolean bo2 = new Boolean(bo1);
        Byte b2 = new Byte(b1);
        Short s2 = new Short(s1);
        Integer i2 = new Integer(i1);
        Long l2 = new Long(l1);
        Float f2 = new Float(f1);
        Double d2 = new Double(d1);

        System.out.println("print wrapper class object:");
        System.out.println("Character Object: " + ch2);
        System.out.println("Boolean Object: " + bo2);
        System.out.println("Byte Object: " + b2);
        System.out.println("Short Object: " + s2);
        System.out.println("Integer Object: " + i2);
        System.out.println("Long Object: " + l2);
        System.out.println("Float Object: " + f2);
        System.out.println("Double Object: " + d2);
    }
}
```

Output:
> print primitive data types:  
char values: a
boolean values: true
byte values: 2
short values: 155
int i values: 123
long values: 456
float values: 3.14
double values: 5.65
print wrapper class object
Character Object: a
Boolean Object: true
Byte Object: 2
Short Object: 155
Integer Object: 123
Long Object: 456
Float Object: 3.14
Double Object: 5.65

## 自动装箱与拆箱 AutoBoxing and UnBoxing

1. AutoBoxing
    > 原始数据类型自动转换为其对应的包装类叫做自动装箱
2. Unboxing
    > 包装类自动转换为其对应的原始数据类型叫做拆箱


Examples:
```java
package basics.variable;

import java.util.ArrayList;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        // AutoBoxing int -> Integer
        int i = 100;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i);

        // Unboxing
        Character ch = 'a';
        char c = ch;
    }
}
```