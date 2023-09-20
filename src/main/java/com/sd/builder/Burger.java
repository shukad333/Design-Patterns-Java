package com.sd.builder;

public abstract class Burger implements Item{

  @Override
  public Packing pack() {
    return new Wrapper();
  }
}
