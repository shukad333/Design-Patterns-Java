package com.sd.beh.decorator;

public class Runner {

  public static void main(String[] args) {

    Food vegFood = new VegFood();
    vegFood.prepareFood();
    Food nonVeg = new NonVeg();
    System.out.println(nonVeg.prepareFood());

  }

}
