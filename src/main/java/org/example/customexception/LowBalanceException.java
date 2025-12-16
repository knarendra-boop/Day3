package org.example.customexception;

class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg);
    }
}