# Method

## Definition

- 方法用来显示对象的行为
- 方法是一组代码的集合用来展现特定的任务

## Syntax

```java
<access_modifier> <return_type> <method_name>(list_of_parameters) {  
    //body  
}
```

## Advantages

- Reusability
- Abstraction: 方法可以没有复杂的逻辑细节，只提供接口形式
- Improved readability
- Encapsulation: 方法可以封装复杂的逻辑处理和数据，使得易于管理和维护
- Separation of concerns: 通过使用方法，可以分离代码，将不同的职责赋予不同的方法，提高的代码的结构性和组织性
- Improved modularity: 方法可以将代码划分为更小的，更易管理的单元
- Improved testability: 更小更易管理的单元更易于单元测试，定位bug代码
- Improved performance: 能够减少代码数量，降低内存使用

## Uses of Methods

### Declaration

方法的声明通常由6部分组成：
1. Modifier修饰符(可选): 定义方法可以从哪些地方被访问到
    - public: anywhere;
    - protected: 类本身及其子类可以
    - private: 只有类本身
    - default(不使用修饰符则为default): 类本身和统一包下
2. The Return Type返回类型(必有): 返回数据的类型或者不返回数据为void
3. Method Name方法名(必有): 遵守方法名命名规约即可
4. Parameter List参数列表(可选): 参数之间用","分隔，参数需声明类型和变量名；没有参数也是可以的
5. Exception List异常列表(可选): 可能跑出的异常列表；只需列出异常类名
6. Method Body方法体(可选): 实现方法的代码，用"{}"包围

Example:
```java
public int max(int a, int b) {
    return a > b ? a : b;    
}
```

### Types of Methods

1. Predefined Method: Java库中类的方法
2. User-defined Method: 自定义的方法

### Ways to Create Method

#### 1. Instance Method 

- 只能通过对象名来使用该方法
- 类中声明

#### 2. Static Method

- 既能通过对象名也可以通过类名访问该方法
- 类中声明，使用static修饰

### Method Signature

- 方法签名由方法名和参数列表两部分组成
- 不包含返回类型、异常列表与访问修饰符

### Method Calling

通过方法调用才能够使用它的功能。  
方法调用返回的三种场景：
1. 执行完所有语句
2. 遇到return语句
3. 抛出异常

### Memory Allocation for Methods Calls

方法调用通过栈实现：
1. 当方法被调用后，会在栈区域创建一块栈帧
2. 被传进去的参数和方法体内的局部变量和值都会保存在该栈帧内
3. 当方法调用结束后，该栈帧将会被删除

存在一个栈指针寄存器会跟踪栈顶并进行调整