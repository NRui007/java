[TOC]

# Output in Java

## System.out.println in Java

System.out.println在Java中被用来打印传递给其的一个参数

### Syntax

> System.out.println(parameter);

其中:
1. **System**: 它是一个被定义在java.lang package中的final class
2. **out**: printStream的一个实例，是System中的public static成员
3. **println()**: 所有的printStream都有一个public的方法println(),它会打印被传入的参数并添加上一个换行符。
4. 我们可以认为System.out代表着**标准输出流Standard Output Stream**

注:
> 就像System.out一样，Java还提供了另外两个标准或默认输入输出流：
> 1. **System.in**: 用于从键盘或其他标准输入设备读取字符
> 2. **System.err**: 用于输出程序可能抛出的错误数据到屏幕或其他标准输出设备

Example:
```java
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStream {
    public static void main(String[] args) throws IOException {
        // Standard Input Stream
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        // Standard Output Stream
        System.out.println(s);

        // Standard Error Stream
        System.err.println("if existing errors, please use err stream to print");
    }
}
```

Output:
> 143512  
143512  
if existing errors, please use err stream to print

### Overload of Println()

重载Overload允许不同的方法有着相同的方法名，但是参数数量和类型不同，还有参数顺序不同的影响

- println(): 无参数输出换行符
- println(boolean x): 输出true or false + 换行符
- println(char x): 输出x + 换行符
- println(int x): 输出x + 换行符
- println(long x): 输出x + 换行符
- println(float x): 输出x + 换行符 
- println(double x): 输出x + 换行符
- println(char[] x): 输出字符串 + 换行符
- println(String x): 输出字符串 + 换行符
- println(Object x): 调用x的toString方法并输出该字符串 + 换行符

Example:
```java
package io;

public class PrintlnOverload {
    public static void main(String[] args) {
        // println null
        System.out.println();
        // println char
        System.out.println('a');
        // println int
        System.out.println(1);
        // println long
        System.out.println(100L);
        // println float
        System.out.println(1.0f);
        // println double
        System.out.println(3.14159265358979);
        // println char[]
        char[] chs = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(chs);
        // println String
        String str = "abc";
        System.out.println(str);
        // println Object
        Test test = new Test();
        System.out.println(test);
    }
}

class Test {
    @Override
    public String toString() {
        return "Test";
    }
}
```

Output:
> ''
> 
> a  
> 1  
> 100  
> 1.0  
> 3.14159265358979  
> abcdef  
> abc  
> Test  

## Difference between print() and println()

- print(): 打印文本到控制台，并且光标移动到**文本末尾**。下一次打印将从此处开始
  - methods:
    - print(boolean x)
    - print(char x)
    - print(int x)
    - print(long x)
    - print(float x)
    - print(double x)
    - print(char[] x)
    - print(String x)
    - print(Object x)
- println(): 同样将文本打印到控制台，并且光标移动到下一行的开始。下一次打印将从此处开始
  - methods: 基本与print()方法类似，不过println()多了一个没有参数的方法
    - println(): 打印一个空行，光标移动到下一行
    - println(boolean x)
    - println(char x)
    - println(int x)
    - println(long x)
    - println(float x)
    - println(double x)
    - println(char[] x)
    - println(String x)
    - println(Object x)

主要区别如下：

| **println()** | **print()** |
|:-------------:|:-----------:|
|  文本输出后会进行换行   | 文本输出后不进行换行  |
|    可以没有参数     |   必须有参数传入   |

## Redirecting System.out.println Output to a File

Syntax:
> System.set(PrintStream p);

System.out.println()一般都是被用于输出到控制台，可以通过设置out的属性值进行重定向到其他源  
而且PrintStream可以用于输出字符到文件

Example:
```java
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class RedirectOutput {
    public static void main(String[] args) throws IOException {
        // 确定输出文件
        File file = new File("./JavaSEProjects/src/io/output.log");

        if (!file.exists()) {
            System.out.println("File not found");
            System.out.println("Start creating the file");
            file.createNewFile();
        }

        // 创建日志输出流和控制台输出流
        PrintStream log = new PrintStream(file);
        PrintStream console = System.out;


        // 日志输出
        System.setOut(log);
        System.out.println("This will be written to the file.");

        // 切换控制台输出
        System.setOut(console);
        System.out.println("This will be written to the console.");
    }
}
```

Console output:
> This will be written to the console.

Output.log:
> This will be written to the file.

***注***：
> 我们可以以相似的方法使用System.out.println()向Socket的输出流中写入信息

## Formatted Output in Java Using printf()

有时，在程序中格式化输出日志是非常重要的。类似于C中的printf函数，Java中也使用printf()去格式化输出

**格式化类型**：
- 整数格式化Number Formatting
- 浮点数格式化Decimal Formatting
- 布尔值格式化Boolean Formatting
- 字符串格式化String Formatting
- 字符格式化Char Formatting
- 日期时间格式化Date and Time Formatting

### Number Formatting

整数格式化包括Integer,Long等，其中格式化标识符使用 **%d** ,且可以使用','进行分位

### Decimal Formatting

使用格式化标识符 **%f**, 并且可以指定整数位和小数位长度

### Boolean Formatting

使用格式化标识符 **%b**和 **%B**,其中%b输出true或者false，%B输出TRUE或FALSE

### Char Formatting

使用格式化标识符 **%c**和 **%C**,其中%c会将大写字母转换为小写字符, %C会将小写字母转换为大写

### String Formatting

使用格式化标识符 **%s**和 **%S**,其中%s直接输出字符串，并不能将大写字母转为小写字母；  
%S可以将小写字母转换为大写字母

### Date and Time Formatting

日期时间格式化使用更加复杂的格式化标识符

Example:
```java
package io;

import java.util.Date;

public class FormatOutput {
    public static void main(String[] args) {
        // Integer Formatting %d
        int a = 10000;
        long b = 100000L;
        System.out.printf("int format: %d%n", a);
        // , 表示用','进行分隔
        System.out.printf("long format: %,d\n", b);

        // Decimal Formatting %f
        float c = 3.25f;
        double d = 3.14159265358979323846;
        System.out.printf("float format: %f\n", c);
        System.out.printf("double format: %5.3f\n", d);
        System.out.printf("double format: %5.2f\n", d);

        // Boolean Formatting %b or %B
        boolean e = true, f = true;
        System.out.printf("boolean format: %b\n", e);
        // %B输出大写
        System.out.printf("boolean format: %B\n", f);

        // Char Formatting %c or %C
        char g = 'g';
        System.out.printf("char format: %c\n", g);
        // %C输出大写
        System.out.printf("char format: %C\n", g);

        // String Formatting %s or %S
        String str = "Hello World!";
        // %s不能将大写转为小写
        System.out.printf("String format: %s\n", str);
        // %S会将小写字母转为大写
        System.out.printf("String format: %S\n", str);

        // Date and Time Formatting
        Date time = new Date();
        System.out.printf("Date format: %tT\n", time);
        System.out.printf("Date format: Hours: %tH  Minutes: %tM Seconds: %tS\n", time, time, time);
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", time);
    }
}
```

Output:
> int format: 10000  
long format: 100,000  
float format: 3.250000  
double format: 3.142  
double format:  3.14  
boolean format: true  
boolean format: TRUE  
char format: g  
char format: G  
String format: Hello World!  
String format: HELLO WORLD!  
Date format: 17:20:41  
Date format: Hours: 17  Minutes: 20 Seconds: 41  
17:20:41 下午 330 330000000 +0800 

***注***：
> System.out.format()和printf()是等效的

## Other Methods for Formatting

### Using DecimalFormat Class

Example:
```java
package io;

import java.text.DecimalFormat;

public class DecimalFormatter {
    public static void main(String[] args) {
        double num = 123.4567;

        // 创建浮点数格式器
        DecimalFormat df;

        // 去除小数部分
        df = new DecimalFormat("####");
        System.out.println("Without fraction part: num = " + df.format(num));

        // 保留两位小数的精度
        df = new DecimalFormat("###.##");
        System.out.println("Formatted to Give precision: num = " + df.format(num));

        // 保留六位小数的精度，不足用0补
        df = new DecimalFormat("#.000000");
        System.out.println("appended zeroes to right: num = " + df.format(num));

        // 保留五位整数，两位小数，不足用0补
        df = new DecimalFormat("00000.00");
        System.out.println("formatting Numeric part : num = "
                + df.format(num));

        // 金钱格式化带千分位 添加$
        double income = 1123456.789;
        df = new DecimalFormat("$###,###.##");
        System.out.println("your Formatted Dream Income : "
                + df.format(income));
    }
}
```

Output:
> Without fraction part: num = 123  
Formatted to Give precision: num = 123.46  
appended zeroes to right: num = 123.456700  
formatting Numeric part : num = 00123.46  
your Formatted Dream Income : $1,123,456.79

### Using SimpleDateFormat Class

Example:
```java
package io;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) throws ParseException {
        // 创建简单日期格式器
        SimpleDateFormat sdf;

        // 打印日期+时间
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("formatted date + time: " + sdf.format(new Date()));

        // 打印日期
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("formatted date: " + sdf.format(new Date()));

        // 反向解析
        String str = "18/04/2024";
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(str);

        System.out.println("Parsed date: " + date);
    }
}
```

Output:
> formatted date + time: 2024-04-18 18:44:51  
formatted date: 2024-04-18  
Parsed date: Thu Apr 18 00:00:00 CST 2024