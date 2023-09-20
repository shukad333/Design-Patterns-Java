package com.sd.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

  List<Item> itemList = new ArrayList<>();

  public void addItem(Item i) {
    itemList.add(i);
  }

}
