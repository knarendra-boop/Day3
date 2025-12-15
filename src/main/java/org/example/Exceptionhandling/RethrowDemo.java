package org.example.Exceptionhandling;

public class RethrowDemo {

    static void method1() throws Exception{
        try {
            int x = 10/0;  //  Exception
        } catch (ArithmeticException e) {
            System.out.println("Logged exception in method1");
            throw e; // 🔁 rethrow
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Handled exception in main");
        }
    }
}

