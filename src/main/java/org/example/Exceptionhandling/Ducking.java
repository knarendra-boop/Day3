package org.example.Exceptionhandling;

class DuckExample {

    static void method1() throws Exception {
        int a = 10 / 0;   // Exception occurs here
    }

    public static void main(String[] args) throws Exception {
        method1();       // exception is passed here
    }
}

