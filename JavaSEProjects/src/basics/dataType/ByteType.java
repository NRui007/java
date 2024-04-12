package basics.dataType;

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