package com.cc.dd.aa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComparatorCompEx {

  public static void main(String[] args) {
    Comparator<String> comparator = (a,b)->a.length()-b.length();
    List<String> l = Arrays.asList("Sh", "y", "poo", "p");
    System.out.println(l);
    Collections.sort(l,comparator);
    System.out.println(l);

    l.stream().peek(System.out::println).collect(Collectors.toList());
  }

}
