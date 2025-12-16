package org.example.customexception;

import org.example.exceptionHandlingPratice.LowBalanceException;

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

