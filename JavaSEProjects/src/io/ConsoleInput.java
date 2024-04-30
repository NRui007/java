package io;

import java.io.Console;

/**
 * 使用Console类读取输入
 */
public class ConsoleInput {
    public static void main(String[] args) {
        Console console = System.console();
        // 在IDE中运行, console is null
        if (console == null) {
            System.out.println("No console available");
        } else {
            // readLine会回显字符
            String input = console.readLine();
            System.out.println("You have entered: " + input);

            // readPassword不会回显字符
            char[] password = console.readPassword();
            System.out.println("You have entered: " + new String(password));
        }

    }
}
