package org.example.Exceptionhandling;

class MultiExceptionThrows {

    static void test(String s, int n)
            throws NullPointerException, ArithmeticException {

        int len = s.length();   // may throw NullPointerException
        int x = 10 / n;         // may throw ArithmeticException

        System.out.println(x);
    }

    public static void main(String[] args) {
        try {
            test(null, 0);
        } catch (NullPointerException e) {
            System.out.println("String is null");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}

