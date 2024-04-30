[TOC]

在Java中，在I/O package中有许多流stream，他帮助用户执行所有的java输入输出操作

# Input

有两种方法可以使Java从用户或者从文件中获取输入：

- BufferedReader Class
- Scanner Class

## BufferedReader Class for String Input

BufferedReader被用于读取字符串。它有一个简单函数用于读取单个字符，另一个读取字符串以及一个 **readLine()** 函数读取一行.

Examples:
```java
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        // create BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // reading String
        String line = bufferedReader.readLine();

        // reading Integer
        int i = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Entered String: " + line);
        System.out.println("Entered Integer: " + i);

        bufferedReader.close();
    }
}
```

Output:
> shit  
100  
Entered String: shit  
Entered Integer: 100  

InputStreamReader能够将字节流转换为字符流，因此BufferedReader能够读取，且BufferedReader会
抛出受检异常IOException

### 特性 Characteristics

1. Buffering characters能够提高读取字符、字符数组、行的效率
2. 缓冲区buffer size可以指定，也可以使用默认的大小。其默认的大小足够大，足以应对绝大多数场景
3. 通常，一个Reader的读取请求会引起一个对应的底层字符流或字节流的读写
4. 因此建议，对于需要进行读取操作的Reader来说，在其外层包装一个BufferedReader，便于更加高效处理数据，例如FileReader和InputStreamReader
5. 在Java程序中，任何文本输入的数据输入流，都有合适的BufferReader

### Constructors

- BufferedReader(Reader in):
  > 使用默认大小的输入缓冲区创建一个缓冲字符输入流
- BufferedReader(Reader in, int size):
  > 使用特定尺寸的输入缓冲区创建一个缓冲字符输入流

### Methods

- mark(int readAheadLimit):
  > 标记流中的当前位置。随后调用reset方法会使流复位到标记的位置
- markSupported():
  > 判断流是否支持mark()操作
- read():
  > 读取单个字符
- read(char[] cbuf, int off, int len):
  > 读取字符到字符数组中。  
  > 该方法实现了Reader类的通用读方法，通过在底层流重复调用该方法能够实现尽可能读更多字符
- readLine():
  > 读取一行文本。  
  > 一行被认为以'\n'、'\r'、'\r\n'结尾。  
  > 其中windows文本以\r\n结尾，被叫做CRLF;linux则为\n结尾，叫做LF
- ready():
  > 判断该流是否准备好被读取
- reset():
  > 复位到流最近被标记的点
- skip(long n):
  > 跳过n个字符
- close():
  > 关闭流，释放和流相关联的所有系统资源。  
  > 一旦流被关闭，之后的mark()、read()、ready()、reset()和skip()操作将会抛出异常  
  > 关闭一个已经被关闭的流不会有任何影响

Examples:
```java
package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDetails {
    public static void main(String[] args) throws IOException {
        // wrap BufferedReader around FileReader
        String path = "./JavaSEProjects/src/io/file.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        // mark() is supported?
        if (br.markSupported()) {
            System.out.println("mark() method is supported");
            br.mark(4);
        }

        // skip 8 characters
        br.skip(8);

        // ready to read
        if (br.ready()) {
            // readLine() method
            System.out.println(br.readLine());

            // read(char[] cbuf) ==> read(char[] cbuf, 0, cbuf.length)
            char[] ch = new char[20];
            br.read(ch);

            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]);
            }
            System.out.println();

            // 设置读取超过界限使得reset报错
//            br.read();
            // reset() method
            br.reset();

            for (int i = 0; i < 8; i++) {
                // read() method
                System.out.print((char) br.read());
            }
            System.out.println();
        }
    }
}
```

Output:
> mark() method is supported  
first line  
This is Second line  
This is 

> 异常输出：标记失效
>> mark() method is supported  
first line  
This is Second line  
Exception in thread "main" java.io.IOException: Mark invalid

## Scanner Class

- Scanner位于java.util package, 常用于接收**原始数据类型和字符串**。  
- Scanner尽管读取输入不是十分高效，但是却是**最简单**实现读取输入的方式。  

### Methods

Scanner类能够获取Java的标准输入流，因此需要一些方法从流中抽出数据

***获取数据方法：***
- nextBoolean():
- nextByte():
- nextDouble():
- nextFloat():
- nextInt():
- nextLine():
- nextLong():
- nextShort():

Examples:
```java
package io;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        // from standard input
        Scanner scanner = new Scanner(System.in);

        // various types input
        String name = scanner.nextLine();
        char gender = scanner.next().charAt(0);
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        long salary = scanner.nextLong();
        boolean married = scanner.nextBoolean();

        // print info
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Married: " + married);
    }
}
```

Input:
> 原神  
男  
20  
200  
10000  
false

Output:
> Name: 原神  
Gender: 男  
Age: 20  
Height: 200.0  
Salary: 10000  
Married: false

有时，我们还需要判断读取的下一个值是不是我们需要的值或者是否输入已经结束.  
与nextXYZ()相似，有着haxNextXYZ()的方法来判断下一个值。

Examples:
```java
package io;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int sum = 0, count = 0;

        // 判断下一个值是否是整数
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            sum += n;
            count++;
        }

        if (0 != count) {
            System.out.println("The average is " + sum / count);
        } else {
            System.out.println("No Integers were input ");
        }
    }
}
```

### Important Points About Scanner Class

- Scanner类的构造器需传入参数，一般我们传入已经定义好的对象System.in，它代表着标准输入流；我们也可以传入文件类File来读取文件
- 读取确定的数字类型XYZ，需要使用对应的nextXYZ方法
- 读取字符串String，需要使用nextLine()
- 读取单个字符，需要使用next().charAt(0)，其中：
  - next()代表读取下一个word/token
  - charAt(0)代表获取字符串的第一个字符
- Scanner类读取完整一行并将其划分为多个tokens。token是java编译器中的最小元素

## Differences between BufferedReader and Scanner Class

1. BufferedReader是异步的，而Scanner不是。在多线程中使用BufferedReader
2. BufferedReader默认是8kb的缓冲存储器，而Scanner只有1kb，但也足够了
3. BufferedReader处理速度更快，因为Scanner做了后处理，需要解析数据类型，而BufferedReader只是简单读取了字符串
4. 在读取方式上也有着不同，如下

Examples:
```java
package io;

import java.util.Scanner;

public class DifferenceInScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer & String ");
        int a = sc.nextInt();
        String b = sc.nextLine();

        System.out.println("You have entered: " + a + " and " + b);
    }
}
```

Input1:
> 10(换行符)

Output1:
> You have entered: 10 and

Input2:
> 10 idea

Output2:
> You have entered: 10 and idea

***Explanation:***
> 在Scanner类中，nextXXX()类型的方法并不会使用换行符，而nextLine()方法会读取直到换行符  
> 因此在nextXXX()方法后如果跟上nextLine()方法，如果想要合理生效，可以额外增加一个nextLine()方法去消费换行符进行下一行输入  
> nextXXX()包括next(),nextByte(),nextShort(),nextInt(),nextLong(),nextFloat(),nextDouble(),nextBoolean()

Examples:
```java
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferenceInBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a String");
        String  s = br.readLine();

        System.out.println("You have entered " + a + " and " + s);
    }
}
```

Input and Output:
> Enter an integer  
10  
Enter a String  
idea  
You have entered 10 and idea

可以看见BufferedReader读取就不会出现该问题

## Ways to read input from console

### Using BufferedReader Class

使用InputStreamReader去包装System.in,再用BufferedReader去包装InputStreamReader

### Using Scanner Class

常用于读取Primitive data types和String

### Using Console Class

1. 读取密码类文本不会***反显***字符串
2. 读取方法是异步的
3. 能够使用格式化字符串语法
4. 不能再非交互环境中(例如IDE)使用

Examples:
```java
package io;

import java.io.Console;

/**
 * 使用Console类读取输入
 */
public class ConsoleInput {
    public static void main(String[] args) {
        Console console = System.console();
        // 在IDE中运行, console is null
        if (console == null) {
            System.out.println("No console available");
        } else {
            // readLine会回显字符
            String input = console.readLine();
            System.out.println("You have entered: " + input);

            // readPassword不会回显字符
            char[] password = console.readPassword();
            System.out.println("You have entered: " + new String(password));
        }

    }
}
```

Input and Output:
> 7899  
> You have entered: 7899
> 
> You have entered: 2222

### Using Command Line arguments

通过main方法从console传入参数，都已String格式接收，如果需要其他类型数据再进行转换

Examples:
```java
package io;

public class CommandLineInput {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments provided");
        } else {
            System.out.println("Provided command line arguments: ");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
```

Command Line:
```shell
java io.CommandLineInput command line input
```

Output:
> Provided command line arguments:  
command  
line  
input

### Using DataInputStream class

DataInputStream是实现数据输入操作的Java类。它允许应用程序以独立于机器的方式从输入流中读取原始数据类型和字符串。它通过包装现有的输入流并提供从基础输入源读取各种原始数据类型和字符串的方法来实现这一点。

请记住，DataInputStream以二进制格式读取数据，因此确保正在读取的数据是使用DataOutputStream中的正确方法或兼容源写入的，以避免数据损坏或误解。

