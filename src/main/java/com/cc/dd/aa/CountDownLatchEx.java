package com.cc.dd.aa;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchEx {

  void calc() throws InterruptedException {

    ExecutorService tp = Executors.newFixedThreadPool(10);

    CountDownLatch latch = new CountDownLatch(3);
    List<Service> services = Arrays.asList(new DM(latch), new OM(latch), new PM(latch));

    for (Service service : services) {

      tp.submit(() -> {

        try {
          service.verify();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });
    }

    latch.await();

    System.out.println(Thread.currentThread().getName());


  }

  abstract class Service {

    CountDownLatch latch;

    public Service(CountDownLatch latch) {
      this.latch = latch;
    }

    abstract boolean verify() throws InterruptedException;
  }

  class DM extends Service {

    public DM(CountDownLatch latch) {
      super(latch);
    }

    @Override
    public boolean verify() throws InterruptedException {
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(3000);
      System.out.println("Verified DM");
      latch.countDown();
      return true;
    }
  }

  class OM extends Service {

    public OM(CountDownLatch latch) {
      super(latch);
    }


    @Override
    public boolean verify() throws InterruptedException {
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(9000);
      System.out.println("Verified OM");
      latch.countDown();
      return true;
    }
  }

  class PM extends Service {

    public PM(CountDownLatch latch) {
      super(latch);
    }


    @Override
    public boolean verify() throws InterruptedException {
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(5000);
      System.out.println("Verified PM");
      latch.countDown();
      return true;
    }
  }


  public static void main(String[] args) throws InterruptedException {

    new CountDownLatchEx().calc();

  }
}
