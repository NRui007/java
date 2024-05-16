# Object-Oriented Programming or OOP

## 概念 Concepts

Object-Oriented Programming面向对象编程即在编程中使用对象Object，使用对象作为源在代码中实现功能。  
OOP旨在实现真实实体real-life entity，在代码中以Object的形式实现，比如：
- Object对象
- Class类
- Inheritance继承
- Polymorphism多态
- Abstraction抽象
- Encapsulation封装

出来以上概念，OOP中还有一些其他术语：
- Coupling耦合
- Cohesion内聚
- Association关联
- Aggregation聚合
- Composition组合

### Object

Definition:
> 任何拥有状态state和行为behavior的实体entity就叫做对象object.  
> 
> 在Java中，一个对象被定义为类的一个实例Instance。
> 对象包含一个内存地址，并且在内存中占据一部分空间
> 对象之间尽管不知道彼此的代码或数据明细，它们之间也可以通信
> 通信需要的仅仅是需要接收和收到响应的数据类型，即方法的入参和返回值

### Class

Definition:
> 对象的集合叫做类，它是逻辑实体，亦可以叫做对象的蓝本  
> Class并不会使用内存空间

### Inheritance

Definition:
> 当一个对象从它的父对象获得了父对象的所有属性和行为时，这就是继承  
> 继承能够提高代码可重用性  
> 继承也是实现运行时多态runtime polymorphism的保障

### Polymorphism

Definition:
> 一个功能有多种表达方式，就叫做多态  
> 在Java中，通过方法重载overload和方法重写override来实现多态

### Abstraction

Definition:
> 隐藏内部实现细节，仅展现其要实现的功能叫做抽象
> 在Java中，使用抽象类abstract class和接口interface实现抽象

### Encapsulation

Definition:
> 将代码和数据都封装在一个独立的单元中就叫做封装  
> 在Java中，这个独立的单元就叫做类  
> 一种特殊的类Java bean，它的所有成员都是私有的

### Coupling

Definition:
> 耦合指信息或知识从另外一个类获取的依赖关系
> 如果一个类有着另外一个类的详细信息，那么它们之间是强耦合
> 在Java中，我们使用private, protected和public访问修饰符来限制类、方法和成员的可视级别
> 接口是一种弱耦合，因为它并没有具体的实现

### Cohesion

Definition:
> 内聚指一个模块内部各个组件结合的紧密程度。组件指能够实现一个定义明确任务的部分
> 一个定义明确的任务能够被一个高内聚的方法实现
> 低内聚方法则是将任务拆分成几部分

### Association

Definition:
> 关联指对象之间的关系，有以下四种
> - 一对一 one to one
> - 一对多 one to many
> - 多对一 many to one
> - 多对多 many to many
> 关联可以无方向的或者双向的

### Aggregation

Definition:
> Aggregation是实现Association的一种方式。  
> 它代表一个对象包含另一个对象作为其状态的一部分的关系，是一种弱的关联关系
> 在Java中，它也被叫做has-a关系，就像继承被叫做is-a关系。
> 它同样提高了对象的复用性

### Composition

Definition:
> Composition也是实现Association的一种方式
> 它也代表一个对象包含另一个对象作为其状态的一部分的关系，但这另一个对象不能脱离源对象而独立存在，它是一种强关系
> 如果删除父对象，那么子对象将会自动删除

### Relationship of Association, Aggregation and Composition

- Aggregation和Composition都是Association的特殊形式
- Aggregation代表的是Has-A的关系，实体之间可以相互独立存在
- Composition又是Aggregation的一种特殊形式，代表的part-of的关系，实体之间互相依赖，不能独立存在
- 因此 Composition < Aggregation < Association

## Advantage of OOPs over Procedure-oriented programming language

1. 比起面向过程编程，面向对象编程可以使开发和维护更加方便
2. OOP可以隐藏数据，而面向对象编程全局数据可以在任何地方访问
3. OOP有着更加高效地模拟实际事件的能力，并且能够解决真实世界问题

## Difference between OOP and Object-based programming

Object-based programming基本拥有OOP的所有特性除了继承，JavaScript和VBScript就是典型的object-based programming language

## Why java is not purely Object-Oriented Programming language

***how to be purely objected-oriented***

1. Encapsulation/Data Hiding  
2. Inheritance  
3. Polymorphism  
4. Abstraction  
5. All predefined types are objects  
6. All user defined types are objects  
7. 对对象的所有操作都必须通过其public方法实现

第一个实现完全面向对象的语言是Smalltalk。~~（虽然俺没听说过）~~

Java满足以上1, 2, 3, 4, 6条特性，但不满足5和7特性：
1. **Primitive Data Type**:Java中预设好的数据类型包含8中原始数据类型，它们并不是对象
2. **The static keyword**:通过static修饰的变量或方法，不需要通过对象访问，可以直接使用类访问
3. **Wrapper class**:
   - 原始数据封装类可以通过算术运算符直接操作，而不通过调用方法
   - 另外例如使用Integer代替int进行运算，但在Java内部也会通过拆箱机制将其转为原始数据类型进行计算

