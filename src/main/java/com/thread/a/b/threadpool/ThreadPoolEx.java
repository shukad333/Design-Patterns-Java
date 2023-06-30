package com.thread.a.b.threadpool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolEx {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService ex = Executors.newFixedThreadPool(10);

        Future<String> r = ex.submit(new GetArtifacts());

        while(!r.isDone()) {
            System.out.println("Still trying");
            Thread.sleep(10);
        }

        System.out.println(r.get());
        System.out.println(ex.isShutdown());
        ex.shutdown();
    }

}



class GetArtifacts implements Callable {


    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "pbm.json";
    }
}
