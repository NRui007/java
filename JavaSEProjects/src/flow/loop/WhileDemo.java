package flow.loop;

public class WhileDemo {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;

        // 计算1至100累加
        // num > 0 是 循环条件
        while (num > 0) {
            // 循环体被{}包围
            sum += num;
            // 更新循环变量num
            num--;
        }

        System.out.println("0 到 100累加为 " + sum);

        // 计算1到5的累乘
        int product = num = 1;
        // 循环体没有{}
        while (num <= 5)
            product *= num++;

        System.out.println("1 到 5累乘为 " + product);
    }
}
