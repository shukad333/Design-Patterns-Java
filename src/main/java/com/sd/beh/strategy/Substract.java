package com.sd.beh.strategy;

public class Substract implements Strategy{

  @Override
  public int calc(int a, int b) {
    return a-b;
  }
}
