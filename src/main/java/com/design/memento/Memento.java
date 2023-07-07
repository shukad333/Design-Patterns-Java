package com.design.memento;

public class Memento {

  private final String time;

  public Memento(String time) {
    this.time = time;
  }

  public String getSavedTime() {
    return time;
  }

}
