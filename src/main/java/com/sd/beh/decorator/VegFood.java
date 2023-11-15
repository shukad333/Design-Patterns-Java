package com.sd.beh.decorator;

public class VegFood implements Food{

  @Override
  public String prepareFood() {
    System.out.println("Veg Food!");
    return "Veg Food";
  }

}
