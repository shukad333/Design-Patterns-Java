package com.sd.builder;

public class Pepsi extends ColdDrink{

  @Override
  public int price() {
    return 20;
  }

  @Override
  public String name() {
    return "Pepsi";
  }
}
