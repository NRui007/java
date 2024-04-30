package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class RedirectOutput {
    public static void main(String[] args) throws IOException {
        // 确定输出文件
        File file = new File("./JavaSEProjects/src/io/output.log");

        if (!file.exists()) {
            System.out.println("File not found");
            System.out.println("Start creating the file");
            file.createNewFile();
        }

        // 创建日志输出流和控制台输出流
        PrintStream log = new PrintStream(file);
        PrintStream console = System.out;


        // 日志输出
        System.setOut(log);
        System.out.println("This will be written to the file.");

        // 切换控制台输出
        System.setOut(console);
        System.out.println("This will be written to the console.");
    }
}
