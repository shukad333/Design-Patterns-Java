package com.cc.dd.aa;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MuktiThreadEx1 extends Thread{

  public static void main(String[] args) {
    Lock lock = new ReentrantLock();
    lock.newCondition();
    Executor executor = Executors.newFixedThreadPool(2);
    MyClass myClass = new MyClass();
    MyClass w1 = new MyClass();
    MyClass w2 = new MyClass();
    executor.execute(w1);
    executor.execute(w2);
  }
}

class MyClass implements Runnable{
  void exec() {
    System.out.println(Thread.currentThread().getName()+" --- Exec");
  }

  @Override
  public  void run() {
    synchronized (MyClass.class) {
      System.out.println(Thread.currentThread().getName() + " --- Exec");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Done");
    }
  }
}
