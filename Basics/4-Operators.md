# Operators in Java

## 1. 算术运算符 Arithmetic Operators

- \* : 乘法
- / : 除法
- % : 模运算
- \+ ：加法
- \- ：减法

Examples:
```java
public class ArithmeticOperators {
    public static void main(String... args) {
        // Arithmetic operators
        int a = 10;
        int b = 3;
      
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
```

## 2. 一元运算符 Unary Operators

- \- ： 负运算符Unary minus
- \+ ： 正运算符Unary plus
- ++ : 自增运算符Increment Operator, 使自身值+1
    - Pre-Increment Operator: 先使用后自增
    - Post-Increment Operator: 先自增后使用
- -- : 自减运算符Decrement Operator, 使自身值-1
    - Pre-Decrement Operator: 先使用后自减
    - Post-Decrement Operator: 先自减后使用
- ! : 逻辑非Logical Not Operator, 用于转换布尔值

Examples:
```java
public class AutoCrementOperators {
    public static void main(String[] args) {
        // 变量声明
        int a = 10, b = 10;
        
        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}
```

Output:
> Postincrement : 10
Preincrement : 12
Postdecrement : 10
Predecrement : 8

## 3. 赋值运算符 Assignment Operators 二元

- = : 赋值运算符, 从右向左传递，=右边的值赋给=左边的变量
- 复合赋值运算符 Compound Assignment Operators，与算术运算符结合
    - += : a = a + 5 ===> a += 5
    - -= ：a = a - 5 ===> a -= 5
    - *= ：a = a * 5 ===> a *= 5
    - /= ：a = a / 5 ===> a /= 5
    - %= ：a = a % 5 ===> a %= 5

Examples: 
```java
public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i is " + i);
        System.out.println("i += 3 is " + (i += 3));
        System.out.println("i -= 2 is " + (i -= 2));
        System.out.println("i *= 4 is " + (i *= 4));
        System.out.println("i /= 3 is " + (i /= 3));
        System.out.println("i %= 2 is " + (i %= 2));
    }
}
```

Output:
> i is 10
i += 3 is 13
i -= 2 is 11
i *= 4 is 44
i /= 3 is 14
i %= 2 is 0

## 4. 关系运算符 Relational Operators 二元

关系运算符用于检测等价、大于或者小于等关系，并返回boolean类型的结果。

- ==(等价于Equal to)：两操作数相等返回true，否则false
- !=(不等于Not Equal to): 两操作数不等返回true，否则false
- \>(大于Greater than): 第一个操作数大于第二个操作数返回true，否则false
- \<(小于Less than): 第一个操作数小于第二个操作数返回true，否则false
- \>=(大于等于Greater than or equal to): 第一个操作数大于等于第二个操作数返回true，否则false
- \<=(小于等于Less than or equal to): 第一个操作数小于等于第二个操作数返回true，否则false

Examples:
```java
public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));
        System.out.println("a == c is " + (a == c));
        System.out.println("a != c is " + (a != c));
    }
}
```

Output:
> a > b is true
a < b is false
a >= b is true
a <= b is false
a == c is false
a != c is true

## 5. 逻辑运算符 Logical Operators

- &&(逻辑与Logical And): 仅当两个操作数都为true时，返回true，否则为false
- ||(逻辑或Logical Or): 仅当两个操作数都是false时，返回false，否则为true
- !(逻辑非Logical Not)：转换布尔值

> Notes：
> 1. 逻辑运算符要求操作数类型为**boolean**，且返回**boolean**类型的结果
> 2. &&和||运算符是二元运算符，!是一元运算符
> 3. &&和||运算符都会进行**短路运算**

Examples:
```java
public class LogicalOperators {
    public static void main(String[] args) {
        // declare boolean variables
        boolean t = true, f = false;
        System.out.println("t is " + t + ", f is " + f);
        
        // logical operation &&
        System.out.println("t && t is " + (t && t));
        System.out.println("t && f is " + (t && f));
        System.out.println("f && t is " + (f && t));
        System.out.println("f && f is " + (f && f));

        // logical operation ||
        System.out.println("t || t is " + (t || t));
        System.out.println("t || f is " + (t || f));
        System.out.println("f || t is " + (f || t));
        System.out.println("f || f is " + (f || f));

        // logical operation !
        System.out.println("!t is " + (!t));
        System.out.println("!f is " + (!f));

        // Logic short circuit
        int i = 10;
        System.out.println("f && (i++ == 10) is " + (f && (i++ == 10)));
        System.out.println("i is " + i);

        System.out.println("t || (i++ == 10) is " + (t || (i++ == 10)));
        System.out.println("i is " + i);
    }
}
```

Output:
> t is true, f is false
t && t is true
t && f is false
f && t is false
f && f is false
t || t is true
t || f is true
f || t is true
f || f is false
!t is false
!f is true
f && (i++ == 10) is false
i is 10
t || (i++ == 10) is true
i is 10

## 6. 问号运算符 Ternary Operator 三元

**基本结构：**
> condition ? if true : if false
> 其中condition返回**boolean**类型的值，当其值是true时，执行if true处语句；当其值时false时，执行if false出的语句
> 因此，?三元表达式可以看作是一个简略的if-else结构

Examples:
```java
public class TernaryOperator {
    public static void main(String[] args) {
        // find the maximum in three numbers
        int a = 10, b = 20, c = 30;
        int max = a > b ? (a > c ? a : c ) : (b > c ? b : c);
        System.out.println("the maximum is " + max);
    }
}
```

Output:
> the maximum is 30

## 7. 位运算符 Bitwise Operators 

在计算机中，所有的数据都是用二进制表示，只有0和1两种值。位运算就是直接针对于该值的运算。

- &(与): **1 & 1 = 1；** 1 & 0 = 1；0 & 1 = 0；0 & 0 = 0. 
- |(或): 1 | 1 = 1; 1 | 0 = 1; 0 | 1 = 0; **0 | 0 = 0**
- ^(异或): **1 ^ 1 = 0;** 1 ^ 0 = 1; 0 ^ 1 = 1; **0 ^ 0 = 0**
- ~(非): !1 = 0; !0 = 1

Examples:
```java
public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 0b0000;
        int b = 0b1111;
        int c = 0b0101;
        int d = 0b1010;
        System.out.println("a is " + a + ", b is " + b + ", c is " + c + ", d is " + d);

        // bitwise and operator
        System.out.println("a & b is " + (a & b));
        System.out.println("c & d is " + (c & d));
        System.out.println("c & b is " + (c & b));
        System.out.println("d & b is " + (d & b));

        // bitwise or operator
        System.out.println("a | b is " + (a | b));
        System.out.println("c | d is " + (c | d));
        System.out.println("a | c is " + (a | c));
        System.out.println("a | d is " + (a | d));

        // bitwise xor operator
        System.out.println("a ^ b is " + (a ^ b));
        System.out.println("c ^ d is " + (c ^ d));

        // bitwise not operator
        System.out.println("~a is " + (~a));

        // boolean + bitwise operator
        boolean b1 = true, b2 = true;
        System.out.println(b1 & b2);
    }
}
```

Output:
> a is 0, b is 15, c is 5, d is 10
a & b is 0
c & d is 0
c & b is 5
d & b is 10
a | b is 15
c | d is 15
a | c is 5
a | d is 10
a ^ b is 15
c ^ d is 15
~a is -1
true

**Notes:**
> **位运算的操作数不能为double和float**
> **当位运算的操作数是boolean类型时返回结果也是boolean**
> **位运算的机制实现需了解有符号二进制补码、原码和反码的原理及其之间的转换**

## 8. 位移运算符 Shift Operators

位移运算符也属于位运算符，也是直接在数据的底层进行操作

- <<(左移运算符Left Shift Operator): 将2进制层面的数字向左移动，右边空出的位用**0**补充，达到乘以2的次方数的效果
- \>>(算术右移Signed Right Shift Operator): 将2进制层面的数字向右移动，左边空出的位用其**符号位**补充，达到除以2的次方数的效果。正数和零的符号是0，负数是1
- \>>>(逻辑右移Unsigned Right Shift Operator): 将2进制层面的数字向右移动，左边空出的位用其**0**补充

Examples: 
```java
public class ShiftOperators {
    public static void main(String[] args) {
        // left shift operator
        System.out.println("16 << 1 is " + (16 << 1));
        System.out.println("-16 << 1 is " + (-16 << 1));

        // signed right shift operators
        System.out.println("16 >> 2 is " + (16 >> 2));
        System.out.println("-16 >> 2 is " + (-16 >> 2));

        // unsigned right shift operator
        System.out.println("16 >>> 2 is " + (16 >>> 2));
        System.out.println("16 >>> 2 is " + (-16 >>> 2));
    }
}

```

Output:
> 16 << 1 is 32
-16 << 1 is -32
16 >> 2 is 4
-16 >> 2 is -4
16 >>> 2 is 4
16 >>> 2 is 1073741820

**Notes:**
> 1. 无符号整数和有符号整数的概念。在Java中，整数是二进制有符号补码表示
> 2. 逻辑位移是不考虑符号位的，而算术右移是需要考虑符号位的，否则会使得符号位不正确
> 3. 逻辑左移和算术左移都是在右边补0，二者等效因此统一叫做左移
> 4. 对于有符号的整数中的正数和零来说，其符号位是0，因此其逻辑右移和算术右移等效
> 5. 对于有符号的整数中的负数来说，其符号位是1，逻辑右移会使其符号位变为0，改变正负
> 6. 位移运算前将数据长度变为32位了吗？？？ 待确定todo

**Analysis：**
> 以上文16和-16为例，
> 16的二进制补码表示为0b0001 0000, -16的二进制补码表示为0b1111 0000
> 左移 16 << 1 = 0b0010 0000 = 32, -16 << 1 = 0b1110 0000 = -32
> 算术右移 16 >> 2 = 0b0000 0100 = 4, -16 >> 2 = 0b1111 1100 = -4
> 逻辑右移 16 >>> 2 = 0b0000 0100 = 4, -16 >>> 2 = 0x3FFF FFFC = 1073741820

## 9. 类型检测 Instanceof

**instanceof被用来判断一个对象是不是某一类，某个子类或者接口实现**

Examples: 
```java
public class InstanceofOperator {
    public static void main(String[] args) {
        Cat eToyCat = new EToyCat();
        System.out.println("eToyCat instanceof EToyCat is " + (eToyCat instanceof EToyCat));
        System.out.println("eToyCat instanceof EToy is " + (eToyCat instanceof EToy));
        System.out.println("eToyCat instanceof Cat is " + (eToyCat instanceof Cat));
        System.out.println("eToyCat instanceof Object is " + (eToyCat instanceof Object));

        Cat cat = new Cat();
        System.out.println("cat instanceof EToyCat is " + (cat instanceof EToyCat));
        System.out.println("cat instanceof EToy is " + (cat instanceof EToy));
        System.out.println("cat instanceof Cat is " + (cat instanceof Cat));
        System.out.println("cat instanceof Object is " + (cat instanceof Object));
    }
}

class EToyCat extends Cat implements EToy {

}

class Cat {

}

interface  EToy {

}
```

Output:
> eToyCat instanceof EToyCat is true
eToyCat instanceof EToy is true
eToyCat instanceof Cat is true
eToyCat instanceof Object is true
cat instanceof EToyCat is false
cat instanceof EToy is false
cat instanceof Cat is true
cat instanceof Object is true

**Object**是所有类的父类

# 运算符的优先级和结合性 Precedence and Associativity of Java Operators

## Rules

1. 优先级不同，先计算优先级高的；
2. 优先级相同，根据结合性从左到右或从右到左计算
3. 在Java中不使用逗号运算符，其只用来分割表达式


**优先级从高到低排序为：**
| **运算符** | **结合性**|
| :--------------------: | :----: |
| []、.、()(方法调用) | 从左向右 |
| !、~、++、--、new、+(一元运算，正号)<br>-(一元运算，负号)、()(强制类型转换) |**从右向左** | 
| *、\、% | 从左向右 |
| +、- | 从左向右 |
| <<、>>、>>> | 从左向右 |
| <、<=、>、>=、instanceof | 从左向右 |
| ==、!= | 从左向右 |
| & | 从左向右 |
| ^ | 从左向右 |
| \| | 从左向右 |
| && | 从左向右 |
| \|\| | 从左向右 |
| ?: | **从右向左** |
| =、+=、-=、/=、%=、<br>&=、\|=、^=、<<=、>>=、>>>= | **从右向左** |

Examples:
```java
public class ComputationOrder {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

        // precedence rules for arithmetic operators.
        // (* = / = %) > (+ = -)
        System.out.println("a+b/d = " + (a + b / d));

        // if same precedence then associative
        // e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
        System.out.println("a+b*d-e/f = "
                + (a + b * d - e / f));
    }
}
```

Output:
> a+b/d = 20
a+b*d-e/f = 219

## Use +

因为+运算符既可以用做加法，也可以用来拼接字符串，当它们混合使用时可能会产生意外的情况

Examples:
```java
public class ComplexPlusOperator {
    public static void main(String[] args) {
        int x = 2, y = 3;
        System.out.println(x + y + " is equal to " + x + y + "?");
    }
}
```

Output:
> 5 is equal to 23?

**Analysis**
> 因为+运算符和自身优先级相同，因此在上述运算中根据+运算符的结合性来看，会从左向右进行计算
> 1. 计算 x + y;x和y都是整数，其结果就是5；
> 2. 计算5 + " is equal to ", 因为后者是字符串因此会进行字符串拼接，产生新的字符串
> 3. 计算"5 is equal to " + x, 因为前者是字符串因此还是进行字符串拼接，产生新字符串 
> 4. 计算"5 is equal to 2" + y，同上
> 5. 计算"5 is equal to 23" + "?", 二者都是字符串同样进行拼接
> 6. 输出"5 is equal to 23?"

## Compiler

编译器使用词法工具拆解代码语句。某些情况我们认为可以成功的语句，编译器会编译失败

Examples:
```java
public class CompilerErrorOperator {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 0;

        // 编译成功，解析为 a, =, b, ++, +, c;
        a = b+++c;
        System.out.println(a);

        // 编译失败，解析为a, =, b, ++, ++, +, c;
        // ++是右结合，第二个++没有操作数
        // a = b+++++c;
    }
}
```
