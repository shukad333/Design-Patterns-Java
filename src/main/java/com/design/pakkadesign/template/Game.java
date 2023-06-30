package com.design.pakkadesign.template;

public abstract class Game {

  abstract void init();
  abstract void start();

  public void play() {
    init();
    start();
  }

}
