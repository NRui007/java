package basics.dataType;

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