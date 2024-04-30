package io;

public class CommandLineInput {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments provided");
        } else {
            System.out.println("Provided command line arguments: ");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
