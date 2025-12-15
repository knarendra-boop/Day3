package org.example.Exceptionhandling;

class ThrowHandleDemo {

    static void checkBalance(int balance) {
        if (balance < 0) {
            throw new RuntimeException("Balance cannot be negative");
        }
        System.out.println("Balance OK");
    }

    public static void main(String[] args) {
        try {
            checkBalance(-100);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

