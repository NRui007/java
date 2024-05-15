# Encapsulation

- 封装(Encapsulation)指的是将数据以及操纵该数据的方法捆绑在一个独立单元内，在Java中独立单元指的就是class。  
- 封装是一种对外界访问隐藏类中实现细节和仅暴露与外界交互的的公共接口的方法。
- 在Java中，为了实现封装，会将实例变量声明为private，只允许类内直接访问。
- 同时，为了能够从外部访问该实例变量，将会定义public的getter和setter，用于获取和修改实例变量的值

**Java Bean**就是一种完全封装的class，它的所有实例变量都是私有的。

Example:
```java
public class GetterAndSetter {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(22);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```

Output:
> Name: John  
Age: 22

封装一方面可以被认为是将代码和其操控的数据绑定在同一单元的机制；也可以被认为是一种阻止数据被外部数据直接访问的保护机制

1. 从技术上讲，在封装中，类中数据或变量对于其他类来说是隐藏的，只能被类中成员函数直接访问
2. 在封装中，数据对其他类不可见使用了data hiding概念，而其通过使成员和方法私有化，类阻止实现细节对外暴露又用到了抽象概念。因此封装又被认为是数据隐藏和抽象的结合

## Advantages and Disadvantages

Advantages:
- Data Hiding: 通过隐藏实现细节限制对数据的访问。用户只能通过getter获取其值，通过setter赋值，不了解内部实现细节
- Increased Flexibility: 通过省略getter或者setter方法使得类内变量只写或只读
- Reusability:
- Testing Code is Easy: 封装更易于单元测试

Disadvantages:
- 使用不当导致复杂性提高
- 难以理解系统如何工作
- 限制实现的灵活性

## Difference between Encapsulation and Abstraction

| **Encapsulation**  |  **Abstraction**   |
|:------------------:|:------------------:|
|      封装是数据隐藏       |      抽象是细节隐藏       |
| 封装是将数据和操作其的方法绑定在一起 | 抽象是将接口暴露给用户而隐藏实现细节 |
|  被封装的类都遵守数据隐藏和抽象   |    抽象通过抽象类和接口实现    |
|      封装存在于实现层      |      抽象存在于设计层      |
