package com.sd.builder;

public class VegBurger extends Burger{

  @Override
  public String name() {
    return "burger";
  }

  @Override
  public int price() {
    return 22;
  }
}
