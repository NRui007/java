package flow.decision;

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your scores");
        double n = in.nextDouble();

        if (n < 60) {
            System.out.println("Your score is fail");
        } else if (n < 80) {
            System.out.println("Your score is pass");
        } else if (n < 90) {
            System.out.println("Your score is good");
        } else {
            System.out.println("Your score is excellent");
        }

        in.close();
    }
}
