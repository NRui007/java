package io;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int sum = 0, count = 0;

        // 判断下一个值是否是整数
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            sum += n;
            count++;
        }

        if (0 != count) {
            System.out.println("The average is " + sum / count);
        } else {
            System.out.println("No Integers were input ");
        }
    }
}
