package org.example;

public class NormalThreads {
    public static void main(String[] args) {

        for (int i = 1; i <= 100000; i++) {
            int id = i;

            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Normal Thread working: " + Thread.currentThread().getName());
                }
            });

            t.start();
        }
    }
}
