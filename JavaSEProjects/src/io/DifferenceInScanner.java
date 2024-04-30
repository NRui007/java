package io;

import java.util.Scanner;

public class DifferenceInScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer & String ");
        boolean a = sc.nextBoolean();
        String b = sc.nextLine();

        System.out.println("You have entered: " + a + " and " + b);
    }
}
