package io;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        // from standard input
        Scanner scanner = new Scanner(System.in);

        // various types input
        String name = scanner.nextLine();
        char gender = scanner.next().charAt(0);
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        long salary = scanner.nextLong();
        boolean married = scanner.nextBoolean();

        // print info
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Salary: " + salary);
        System.out.println("Married: " + married);
    }
}
