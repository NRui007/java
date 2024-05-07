package flow.loop;

public class ForDemo {
    public static void main(String[] args) {
        // 计算1~100累加
        int sum = 0;
        // 循环体有{}
        for (int x = 0; x <= 100; x++) {
            sum += x;
        }
        System.out.println("0 到 100累加为 " + sum);

        // 计算1~5累乘
        int product = 1;
        for (int i = 1; i <= 5; i++)
            product *= i;
        System.out.println("1 到 5累乘为 " + product);
    }
}
