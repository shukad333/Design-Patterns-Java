package com.cc.dd.aa;

public class Thread1 {

    public static void main(String[] args) throws InterruptedException {

        try {
            System.exit(1);
        }
        finally {
            System.out.println("Got");
        }
//        Thread t1 = new Ex();
//        t1.setName("Abs");
//        t1.start();
////        t1.join();
//        System.out.println(Thread.currentThread().getName());
    }
}

class Ex extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Started!");
    }
}
