package org.example.ExceptionHandlingPractice;


public class ExceptionPropagationDemo {

    // Class 1: Exception happens here
    static class Calculator {
        static void divide() {
            int result = 10 / 0;   //  ArithmeticException
        }
    }

    // Class 2: Calling class (not handling)
    static class Service {
        static void process() {
            Calculator.divide();  // exception goes up
        }
    }

    // Class 3: Handling class
    public static void main(String[] args) {

        try {
            Service.process();   // calling chain
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main method");
        }

        System.out.println("Program continues normally");
    }
}

