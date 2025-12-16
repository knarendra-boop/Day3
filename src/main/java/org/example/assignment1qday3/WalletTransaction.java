package org.example.assignment1qday3;

public record WalletTransaction(String id, double Amount, String type, String Description) {

    public WalletTransaction {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id is not found");
        }
        if (Amount <= 0) {
            throw new IllegalArgumentException("Amount is not found");

        }
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Type is not found");

        }
        if (Description == null || Description.isBlank()) {
            throw new IllegalArgumentException("no description found");
        }
    }
}
