package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        // create BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // reading String
        String line = bufferedReader.readLine();

        // reading Integer
        int i = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Entered String: " + line);
        System.out.println("Entered Integer: " + i);

        bufferedReader.close();
    }
}
