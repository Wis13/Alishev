package com.vadym.multitrading;

public class Test {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}
class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello my Friend " + i);

    }
}
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello my Friend " + i);
        }
    }
}
}
