[TOC]

# 原始数据类型 Primitive Data Types

## 数字类型 Numeric Data Types

### 整数类型 Integer

#### byte

- 有符号二进制补码整数
- 默认值为0
- 8bits
- 值域：-128~127 同-2^7~2^7-1
- Syntax：
    ```java
    public class ByteType {
        static public void main(String[] args) {
            // byte赋值
            // 编译不报错
            byte byteVar1 = 127;
            System.out.println("byteVar1 is " + byteVar1);
            
            // 编译报错: 不兼容的类型: 从int转换到byte可能会有损失
            // byte byteVar2 = 128;
            // System.out.println("byteVar2 is " + byteVar2);
            // 虽然127是int类型，但是如果该值范围在byte值域内，编译器会将其自动转换，不会编译报错, 而128超出byte范围就不会进行自动转换，因为自动转换过程中可能会丢失精度，需要强转

            // 编译不报错，控制台输出byteVar3, 显示-128
            byte byteVar3 = (byte) 128;
            System.out.println("byteVar3 is " + byteVar3);
        }
    }
    ```

#### short

- 有符号二进制补码整数
- 默认值为0
- 16bits
- 值域：-32768~32767 同-2^15~2^15-1
- Syntax：
    ```java
    public class ShortType {
        static public void main(String[] args) {
            // short赋值
            // 编译不报错
            short shortVar1 = 32767;
            System.out.println("shortVar1 is " + shortVar1);
            
            // 编译报错: 不兼容的类型: 从int转换到short可能会有损失
            // short shortVar2 = 32768;
            // System.out.println("shortVar2 is " + shortVar2);
            // 虽然32767是int类型，但是如果该值范围在short值域内，编译器会将其自动转换，不会编译报错,
            // 而32768超出short范围就不会进行自动转换，因为自动转换过程中可能会丢失精度，需要强转

            // 编译不报错，控制台输出shortVar3, 显示-32768
            short shortVar3 = (short) 32768;
            System.out.println("shortVar3 is " + shortVar3);
        }
    }
    ```

#### int