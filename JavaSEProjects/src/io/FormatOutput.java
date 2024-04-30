package io;

import java.util.Date;

public class FormatOutput {
    public static void main(String[] args) {
        // Integer Formatting %d
        int a = 10000;
        long b = 100000L;
        System.out.printf("int format: %d%n", a);
        // , 表示用','进行分隔
        System.out.printf("long format: %,d\n", b);

        // Decimal Formatting %f
        float c = 3.25f;
        double d = 3.14159265358979323846;
        System.out.printf("float format: %f\n", c);
        System.out.printf("double format: %5.3f\n", d);
        System.out.printf("double format: %5.2f\n", d);

        // Boolean Formatting %b or %B
        boolean e = true, f = true;
        System.out.printf("boolean format: %b\n", e);
        // %B输出大写
        System.out.printf("boolean format: %B\n", f);

        // Char Formatting %c or %C
        char g = 'g';
        System.out.printf("char format: %c\n", g);
        // %C输出大写
        System.out.printf("char format: %C\n", g);

        // String Formatting %s or %S
        String str = "Hello World!";
        // %s不能将大写转为小写
        System.out.printf("String format: %s\n", str);
        // %S会将小写字母转为大写
        System.out.printf("String format: %S\n", str);

        // Date and Time Formatting
        Date time = new Date();
        System.out.printf("Date format: %tT\n", time);
        System.out.printf("Date format: Hours: %tH  Minutes: %tM Seconds: %tS\n", time, time, time);
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", time);
    }
}
