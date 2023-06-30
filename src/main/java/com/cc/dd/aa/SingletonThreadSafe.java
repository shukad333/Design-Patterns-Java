package com.cc.dd.aa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class CallSingle implements  Runnable {
    @Override
    public void run() {
        SingletonThreadSafe instance = SingletonThreadSafe.getInstance();

        System.out.println(Thread.currentThread().getName()+" "+instance.counter());
    }


}
public class SingletonThreadSafe {

    public static void main(String[] args) {


        System.out.println(Double.POSITIVE_INFINITY < Double.MAX_VALUE);
        ExecutorService ex = Executors.newFixedThreadPool(5);

        for(int i=0;i<205;i++)
        ex.execute(new CallSingle());

        ex.shutdown();

    }

    private static volatile SingletonThreadSafe instance;


    private  int ctr = 0;
    public String counter() {
        return "Counter  "+ ++ctr;
    }

    public static SingletonThreadSafe getInstance() {
        if(null == instance) {
            synchronized (SingletonThreadSafe.class) {
                if(null == instance) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
//        instance = new SingletonThreadSafe();
        return instance;
    }
}
