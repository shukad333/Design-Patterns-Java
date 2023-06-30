package com.concurrency.evenodd;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex = Executors.newScheduledThreadPool(12);
        ExecutorService ex1 = Executors.newSingleThreadScheduledExecutor();

        ScheduledExecutorService schedule = Executors.newSingleThreadScheduledExecutor();
//        schedule.scheduleAtFixedRate(new Cleanup(), TimeUnit.SECONDS.toSeconds(10),TimeUnit.SECONDS.toSeconds(4),TimeUnit.SECONDS);

        ExecutorService e = Executors.newFixedThreadPool(10);

        for(int i=0;i<10;i++) {
            Future<String> resp = e.submit(new Uploader());
            while(!resp.isDone()) {
                System.out.println("Fetching still!");
            }
//            System.out.println(resp.get());
        }



        List<Runnable> notExec = e.shutdownNow();
        System.out.println(notExec.size());
        for(Runnable r : notExec) {
            System.out.println(r.getClass().getName());
        }
    }


    private void cleanup(List<String> l) throws InterruptedException{
        System.out.println("Cleaning up!");
        Thread.sleep(12);
    }
}


class Uploader implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Exec by "+Thread.currentThread().getName());
        Thread.sleep(100000);
        return "Shu";
    }
}


class Downloader implements Runnable {
    int i;
    public Downloader(int i) {
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println("Dowloading! "+i);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

class Cleanup implements Runnable {
    @Override
    public void run() {
        System.out.println("Cleaning up!!!!");
    }
}
