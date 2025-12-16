package org.example.assignment2qday3;


import java.util.List;

//creating input data
class TransactionApp {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(new Transaction(1, 101, 500,  "COMPLETED"),
                new Transaction(2, 101, 1500, "FAILED"),
                new Transaction(3, 102, 700,  "COMPLETED"),
                new Transaction(4, 101, 2000, "COMPLETED"));
        System.out.println(transactions);

        //by using filter:

        List<Transaction> completed =  transactions.stream()
                .filter(t->"COMPLETED".equals(t.status()))
                .toList();
        System.out.println(completed);

        // by aggregation
        double total = transactions.stream()
                .mapToDouble(Transaction::amount)//:: reference method shoter way to write lambda expression
                .sum();
        System.out.print(total);
    }
}
