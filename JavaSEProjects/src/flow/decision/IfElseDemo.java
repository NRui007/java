package flow.decision;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer");
        int a = scanner.nextInt();

        if (a > 100) {
            System.out.println("a is greater than 100");
        } else {
            System.out.println("a is less than 100");
        }
        scanner.close();
    }
}
