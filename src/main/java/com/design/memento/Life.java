package com.design.memento;

public class Life {

  private String time;

  public void setTime(String time) {
    this.time = time;
  }

  public Memento saveTime() {
    System.out.println("Saved to memnto");
    return new Memento(time);
  }


  public void restore(Memento memento) {
    this.time = memento.getSavedTime();
    System.out.println("Time now "+time);
  }


}
