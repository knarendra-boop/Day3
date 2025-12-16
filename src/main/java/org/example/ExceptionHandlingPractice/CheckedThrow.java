package org.example.ExceptionHandlingPractice;

import java.io.IOException;

class CheckedThrow {

    static void read() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
