package org.example.assignment3qday3;



class SwitchApp {
    static void validObj(Object obj) {
        switch (obj) {
            case Switch tx -> {
                if (tx.amount() <= 0) {
                    System.out.println("invalid Amount");
                } else if (!"COMPLETED".equals(tx.status())) {
                    System.out.println("its on  pending please complete it");
                } else {
                    System.out.println("its a valid transaction");
                }

            }

            case null -> System.out.print("null object");
            default -> System.out.print("not a Switch record");
        }

    }
    public static void main(String[] args) {

        Object t1 = new Switch(1, 500.0, "COMPLETED");
        Object t2 = new Switch(2, -100.0, "COMPLETED");
        Object t3 = new Switch(3, 300.0, "FAILED");
        Object t4 = "Hello";

        validObj(t1);
        validObj(t2);
        validObj(t3);
        validObj(t4);
    }
}
