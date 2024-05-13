# Static

Static关键字在Java中主要用于内存管理。它可以用于以下四个方面：
1. Variable(也叫做类变量)
2. Method(也叫做类方法)
3. Block
4. Nested class

## 1. Java Static Variable

- 相对于每个对象独特的属性来说，类变量能被用于指向所有对象的一般属性，比如职员的公司名称
- 类变量只在类加载时机时获取以内存
- 类变量的优势是节约内存，它被其所有对象共享内存

## 2. Java Static Method

- 静态方法属于类而不是对象
- 静态方法的调用不需要创建对象，它可以直接使用类名调用
- 静态方法可以访问静态成员并改变其值
- 静态方法的限制：
  1. 静态方法不能直接使用非静态成员或者调用非静态方法
  2. 不能在静态方法中使用this()或者super()

注：
> 为什么Java中main()是静态方法呢？  
> 因为这样，JVM不用每次创建对象后再调用方法，导致额外的内存开销

## 3. Java Static Block

- 静态块被用于初始化静态成员
- 它只在类加载时机执行一次，在main()方法执行之前

# This

Usage of this keyword:
1. to refer current class instance variable:
    > 用于解决实例变量和参数的歧义
2. to invoke current class method:
    > 显示地使用this调用方法；如果不使用this,编译器也会自动加上
3. to invoke current class constructor
    > this()将会调用当前类的构造器。它一般用于复用构造器，即构造器链  
     this()语句必须被放在其构造器第一句。super()一样只能放在构造器的第一句，因此在同一构造器中，不能同时出现super()和this()
4. to pass as an argument in the method
    > this关键字可以在方法中被当做参数传递，代替自身对象  
     这种场景一般适用于事件处理
5. to pass as an argument in the constructor call
    > 常用于在多个类中使用同一对象
6. to return current class instance
    > 可以用于return语句将this返回  
     方法的返回类型必须是引用数据类型

Example: prove this keyword
```java
public class ProveThis {
    void printThisAddress() {
        System.out.println(this);
    }
    public static void main(String[] args) {
        ProveThis proveThis = new ProveThis();
        System.out.println(proveThis);
        proveThis.printThisAddress();
    }
}
```

Output:
> ProveThis@1b6d3586  
ProveThis@1b6d3586

