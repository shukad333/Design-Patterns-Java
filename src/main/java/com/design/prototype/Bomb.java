package com.design.prototype;

public class Bomb extends Weapon{

  public Bomb() {
    this.weaponType = "Bomb!";
  }

  @Override
  public void addFeature(String feature) {

    System.out.println("Feature Added to bomb");

  }

}
