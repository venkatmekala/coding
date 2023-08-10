package com.javabites.synchronization;

public class ThreadSynchronization {
    static int  count = 0;
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
           for(int i = 1; i <= 10000; i++)
               count++;
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++)
                count++;
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }
}
