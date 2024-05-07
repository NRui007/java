package flow.loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        // 计算1~100累加
        int i = 1;
        int sum = 0;

        // 循环体有{}
        do {
            sum = sum + i;
            i++;
        } while (i <= 100);
        System.out.println("0 到 100累加为 " + sum);

        // 计算1~5累乘
        int product = i = 1;
        // 循环体没有{}
        do
            product = product * i++;
        while (i <= 5);
        System.out.println("1 到 5累乘为 " + product);
    }
}
