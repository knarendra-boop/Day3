package org.example;

public class VirtualThreads {
    public static void main(String[] args) {

        for (int i = 1; i <= 20000; i++) {
            int id = i;

            Thread.startVirtualThread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Virtual Thread working: " + id + Thread.currentThread().getName());
                }
            });

        }
    }
}
