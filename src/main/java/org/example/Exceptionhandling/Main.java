package org.example.Exceptionhandling;

// Custom exception
class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}

class Bank {

    // we tell Java: this method may throw exception
    static void withdraw(int balance, int amount) throws LowBalanceException {

        if (amount > balance) {
            // create and throw exception
            throw new LowBalanceException("Not enough balance");
        }

        System.out.println("Money withdrawn");
    }
}

public class Main {

    public static void main(String[] args) {

        try {
            Bank.withdraw(1000, 2000);  // wrong case
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program finished");
    }
}

