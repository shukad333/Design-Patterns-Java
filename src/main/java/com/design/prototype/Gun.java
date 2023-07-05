package com.design.prototype;

public class Gun extends Weapon{

  public Gun() {
    this.weaponType = "Gun!";
  }

  @Override
  public void addFeature(String feature) {

    System.out.println("Feature Added to gun");

  }

}
