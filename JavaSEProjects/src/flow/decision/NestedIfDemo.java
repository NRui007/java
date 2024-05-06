package flow.decision;

import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input an integer");
        int i = in.nextInt();

        if (i < 100) {
            if (i >= 50) {
                System.out.println(i + " is greater than or equal to 50 and less than 100");
            }

            if (i < 50) {
                System.out.println(i + " is less than 50");
            }
        } else {
            System.out.println(i + " is greater than 100");
        }

        in.close();
    }
}
