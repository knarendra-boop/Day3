package org.example.Day3Assignments;

public record WalletTransaction(String id, double Amount, String type, String Description) {

    public WalletTransaction {

        if(id == null||id.isBlank()) {
            throw new IllegalArgumentException("id is not found");
        }
        if(Amount <=0) {
            throw new IllegalArgumentException("Amount is not found");

        }
        if(type==null|| type.isBlank()) {
            throw new IllegalArgumentException("Type is not found");

        }
        if(Description==null || Description.isBlank()) {
            throw new IllegalArgumentException("no description found");
        }
    }
}
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