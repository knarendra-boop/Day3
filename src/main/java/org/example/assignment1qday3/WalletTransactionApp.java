package org.example.assignment1qday3;

import org.example.assignment1qday3.WalletTransaction;

class WalletTransactionApp {
    public static void main(String[] args) {
        WalletTransaction w = new WalletTransaction("123", 1200, "Debit", "paid for food");
        System.out.print(w);
        try {
            WalletTransaction w2 = new WalletTransaction("", -100, "", "");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
