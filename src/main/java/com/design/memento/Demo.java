package com.design.memento;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {

    List<Memento> mementos = new ArrayList<>();

    Life life = new Life();
    life.setTime("1992");
    mementos.add(life.saveTime());
    life.setTime("1993");
    mementos.add(life.saveTime());

    life.restore(mementos.get(0));
  }

}
