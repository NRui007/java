# Super and Final

## Super

super关键字可以简单地认为是指向直接父类对象的引用变量，但是实际上它和this引用是有区别的。  
super并**不是一个对象的引用**，不能将super赋给另一个对象变量，他只是一个编译器调用超类方法的特殊关键字。  
正如前面继承中所讲的，创建子类对象时，虽然会调用父类的构造器，但并没有创建父类的对象，只有子类对象

**Usage:**

1. super用于指向直接父类实例变量
2. super用于调用直接父类实例方法
3. super()用于调用直接父类构造器：
    - 如果类构造器中没有使用super()或this(),编译器会自动添加super()
    - super()只能作为构造器的第一行语句

## Final

final关键字用于限制用户，它可以用于修饰variable、method、class、parameter  
不能修饰构造器，因为构造器是不能被继承的  

### Java final variable

- 如果任何变量是final的，那么用户就不能改变其值了，它将会是常量
- 如果一个变量被声明为final，且声明时并没有初始化，也就是没有值，那么该变量叫做blank final variable或uninitialized final variable
- blank final variable只能在构造器中被初始化, 并且必须被初始化；如果black final variable同时被声明是static的，那么它只能在static block中被初始化

Example:
```java
public class FinalVariable {
    final int num;

    public FinalVariable() {
        this.num = 0;
    }

    public static void main(String[] args) {
        FinalVariable variable = new FinalVariable();
        // 输出0
        System.out.println(variable.num);
    }
}
```

### Java final method

- 被声明为final的方法，不能被子类重写
- 虽然不能被重写，但是仍让可以被子类继承

### Java final class

被声明为final的class不能被继承

### Java final parameter

被声明为final的参数，在其方法内，不允许被修改其值

Example:
```java
public class FinalParameter {
    void fun(final int n, final String s) {
        n = n * 2;
        s = new String("test final");
    }
}
```

Output: 编译错误(n和s都不允许修改)
> java: 不能分配最终参数n

