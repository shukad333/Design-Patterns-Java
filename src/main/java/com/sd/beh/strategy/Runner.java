package com.sd.beh.strategy;

public class Runner {

  public static void main(String[] args) {

    Context context = new Context(new Addition());

    System.out.println(context.calc(12,13));

    context = new Context(new Substract());

    System.out.println(context.calc(15,12));




  }

}
