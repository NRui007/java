# Flow Control

> Java编译器从上到下执行代码，但也提供了流程控制语句来控制执行流程

## Decision-Making

### if statement

if语句是最简单的判断语句：它被用于判断一个确定语句或者代码块是否被执行

Syntax:
```java
if (condition) {
    // When condition is true
    // statements to execute
}
```

> 经过计算，condition会是一个boolean值，如果其值是true，则“{}”内的代码块会被执行  
> 如果我们不提供“{}”，那么只有跟在if语句后的一条语句才算在块内

Examples:
```java
public class IfDemo {
    public static void main(String[] args) {
        int i = 10;

        // use {}
        if (i < 15) {
            System.out.println("Inside if block");
            System.out.println("10 is less than 15");
        }

        // not use {}
        if (i > 12)
            System.out.println("Inside if block");
            System.out.println("10 is greater than 12?");
    }
}
```

Output:
> Inside if block  
10 is less than 15  
10 is greater than 12?

### if-else statement

Syntax:
```java
if (condition) {
    // When condition is true 
    // executes this block    
} else {
    // When condition is false
    // executes this block    
}
```

> 当condition计算后返回的值是true时，执行if block中的语句，  
> 否则返回的值是false时，执行else block中的语句

Examples：
```java
import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer");
        int a = scanner.nextInt();

        if (a > 100) {
            System.out.println("a is greater than 100");
        } else {
            System.out.println("a is less than 100");
        }
        scanner.close();
    }
}
```

Output:
> Please input an integer  
12  
a is less than 100 

### nested-if statement

Syntax:
```java
if (condition1) {
    // Executes when condition1 is true
    if (condition2) {
        // Executes when condition2 is ture    
    }    
}
```

> 嵌套if语句即在一个if语句中的执行块中添加if语句  
> 一般nested-if语句也就两三层  
> 过深的嵌套语句会降低效率，需要优化写法

Examples:
```java
import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input an integer");
        int i = in.nextInt();

        if (i < 100) {
            if (i >= 50) {
                System.out.println(i + " is greater than or equal to 50 and less than 100");
            }

            if (i < 50) {
                System.out.println(i + " is less than 50");
            }
        } else {
            System.out.println(i + " is greater than 100");
        }

        in.close();
    }
}

```

Output:
> Please input an integer  
78  
78 is greater than or equal to 50 and less than 100

### if-else-if ladder statement

Syntax:
```java
if (condition1)
    statement;
else if (condition2)
    statement;
...
else if (conditionN)
    statement;
else 
    statement;
```

> 1. if-else-if语句用于在多个选项中选择一种
> 2. 当某个条件被允许后，该条件对应的语句块被执行；其他语句块则跳过
> 3. 一个if语句可以对应多个else-if语句，但只能有一个else语句，也可以没有else语句

Examples:
```java
import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your scores");
        double n = in.nextDouble();

        if (n < 60) {
            System.out.println("Your score is fail");
        } else if (n < 80) {
            System.out.println("Your score is pass");
        } else if (n < 90) {
            System.out.println("Your score is good");
        } else {
            System.out.println("Your score is excellent");
        }

        in.close();
    }
}
```

Output:
> Enter your scores  
88.8  
Your score is good

### switch-case statement

switch语句同if-else-if ladder语句一样，提供了多分支结构的选择语句，是一种更加简单的方式

Syntax:
```java
switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  ...
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}
```

> 1. expression的数据类型可以是byte,short,int,char或者枚举。从JDK7开始，类型也可是String
> 2. case对应的value值不允许重复
> 3. default语句可选
> 4. break语句用于中断语句执行
> 5. 如果没有break语句，将会在匹配case后继续执行下一个case的语句

### jump statement

- Break：
  - 在switch语句中中断语句执行
  - 跳出循环
  - 作为goto的另一种形式
- Continue: 被用于在循环中强制执行下一次迭代
- Return: 在函数方法中用于显示声明返回，结束后续语句执行

## Loop in Java

循环三要素：
- **循环变量**：是一个变量，用于控制循环的次数或条件。在每次循环执行时，循环变量都会更新
- **循环条件**：是一个表达式，用于判断是否满足继续执行循环的条件。只有在循环条件为真时，循环体才会被执行
- **循环体**：是需要重复执行的代码块，可以包含多个语句或语句块。只有在循环条件为真时，循环体才会被执行

### while loop

Syntax:
```java
while (condition) {
    loop statements;
}
```

How Does a While Loop execute:
> 1. 流程进入到while循环
> 2. 跳转到condition，计算condition的结果
> 3. 如果condition是true，循环体开始执行到4；如果是false，则跳过循环体到7。  
> 4. 执行循环体
> 5. 更新循环变量
> 6. 回到流程2
> 7. 循环结束执行后续语句

while以判断condition的值为开始来决定是否执行循环体，如果为false就会直接跳过循环，因此while循环也叫做 **entry control loop**  
另外如果循环体没有被{}包围，那么循环体只是while后续跟着的第一个语句。

Examples:
```java
public class WhileDemo {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;

        // 计算1至100累加
        // num > 0 是 循环条件
        while (num > 0) {
            // 循环体被{}包围
            sum += num;
            // 更新循环变量num
            num--;
        }

        System.out.println("0 到 100累加为 " + sum);

        // 计算1到5的累乘
        int product = num = 1;
        // 循环体没有{}
        while (num <= 5)
            product *= num++;

        System.out.println("1 到 5累乘为 " + product);
    }
}
```

Output:
> 100 到 0累加为 5050  
1 到 5累乘为 120

### do while loop

Syntax:
```java
do {
    loop statements;
} while (condition);
```

do while循环和while循环相似，只是它是在执行循环体后再判断循环条件，因此它也被叫做 **Exit Control Loop**

Execution of do-while loop:
> 1. 流程进入到do-while循环
> 2. 循环体执行
> 3. 更新循环变量
> 4. 跳转到condition，计算其结果，返回必须是boolean值
> 5. 如果结果是true,跳转到流程2;结果是false,跳转到流程6
> 6. 结束do-while循环，执行后续语句

Examples:
```java
public class DoWhileDemo {
    public static void main(String[] args) {
        // 计算1~100累加
        int i = 1;
        int sum = 0;

        // 循环体有{}
        do {
            sum = sum + i;
            i++;
        } while (i <= 100);
        System.out.println("0 到 100累加为 " + sum);

        // 计算1~5累乘
        int product = i = 1;
        // 循环体没有{}
        do 
            product = product * i++;
        while (i <= 5);
        System.out.println("1 到 5累乘为 " + product);
    }
}
```

Output:
> 100 到 0累加为 5050  
1 到 5累乘为 120

### for loop

Syntax:
```java
for (initialization; condition; updation) {
    loop statements;    
}
```

Execution of for loop:
> 1. 流程进入for循环。
> 2. 执行initialization表达式，给循环变量赋初值
> 3. 跳转到condition，计算condition的值
> 4. 如果condition是true，跳转到流程5；否则，跳转到流程7
> 5. 执行循环体
> 6. 执行updation表达式，更新循环变量，回到流程3
> 7. 结束for循环，执行后续语句

Examples:
```java
public class ForDemo {
    public static void main(String[] args) {
        // 计算1~100累加
        int sum = 0;
        // 循环体有{}
        for (int x = 0; x <= 100; x++) {
            sum += x;
        }
        System.out.println("0 到 100累加为 " + sum);

        // 计算1~5累乘
        int product = 1;
        for (int i = 1; i <= 5; i++)
            product *= i;
        System.out.println("1 到 5累乘为 " + product);
    }
}
```

Output:
> 0 到 100累加为 5050  
1 到 5累乘为 120

### enhance for loop

- 增强for循环适用于JDK5及之后版本，可以用于遍历容器collection或者数组array。  
- 增强for循环使用元素进行迭代，因此使用时是不知道其下标的
- 另外，增强for循环中被遍历的元素是不允许修改的。它是只读循环
- **建议**: 如果能够使用增强for循环，尽可能的使用

Syntax:
```java
for (T element: Collection obj/array) {
    loop statements;    
}
```

Examples:
```java
public class EnhanceForDemo {
    public static void main(String[] args) {
        // 数组
        String[] names = {"Jack", "John", "Mary", "Jane", "Bob"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

Output:
> Jack  
John  
Mary  
Jane  
Bob

**增强for循环的限制**:
1. 增强for循环不适用于需要修改元素值的情况。只会修改临时变量，而不会修改原数组
2. 增强for循环不能跟踪下标
3. 增强for循环只能向前迭代
4. 增强for循环不能一次处理多个判断语句
5. 与简单for循环相比，增强for循环也有一些额外的性能开销

### pitfalls of loop 循环陷阱

1. 在实现各类循环中，一个最常见的错误就是无法退出循环，导致一直在循环中运行
2. 另外一个问题就是如果在循环中涉及到向collection中添加元素，那么可能存在内存溢出的问题

### nested loop

- 嵌套循环即在一个循环中存在另外一个循环。  
- for循环、while循环、do-while循环可以互相组合

Examples:
```java
public class NestedDemo {
    public static void main(String[] args) {
        // nested for loop
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("=============================");
        int count = 0;
        // nested while and for loop
        while (count < 2) {
            for (int i = 0; i < 3; i++) {
                System.out.println("count=" + count + ", i=" + i);
            }
            count++;
        }
    }
}
```

Output:
> i=0, j=0  
i=0, j=1  
i=0, j=2  
i=1, j=0  
i=1, j=1  
i=1, j=2  
=============================  
count=0, i=0  
count=0, i=1  
count=0, i=2  
count=1, i=0  
count=1, i=1  
count=1, i=2  

### difference of loops

|    **for loop**    |   **while loop**   | **do-while loop** |
|:------------------:|:------------------:|:-----------------:|
| 初始化可以在循环语句中也可以在循环外 |     初始化必须在循环外      |     初始化必须在循环外     | 
|    语句执行后自增就完成了     |   可以在语句执行前或后进行自增   |  可以在语句执行前或后进行自增   |
|     通常迭代体大小已知      |     通常迭代体大小未知      |     通常迭代体大小未知     |
|    初始化和循环变量更新简单    |       初始化复杂        |       初始化复杂       |
| entry control loop | entry control loop | exit control loop |
|      循环体可以不执行      |      循环体可以不执行      |     循环体至少执行一次     |
|       {}不是必须       |       {}不是必须       |       {}是必须       |

## jump

### continue

在循环中，当遇到continue语句时，控制流程会直接跳转到该循环的下一次迭代开始的地方，而不会执行当前迭代  
continue语句通常用于需要跳过特定条件的场景

- 在for循环中，continue语句会强制跳转到更新语句模块
- 在while或do-while循环中，continue语句会立即跳转到condition语句

Syntax:
```java
  continue;
```

Examples:
```java
public class ContinueDemo {
  public static void main(String[] args) {
    System.out.println("continue in for loop");
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.print(i + " ");
    }
    System.out.println();

    System.out.println("continue in while loop");
    int num = 0;
    while (num < 10) {
      num++;
      if (num % 2 == 1) {
        continue;
      }
      System.out.print(num + " ");
    }
    System.out.println();

    System.out.println("continue in do-while loop");
    do {
      num--;
      if (num % 3 != 0) {
        continue;
      }
      System.out.print(num + " ");
    } while (num > 0);
    System.out.println();

    System.out.println("continue in nested loop");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i != j)
          continue;
        System.out.println("i = " + i + ", j = " + j);
      }
    }
  }
}
```

Output:
> continue in for loop  
1 3 5 7 9  
continue in while loop  
2 4 6 8 10  
continue in do-while loop  
9 6 3 0  
continue in nested loop  
i = 0, j = 0  
i = 1, j = 1  
i = 2, j = 2

### break

Syntax:
```java
  break;
```

在Java中，break有以下三种主要用法
- 中断switch语句
- 结束循环
- goto的另一种实现形式

Example 1: break in switch statement
```java
public class BreakInSwitch {
  public static void main(String[] args) {
    int n = 2;
    // 不使用break中断switch语句
    switch (n) {
      case 1:
        System.out.println("1");
      case 2:
        System.out.println("2");
      case 3:
        System.out.println("3");
      default:
        System.out.println("default");
    }

    System.out.println("=========================");
    // 使用break中断switch语句
    switch (n) {
      case 1:
        System.out.println("1");
        break;
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
      default:
        System.out.println("default");
    }
  }
}
```

Output 1:  
> 2  
3  
default  
=========================  
2

从Output 1可以看到，使用break语句执行case 2的语句后不再执行后续语句

Example 2: break in loop
```java
public class BreakInLoop {
    public static void main(String[] args) {
        // 单层循环
        System.out.println("break in single loop");
        for (int i = 0; i < 10; i++) {
            if (i == 3)
                break;
            System.out.print(i + " ");
        }
        System.out.println();

        // nested loop
        System.out.println("break in nested loop");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1)
                    break;
                for (int k = 0; k < 3; k++) {
                    if (k == 2)
                        break;
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}
```

Output:
> break in single loop  
0 1 2  
break in nested loop  
i = 0, j = 0, k = 0  
i = 0, j = 0, k = 1  
i = 1, j = 0, k = 0  
i = 1, j = 0, k = 1  
i = 2, j = 0, k = 0  
i = 2, j = 0, k = 1

值得注意的是，当break处于nested loop中时，break是跳出其当前最深的一层循环而不是外层循环

Example 3: break as a form of goto
```java
public class BreakAsGoto {
  public static void main(String[] args) {
    firstLayer : {
      SecondLayer : {
        ThirdLayer : {
          System.out.println("Before the break statement");
          if (true) {
            break SecondLayer;
          }
          System.out.println("This won't execute");
        }
        System.out.println("This won't execute");
      }
      System.out.println("This is after the second block");
    }
  }
}
```

Output:
> Before the break statement  
This is after the second block

Explanation:
> Java中是没有goto语句的，但它提供了一种方法去实现它  
> Java使用label来标记代码块，语法如下
>  ```java
>  label : {
>    statements; 
>  }
>  ```
> 使用break语句便能够跳出目标代码块。注意是**跳出该代码块，而不是进入该代码块**
>  ```java
>    break lable;
>  ```

### return

return被用于方法的退出或结束，有返回值的或者无返回值两种方法对应不同情况

#### 有返回值

有返回值的方法，return后面必须跟着符合返回类型的一个值

Examples:
```java
public class ReturnWithValue {
    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new ReturnWithValue().sum(1, 2));
    }
}
```

Output:
> 3.0

#### 无返回值

在无返回值的方法中，return语句可以忽略

Examples:
```java
public class ReturnWithoutValue {
    void sum(double a, double b) {
        System.out.println(a + b);
    }

    void lessThan9(int x) {
        if (x < 9) {
            System.out.println(x + " is less than 9");
            return;
        } else {
            System.out.println(x + " is greater than or equal to 9");
            ++x;
        }
        System.out.println("x is " + x);
    }
    
    package flow.jump;

  public class ReturnWithoutValue {
    void sum(double a, double b) {
      System.out.println(a + b);
    }

    void lessThan9(int x) {
      if (x < 9) {
        System.out.println(x + " is less than 9");
        return;
      } else {
        System.out.println(x + " is greater than or equal to 9");
        ++x;
      }
      System.out.println("x is " + x);
    }

//    void notReachable(double x) {
//        return;
//        // ++x不可达，会引起编译报错
//        ++x;
//    }

    public static void main(String[] args) {
      ReturnWithoutValue r = new ReturnWithoutValue();
      r.sum(9, 9);
      r.lessThan9(8);
    }
  }


  public static void main(String[] args) {
        ReturnWithoutValue r = new ReturnWithoutValue();
        r.sum(9, 9);
        r.lessThan9(8);
    }
}
```

Output:
> 18.0  
8 is less than 9

Explanation:
> 从sum()方法中，我们看到无返回值的方法可以没有return语句  
> 从lessThan9()方法中，我们看到return语句不一定是方法中的最后一个语句，但一定是方法中最后被执行的语句，即遇到return方法就结束了  
> 在notReachable()方法中，如果在return后立即跟上其他语句使之不可达会引起编译错误
