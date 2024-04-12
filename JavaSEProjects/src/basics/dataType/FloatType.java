package basics.dataType;

public class FloatType {
    public static void main(String... args) {
        // float赋值
        float floatVar = 3.33f;
        System.out.println(floatVar);

        // 编译报错：不兼容的类型: 从double转换到float可能会有损失
        // float f = 3.33;
    }
}