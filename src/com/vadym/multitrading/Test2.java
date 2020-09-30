package com.vadym.multitrading;

public class Test2 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
         Test2 test = new Test2();
         test.doWork();
    }
    public synchronized void increment(){
        counter++;
    }

    public void doWork () throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    increment();
            }
        });

        thread2.start();
        thread1.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
