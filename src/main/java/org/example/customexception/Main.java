package org.example.customexception;

public class Main {

    public static void main(String[] args) {

        try {
            org.example.exceptionHandlingPratice.Bank.withdraw(1000, 2000);  // wrong case
        } catch (org.example.exceptionHandlingPratice.LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished");
    }

    public static class UncheckedExceptionDemo {

        public static void main(String[] args) {

            // 1️⃣ ArithmeticException
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Cannot divide by zero");
            }

            // 2️⃣ NullPointerException
            try {
                String name = null;
                System.out.println(name.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: Object is null");
            }

            // 3️⃣ ArrayIndexOutOfBoundsException
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Invalid index");
            }

            // 4️⃣ NumberFormatException
            try {
                int num = Integer.parseInt("abc");
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Cannot convert string to number");
            }

            // 5️⃣ ClassCastException
            try {
                Object obj = "Hello";
                Integer num = (Integer) obj;
            } catch (ClassCastException e) {
                System.out.println("ClassCastException: Invalid type casting");
            }
    finally {
                System.out.println("progam is running safe....");
            }
            System.out.println("Program continues safely...");
        }
    }
}}
