package com.thread.join;


import java.util.concurrent.TimeUnit;

class JE1 extends Thread {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Running "+Thread.currentThread().getName());

    }
}
public class JoinEx {

    public static void main(String[] args) throws InterruptedException {

        JE1 one = new JE1();
        one.setName("JE1");
        JE1 two = new JE1();
        two.setName("JE2");
        one.start();
        one.join();
        two.start();
        two.join();


        System.out.println(Thread.currentThread().getName());

    }
}
