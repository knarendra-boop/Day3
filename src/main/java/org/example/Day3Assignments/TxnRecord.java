package org.example.Day3Assignments;

public record TxnRecord(int id, double amount, String status) {
}
//Pattern matching checks whether an object is of a specific type and then safely allows access to that type, without creating or converting a new object.
class TxnPatternValidator {
    public static String validate(Object obj) {

        if (obj instanceof TxnRecord tx) {
            if (tx.amount() <= 0) {
                return "INVALID: Amount must be greater than 0.";
            }
            if(!"COMPLETED".equals(tx.status())) {
                return  "Invalid Status must be completed";
            }
            return "valid Transaction";
        }
              return "unvalid Transaction";
    }
}
    class TxnApp {

    public static void main(String[] args) {

        Object t1 = new TxnRecord(1, 500.0, "COMPLETED");
        Object t2 = new TxnRecord(2, -100.0, "COMPLETED");
        Object t3 = new TxnRecord(3, 300.0, "FAILED");
        Object t4 = "Hello";

        System.out.println(TxnPatternValidator.validate(t1));
        System.out.println(TxnPatternValidator.validate(t2));
        System.out.println(TxnPatternValidator.validate(t3));
        System.out.println(TxnPatternValidator.validate(t4));
    }
}
