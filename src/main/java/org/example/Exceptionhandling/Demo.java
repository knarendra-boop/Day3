package org.example.Exceptionhandling;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Start");

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: cannot divide by zero");
        }

        System.out.println("End");
    }
}

