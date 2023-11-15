package com.sd.beh.strategy;

public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public int calc(int a, int b) {
    return strategy.calc(a,b);
  }

}
