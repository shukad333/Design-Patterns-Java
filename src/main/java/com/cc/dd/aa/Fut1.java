package com.cc.dd.aa;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fut1 {

  public static void main(String[] args) throws Exception {

    Compute compute = new Compute();
    ExecutorService executor = Executors.newFixedThreadPool(1);
    Future<String> f = executor.submit(compute);
    System.out.println(f.get());

  }

}

class Compute implements Callable<String> {

  @Override
  public String call() throws Exception {
    return "shu";
  }
}
