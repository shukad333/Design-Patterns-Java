package com.cc.dd.aa;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {


    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3,new ProcessAfter());
        Thread t1 = new Thread(new ReadFile("thread1",cyclicBarrier));
        Thread t2 = new Thread(new ReadFile("thread2",cyclicBarrier));
        Thread t3 = new Thread(new ReadFile("thread3",cyclicBarrier));

        t1.start();
        t2.start();
        t3.start();
    }
}

class ProcessAfter implements Runnable {
    @Override
    public void run() {
        System.out.println("Processing After...");
    }
}

class ReadFile implements Runnable {

    CyclicBarrier cyclicBarrier;
    public ReadFile(String tName , CyclicBarrier cyclicBarrier) {
        Thread.currentThread().setName(tName);
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        System.out.println(cyclicBarrier.getNumberWaiting()+" waiting");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
