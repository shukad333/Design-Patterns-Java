package com.sd.beh.decorator;

public class FoodDecorator implements Food{

  Food food;
  public FoodDecorator(Food food) {
    this.food = food;
  }

  @Override
  public String prepareFood() {
    return food.prepareFood();
  }
}
