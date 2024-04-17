package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDetails {
    public static void main(String[] args) throws IOException {
        // wrap BufferedReader around FileReader
        String path = "./JavaSEProjects/src/io/file.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        // mark() is supported?
        if (br.markSupported()) {
            System.out.println("mark() method is supported");
            br.mark(4);
        }

        // skip 8 characters
        br.skip(8);

        // ready to read
        if (br.ready()) {
            // readLine() method
            System.out.println(br.readLine());

            // read(char[] cbuf) ==> read(char[] cbuf, 0, cbuf.length)
            char[] ch = new char[20];
            br.read(ch);

            for (char c : ch) {
                System.out.print(c);
            }
            System.out.println();

            // 设置读取超过界限使得reset报错
//            br.read();
            // reset() method
            br.reset();

            for (int i = 0; i < 8; i++) {
                // read() method
                System.out.print((char) br.read());
            }
            System.out.println();
        }
    }
}
