package com.sd.beh.decorator;

public class NonVeg extends FoodDecorator{

  public NonVeg() {
    super(new VegFood());
  }

  @Override
  public String prepareFood() {
    return super.prepareFood() + " Some chicken curry";
  }
}
