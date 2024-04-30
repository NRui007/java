package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStream {
    public static void main(String[] args) throws IOException {
        // Standard Input Stream
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        // Standard Output Stream
        System.out.println(s);

        // Standard Error Stream
        System.err.println("if existing errors, please use err stream to print");
    }
}
