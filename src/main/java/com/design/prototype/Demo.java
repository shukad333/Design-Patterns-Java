package com.design.prototype;

public class Demo {

  public static void main(String[] args) throws CloneNotSupportedException {

    WeapomStore.getWeapon("gun").addFeature("ak");
    WeapomStore.getWeapon("bomb").addFeature("gren");
    WeapomStore.getWeapon("gun").addFeature("pis");
    WeapomStore.getWeapon("bomb").addFeature("mine");


  }

}
