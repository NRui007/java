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
- Return: 在函数方法中用于显示声明返回，结束后序语句执行



## 