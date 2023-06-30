package com.cc.dd.aa;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ProdConsEx1 {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> s = new LinkedBlockingQueue<>(5);

        new Thread(new Prod1(s)).start();
        Thread.sleep(20000);
        new Thread(new Cons1(s)).start();

    }
}


class Prod1 implements Runnable {
    private BlockingQueue<String> queue;

    public Prod1(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            try {

                System.out.println("Producing");
                queue.put("Produced "+i);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

    }
}


class Cons1 implements Runnable {
    private BlockingQueue<String> queue;

    public Cons1(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true) {
            try {
                System.out.println("Consued "+queue.take());
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }

    }
}
