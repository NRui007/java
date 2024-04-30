package io;

import java.text.DecimalFormat;

public class DecimalFormatter {
    public static void main(String[] args) {
        double num = 123.4567;

        // 创建浮点数格式器
        DecimalFormat df;

        // 去除小数部分
        df = new DecimalFormat("####");
        System.out.println("Without fraction part: num = " + df.format(num));

        // 保留两位小数的精度
        df = new DecimalFormat("###.##");
        System.out.println("Formatted to Give precision: num = " + df.format(num));

        // 保留六位小数的精度，不足用0补
        df = new DecimalFormat("#.000000");
        System.out.println("appended zeroes to right: num = " + df.format(num));

        // 保留五位整数，两位小数，不足用0补
        df = new DecimalFormat("00000.00");
        System.out.println("formatting Numeric part : num = "
                + df.format(num));

        // 金钱格式化带千分位 添加$
        double income = 1123456.789;
        df = new DecimalFormat("$###,###.##");
        System.out.println("your Formatted Dream Income : "
                + df.format(income));
    }
}
