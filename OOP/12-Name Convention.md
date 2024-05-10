# Name Convention

## Why we need Obey the Name Convention

一个好的命名能够易于其他程序员理解自己的代码。  
从小的层面上看，命名的好坏似乎是没有什么意思的；  
但是在现代工业层面上看，为例节约时间，书写出整洁的代码，命名规约是软件开发时必须遵守的一个规则

## Rules

### Classed and Interfaces

- 类名应该是**名词**，大小写混合，并且每个单词首字母都需要大写
- 接口名同类名一样，大小写混合，每个单词首字母都需要大写，接口名应该是形容词
- 尽量使用完整单词，避免使用缩写和简称

Example:
> **Classes**:  
> - class Student {}
> - class Teacher {}
> - class Scanner {}
> 
> **Interfaces**:
> - Runnable
> - Remote
> - Serializable

### Methods

- 方法名应该是**动词**，大小写混合，第一个单词首字母小写，内部所有单词首字母大写

Example:
```java
public static void main(String[] args) {}
```

### Variables

- 变量名应该尽可能短，但意义必须明确，不能为了短而使人无法理解
- 尽管规则允许，变量也不应该以_或$开头
- 变量名应该易于理解
- 应该避免使用单字符变量，除非是临时变量
- 通常单字符变量i,j,k,m,n用于整数，c,d和e用于字符

Example:
> int[] mark;  
> double answer;

### Constants

- 所有单词全部大写，单词之间用"_"分隔

Example:
> PI

### Packages

- 包名应该全字母小写
- 包名第一级应该使用顶级域名，如com, edu, gov, mil, net, org
- 随后的包名根据组织内部命名规约进行命名

Example:
> java.util.Scanner;  
> java.io.*;