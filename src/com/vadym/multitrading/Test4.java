package com.vadym.multitrading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(12);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));}
        executorService.shutdown();
        System.out.println("All task submitted");
        executorService.awaitTermination(1, TimeUnit.DAYS);


    }
}

class Work implements Runnable {
    private int id;
    public Work (int id){
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was complited");
    }
}
