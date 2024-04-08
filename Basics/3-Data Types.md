[TOC]

# 原始数据类型 Primitive Data Types

## 数字类型 Numeric Data Types

### 整数类型 Integer

#### 1. byte

- 有符号二进制补码整数
- 默认值为0
- 8bits
- 值域：-128~127 同-2^7~2^7-1
- Syntax：
    ```java
    public class ByteType {
        static public void main(String[] args) {
            // byte赋值
            // 编译不报错
            byte byteVar1 = 127;
            System.out.println("byteVar1 is " + byteVar1);
            
            // 编译报错: 不兼容的类型: 从int转换到byte可能会有损失
            // byte byteVar2 = 128;
            // System.out.println("byteVar2 is " + byteVar2);
            // 虽然127是int类型，但是如果该值范围在byte值域内，编译器会将其自动转换，不会编译报错, 而128超出byte范围就不会进行自动转换，因为自动转换过程中可能会丢失精度，需要强转

            // 编译不报错，控制台输出byteVar3, 显示-128
            byte byteVar3 = (byte) 128;
            System.out.println("byteVar3 is " + byteVar3);
        }
    }
    ```

#### 2. short

- 有符号二进制补码整数
- 默认值为0
- 16bits
- 值域：-32768~32767 同-2^15~2^15-1
- Syntax：
    ```java
    public class ShortType {
        static public void main(String[] args) {
            // short赋值
            // 编译不报错
            short shortVar1 = 32767;
            System.out.println("shortVar1 is " + shortVar1);
            
            // 编译报错: 不兼容的类型: 从int转换到short可能会有损失
            // short shortVar2 = 32768;
            // System.out.println("shortVar2 is " + shortVar2);
            // 虽然32767是int类型，但是如果该值范围在short值域内，编译器会将其自动转换，不会编译报错,
            // 而32768超出short范围就不会进行自动转换，因为自动转换过程中可能会丢失精度，需要强转

            // 编译不报错，控制台输出shortVar3, 显示-32768
            short shortVar3 = (short) 32768;
            System.out.println("shortVar3 is " + shortVar3);
        }
    }
    ```

#### 3. int

- 有符号二进制补码整数
- 默认值为0
- 32bits
- 值域：-2,147,483,648~2,147,483,647 同-2^31~2^31-1
- Syntax：
    ```java
    public class IntType {
        static public void main(String[] args) {
            // int赋值
            int intVar = 2147483647;
            System.out.println("intVar is " + intVar);
        

            // 整数超出int范围的值，编译报错：过大的整数: 2147483648
            // 不能直接表示，需要将其转化为long
            // System.out.println(2147483648);
            System.out.println(2147483648l);
        }
    }
    ```
- java中数字默认是int类型，如果使用超出int范围的数字，就会直接编译报错，需要将其转换为long类型
- 在java 8SE及其之后版本，int的封装类Integer中可以表示**无符号**32位整数

#### 4. long

- 有符号二进制补码整数
- 默认值为0
- 64bits
- 值域：-2^63~2^63-1
- Syntax：
    ```java
    public class LongType {
        static public void main(String[] args) {
            // long赋值
            long longVar = 2147483648L;
            System.out.println("longVar is " + longVar);
        }
    }
    ```
- 同Integer, long的封装类Long也支持无符号64位整数，并支持数学运算
- java中，整数默认类型是int，如果需要给表示超出int范围的整数，需要在其后面加上l或者L，推荐L，因为小写字母l易于数字1混淆

### 浮点数类型 Decimal

#### 5. float

- IEEE 754 浮点数
- 默认值为0.0
- 单精度 32bits
- 值域:支持最多7位小数位
- Syntax:
    ```java
    public class FloatType {
        public static void main(String... args) {
            // float赋值
            float floatVar = 3.33f;
            System.out.println(floatVar);

            // 编译报错：不兼容的类型: 从double转换到float可能会有损失
            // float f = 3.33;
        }
    }
    ```
- 一般用于节约内存的场景

#### 6. double

- IEEE 754 浮点数
- 默认值为0.0
- 双精度 64bits
- 值域:支持最多16位小数位
- Syntax:
    ```java
    public class DoubleType {
        public static void main(String... args) {
            // double赋值
            double doubleVar = 3.33;
            System.out.println("doubleVar is " + doubleVar);
        }
    }
    ```
- java中，浮点数的默认类型是double类型，如果需要给float类型赋值，需要在浮点数后加上f或者F，表示其为float类型
- **float和double类型都专门为科学计算而设计，它们计算的近似误差是允许的。如果对于精度有着更高要求，需要使用BigDecimal类**

#### 舍入误差 Rounding off errors

> 多数程序数的存储长度最多为32位或者64位，而将无限小数表示为有效位数的小数则需要进行一个近似的表示，而做不到精确表示.
> 对于给定位数的小数，他们之间的运算也不能在如此位数中做到精确表示，因此他们的计算结果也往往会进行舍入.

```java
public class RoundErrors {
    public static void main(String... args) {
        double a = 0.7;
        double b = 0.9;
        double x = a + 0.1;
        double y = b - 0.1;

        // 输出 x is 0.7999999999999999
        System.out.println("x is " + x);
        // 输出 y is 0.8
        System.out.println("y is " + y);
    }
}
```

因为float和double都遵循IEEE 754浮点数表达规则，而0.1用IEEE 754规则表示为:
$ 0.1 = (0.000110011001100110011001100110011001100110011001100110011001… )_2 $
不能用有限的位数表示，计算出来的结果也就有了舍入误差

**如何纠正舍入误差**

> 1. **Round the result:** 四舍五入计算需要的小数位。例如一般涉及到金额的计算，需保留到小数点后两位
> 2. **Algorithms and Functions:**  使用成熟的数学算法或者设计你自己的函数去处理这种情况
> 3. **BigDecimal class:** BigDecimal提供精确度更高的计算

## 非数字类型 Non-Numeric Data Type

#### 7. boolean

- 逻辑正确与否
- 默认值为 false
- 一般认为是 1bit，但是实际大小依赖于JVM
- 值域: {true, false}
- Syntax:
    ```java
    public class BooleanType {
        public static void main(String... args) {
            // boolean 赋值
            boolean trueValue = true;
            System.out.println("trueValue is " + trueValue);
            boolean falseValue = false;
            System.out.println("falseValue is " + falseValue);
        }
    }
    ```
- boolean类型不能转换为其他类型，也不能被其他类型转换

#### 8. char

- Unicode character 统一码字符
- 默认值为 \u0000
- 16bits
- 值域：Unicode字符集不仅仅只有ASCII字符集，还包括其他几十个字符集。到2022年9月截止，unicode字符集已经有超过14万字符了，这也是为什么java中char选择了16bits存储。而传统的C/C++，char都只用8bit表示，因为它只包括ASCII字符集
- Syntax:
    ```java
    public class CharType {
        public static void main(String... args) {
            // char赋值
            char a = '1';
            char b = 'c';
            char c = '王';
            char d = ';';
        }
    }
    ```

# 非原始数据类型 Non-Primitive Data Type or Reference Data Type

引用数据类型并不直接存储变量的值，而是存储一个指向其值的内存地址

#### 1. String

> String被定义为一组字符；String和字符数组的区别是：
> - String保存字串字符在一个变量中;
> - 而character array一组单个字符实体的集合
> 
> 不像C/C++，Java String不会用空字符结尾，即Java中字符串的长度就是它的真正长度

> Syntax:
> ```java
> public class StringType {
>   public static void main(String[] args) {
>       // Declare String without using new operator 
>       String s = "GeeksforGeeks"; 
>       // Declare String using new operator 
>       String s1 = new String("GeeksforGeeks"); 
>   }
> }
> ```

#### 2. Class

> 类class是对象的蓝本或模板。
> 它的定义一般有如下几部分：
> 1. Modifiers: class和interface只能被public和default修饰；只有**nested class和interface**可以用private和protected修饰
> 2. ClassName: 类名需要符合标识符规则，且遵循**大驼峰**命名规则
> 3. SuperClass(可选): 父类通过**extends**关键字表示，一个类只能有**一个父类**
> 4. Interfaces(可选): 一个可以实现**多个接口**，用**implements**关键字表示该关系，多个接口之间用逗号','分隔
> 5. Body: 类主体使用大括号'{}'包围

#### 3. Object

> 对象Object是OOP的基本单元，代表着实际实体
> 它包含以下部分:
> 1. State: 它是对象的属性Properties
> 2. Behavior: 对象的方法Methods
> 3. Identity: 独一无二的对象名称--变量名，能够通过名程与其他对象交互

#### 4. Interface

> 像class一样，接口同样有变量和方法，但是这些方法只有方法签名method signature(返回类型 函数名(参数列表))，没有具体实现
> - interface说明一个类必须做什么却不实现，它是class的蓝本，比class更加abstract
> - 一个类如果implements一个接口，但没有实现该接口的所有方法，那么该类class是**abstract class**

#### 5. Array

> Array是一组有着同一个名字的同类型变量
> - Java中，所有的数组大小都是**动态分配**的
> - Java中，使用**length**属性获取数组大小；C/C++中，使用size属性获取大小
> - int[] arrays 和 int arrays[]是等效的，后者（适配从C/C++转过来的程序员）不推荐使用
> - 数组中变量在内存中地址连续分配，下标**从0开始**
> - 数组大小初始化时必须指定好，不能过长或过短
> - Array是Object的子类
> - Array实现了Cloneable和Serialiable接口

# Comparison

| **Properties** | **Primitive data types** | **Object**|
| :---: | :-----------: | :-----------: |
| 来源 | Java预定义 | 用户自定义 |
| 储存结构 | 保存在栈stack中 | 引用保存在stack中<br/>原始对象保存在堆heap中 |
| 复制 | 创建两个不同的变量<br/>赋值地址不同仅仅值相同 | 新的引用指向堆上的同一个地址 |
| 复制对象修改<br>对原变量影响 | 不受任何影响 | 会受到影响 | 
| 默认值 | 由其数据类型决定 | null | 